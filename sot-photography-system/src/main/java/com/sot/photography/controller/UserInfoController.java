package com.sot.photography.controller;

import com.sot.photography.bean.User;
import com.sot.photography.bean.Userinfo;
import com.sot.photography.service.UserInfoService;
import com.sot.photography.service.UserService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class UserInfoController {

    @Autowired
    UserService userService;
    @Autowired
    UserInfoService userInfoService;

    @GetMapping("/user/userInfo_index")
    public String toUserInfo(){
        return "/user/userInfo_index";
    }

    @ResponseBody
    @PostMapping("/upImage")
    public Map<String,Object> uplaod(HttpServletRequest request, @RequestParam("userHeaderImage") MultipartFile file, Model model) {
        //1. 接受上传的文件  @RequestParam("file") MultipartFile file
        Map<String,Object> json = new HashMap<String, Object>();
        String saveUrl;//存储相对位置
        String saveRelUrl;//存储绝对位置
        String date;//上传时间
        try {
            System.out.println("文件名称："+file.getOriginalFilename());
            System.out.println("文件类型"+file.getContentType());
            System.out.println("文件大小："+file.getSize());
            //1.获取时间戳
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            //2.获取图片上传后存储文件夹的位置,由相对获取绝对位置
            String upPath = request.getServletContext().getRealPath("/files");
            //3.获取上传文件名字
            String upFileName = file.getOriginalFilename();
            //4.获取文件后缀类型
            String extension = FilenameUtils.getExtension(upFileName);

            //创建时间文件夹
            String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            // 新建文件
            File file1 = new File(upPath, format);
            // 判断路径是否存在，如果不存在就创建一个
            if(!file1.exists()) file1.mkdirs();

            //5.生成新的文件名
            String newFileNamePrefix = UUID.randomUUID().toString().replace("-","")+
                    new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
            String newFileName = "headImage"+"."+extension;
            //String newFileName = newFileNamePrefix+"."+extension;
            File saveFile = new File(file1,newFileName);
            //写入文件src/main/webapp/files/2020-03-25/headImage.jpg
            file.transferTo(saveFile);
            String test= request.getContextPath();
            //存储的相对位置，配置静态资源映射，将webapp/files文件夹进行映射
            saveUrl = "/files/"+format+"/"+newFileName;
//            存储的绝对位置
            saveRelUrl = upPath+"/files/"+format+"/"+newFileName;

            //存入数据库中
            Userinfo userinfo = new Userinfo();
            HttpSession session = request.getSession();
            Integer userId = (Integer)session.getAttribute("userId");
            System.out.println(userId);
            userinfo.setUserId(userId);
            userinfo.setUserHeaderImage(saveUrl);
            userInfoService.updateUserHeaderImage(userinfo);
            session.setAttribute("userHeaderImage",userinfo.getUserHeaderImage());

            model.addAttribute("saveUrl",saveUrl);
            System.out.println(saveUrl);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            json.put("fail",e.getMessage());
            return json;
        } catch (IOException e) {
            e.printStackTrace();
            json.put("fail",e.getMessage());
            return json;
        }
        json.put("success","成功");
        json.put("imageUrl",saveRelUrl);
        json.put("date",date);
        return json;
    }

    @PostMapping("/updateUserInfo")
    public String updateUserInfo(Userinfo userinfo, User user, HttpServletRequest request){
        HttpSession session = request.getSession();
        String userHeaderImage = session.getAttribute("userHeaderImage").toString();
        Integer userVip = (Integer)session.getAttribute("userVip");
        userinfo.setUserHeaderImage(userHeaderImage);
        userinfo.setUserVip(userVip);
        userService.updateUserInfo(user);
        userInfoService.updateUserinfo(userinfo);
        session.setAttribute("userName",user.getUserName());
        session.setAttribute("userHeaderImage",userinfo.getUserHeaderImage());
        session.setAttribute("userSex",userinfo.getUserSex());
        session.setAttribute("userAddress",userinfo.getUserAddress());
        session.setAttribute("userNote",userinfo.getUserNote());
        session.setAttribute("userVip",userinfo.getUserVip());
        session.setAttribute("userBirth",userinfo.getUserBirth());

        return "/user/userInfo_info";
    }


}
