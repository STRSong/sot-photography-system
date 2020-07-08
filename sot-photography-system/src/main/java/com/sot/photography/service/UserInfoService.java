package com.sot.photography.service;

import com.sot.photography.bean.Userinfo;
import com.sot.photography.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 宋佳敏STRSong
 * @Date 2020/3/29 20:10
 * @Version 1.0
 **/
@Service
public class UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;

    //根据用户详情id查找
    public Userinfo getUserinfoByUserinfoId(Integer id){
        Userinfo userinfo = userInfoMapper.getUserinfoByUserinfoId(id);
        return userinfo;
    }

    //根据用户Id查找
    public Userinfo getUserinfoByUserId(Integer id){
        Userinfo userinfo = userInfoMapper.getUserinfoByUserId(id);
        return userinfo;
    }

    //插入用户详情信息
    public int insertUserinfo(Userinfo userinfo){
        userInfoMapper.insertUserinfo(userinfo);
        Integer userInfoId = userinfo.getUserInfoId();
        return userInfoId;
    }

    //根据用户详情id删除用户详情信息
    public int deleteUserinfoByUserInfoId(Integer id){
        int res = userInfoMapper.deleteUserinfoByUserInfoId(id);
        return res;
    }

    //根据用户id删除用户详情信息
    public int deleteUserinfoByUserId(Integer id){
        Integer res = userInfoMapper.deleteUserinfoByUserId(id);
        return res;
    }

    //更新用户详情表信息
    public void updateUserinfo(Userinfo userinfo){
        userInfoMapper.updateUserinfo(userinfo);
    }

    //更新用户头像
    public void updateUserHeaderImage(Userinfo userinfo){
        userInfoMapper.updateUserHeaderImage(userinfo);
    }

}
