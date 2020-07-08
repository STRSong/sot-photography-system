package com.sot.photography.service;

import com.sot.photography.bean.User;
import com.sot.photography.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User getUserByUserId(Integer id){
        User user = userMapper.getUserByUserId(id);
        return user;
    }

    public List<User> getAllUser(){
        List<User> allUser = userMapper.getAllUser();
        return allUser;
    }

    public int deleteUserByUserId(Integer id){
        int result = userMapper.deleteUserByUserId(id);
        return result;
    }

    public void updateUser(User user){
        userMapper.updateUser(user);
    }

    public void updateUserInfo(User user){
        userMapper.updateUserInfo(user);
    }

    public User loginCheck(String name,String password){
        User user = userMapper.checkUser(name, password);
        return user;
    }

    //判断电话号码是否已注册
    public boolean checkUserTel(String tel){
        User user = userMapper.checkUserTel(tel);
        if(user!=null){
            return false;
        }else {
            return true;
        }
    }

    //注册
    public int insertUser(User user){
        userMapper.insertUser(user);
        Integer userId=-1;
        userId=user.getUserId();
        return userId;
    }



}
