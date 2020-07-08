package com.sot.photography.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sot.photography.bean.User;
import com.sot.photography.bean.Userinfo;
import com.sot.photography.service.UserInfoService;
import com.sot.photography.service.UserService;
import com.sot.photography.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserInfoService userInfoService;

    @GetMapping(value = "/admin")
    public String toUserManage(Model model, @RequestParam("pageNum") Integer pageNum, HttpServletRequest request,HttpSession session){
        ////第一参数：第几页。 第二参数：每页几条。
        PageHelper.startPage(pageNum,2);
        List<User> allUser = userService.getAllUser();
        //显示几个页码
        PageInfo<User> pageInfo = new PageInfo<>(allUser,5);
        String page = new PageUtil<User>().getPageInfo(pageInfo,request);
        model.addAttribute("users",allUser);
        model.addAttribute("page",page);
        model.addAttribute("pageNum",pageNum);
        return "admin";
    }

//    @RequestMapping(value = "/admin")
//    public String toAdmin(Model model){
//        List<User> allUser = userService.getAllUser();
//        model.addAttribute("users",allUser);
//        return "admin";
//    }

    //登陆login
    @PostMapping(value = "/userLogin")
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("userPassword") String userPassword,
                        Map<String,Object> map,HttpSession session){
        User user = null;
        Userinfo userinfo = null;
        user = userService.loginCheck(userName, userPassword);
        if(user == null){
            String msg = "账号或密码错误！请重新输入";
            map.put("msg",msg);
            return "login";
        }else{
            userinfo = userInfoService.getUserinfoByUserId(user.getUserId());
            session.setAttribute("userId",user.getUserId());
            session.setAttribute("userName",user.getUserName());
            session.setAttribute("userTel",user.getUserTel());
            session.setAttribute("userEmail",user.getUserEmail());
            session.setAttribute("role",user.getRole());

            session.setAttribute("userHeaderImage",userinfo.getUserHeaderImage());
            session.setAttribute("userSex",userinfo.getUserSex());
            session.setAttribute("userAddress",userinfo.getUserAddress());
            session.setAttribute("userNote",userinfo.getUserNote());
            session.setAttribute("userVip",userinfo.getUserVip());
            session.setAttribute("userBirth",userinfo.getUserBirth());
            map.clear();
            if(user.getRole().equals(2)){
                return "redirect:/test.html";
            }else if (user.getRole().equals(3)){
                return "redirect:/admin?pageNum=1";
            }
            return "redirect:/index.html";
        }
    }

    //注册register
    @PostMapping(value ="/userRegister")
    public String userRegister(User user,Map map){
        //System.out.println(user);
        user.setRole(1);
        boolean mark = userService.checkUserTel(user.getUserTel());
        if(mark==false){
            String msg="该手机号码已注册！";
            map.put("msg",msg);
            return "register";
        }
        map.clear();
        int userId = userService.insertUser(user);
        Userinfo userinfo = new Userinfo();
        String userHeaderImage = "/images/header.jpg";
        String userRegisterTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        userinfo.setUserId(userId);
        userinfo.setUserHeaderImage(userHeaderImage);
        userinfo.setUserRegisterTime(userRegisterTime);
        int userinfoId = userInfoService.insertUserinfo(userinfo);
        //System.out.println(userId);
        System.out.println(userinfoId);
        return "login";
    }

    //注销
    @RequestMapping(value ="/loginout")
    public String loingout(HttpSession session){
        session.invalidate();
        return "index";
    }

    //用户添加
    @PostMapping(value ="/userAdd")
    public String userAdd(User user,Map map,HttpSession session,@RequestParam("pageNum") Integer pageNum){
        boolean mark = userService.checkUserTel(user.getUserTel());
        if(mark==false){
            String msg="用户添加失败,该手机号码已被使用注册了！";
            map.put("msg",msg);
            return "forward:/admin?pageNum="+pageNum;
        }
        map.clear();
        int userId = userService.insertUser(user);
        Userinfo userinfo = new Userinfo();
        String userHeaderImage = "/images/header.jpg";
        String userRegisterTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        userinfo.setUserId(userId);
        userinfo.setUserHeaderImage(userHeaderImage);
        userinfo.setUserRegisterTime(userRegisterTime);
        int userinfoId = userInfoService.insertUserinfo(userinfo);
        session.setAttribute("mark","addSuccess");
        return "redirect:/admin?pageNum="+pageNum;
    }

    //用户删除
    @DeleteMapping("/userDelete/{userId}")
    public String userDelete(@PathVariable("userId") Integer userId,HttpSession session){
        //System.out.println(userId);
        userService.deleteUserByUserId(userId);
        session.setAttribute("mark","deleteSuccess");
        return "redirect:/admin?pageNum=1";
    }


    //清除响应标记
    @ResponseBody
    @PostMapping(value = "/markClear")
    public void  markClear(HttpSession session){
        session.removeAttribute("click");
        session.removeAttribute("mark");
    }

    @GetMapping("/refresh")
    public String refresh(HttpSession session,@RequestParam("pageNum") Integer pageNum){
        session.removeAttribute("click");
        session.removeAttribute("mark");
        return "redirect:/admin?pageNum="+pageNum;
    }


    //用户编辑
    @GetMapping(value = "/userEdit/{userId}")
    public String userEdit(@PathVariable("userId") Integer userId,HttpSession session,@RequestParam("pageNum") Integer pageNum){
        //System.out.println(111);
        User user = userService.getUserByUserId(userId);
        session.setAttribute("click","click");
        session.setAttribute("editUser",user);
        session.removeAttribute("mark");
        return "redirect:/admin?pageNum="+pageNum;
    }

    //用户编辑后保存
    @PostMapping("/userEditSave")
    public String userEditSave(User user,Map map,HttpSession session,@RequestParam("pageNum") Integer pageNum){
        session.removeAttribute("editUser");
        session.removeAttribute("click");
        userService.updateUser(user);
        session.setAttribute("mark","editSuccess");
        return "redirect:/admin?pageNum="+pageNum;
    }

}
