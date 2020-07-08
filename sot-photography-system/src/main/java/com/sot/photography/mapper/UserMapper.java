package com.sot.photography.mapper;

import com.sot.photography.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("SELECT * FROM user WHERE userId=#{id}")
    public User getUserByUserId(Integer id);

    @Select("SELECT * FROM user")
    public List<User> getAllUser();


    @Options(useGeneratedKeys=true, keyProperty="userId", keyColumn="id")
    @Insert("INSERT INTO user(userName, userPassword, userEmail, userTel,role) VALUES (#{userName} ,#{userPassword} ,#{userEmail} ,#{userTel} ,#{role} )")
    public int insertUser(User user);


    @Delete("DELETE FROM user WHERE userId=#{id} ")
    public int deleteUserByUserId(Integer id);

    @Update("UPDATE user set userName=#{userName} ,userPassword=#{userPassword} ,userEmail=#{userEmail} ,userTel=#{userTel},role=#{role} WHERE userId=#{userId} ")
    public int updateUser(User user);

    @Update("UPDATE user set userName=#{userName} ,userEmail=#{userEmail} ,userTel=#{userTel} WHERE userId=#{userId} ")
    public int updateUserInfo(User user);


    //用户登录验证
    @Select("SELECT * FROM user WHERE userName=#{name} AND userPassword=#{password}")
    public User checkUser(@Param("name") String name,@Param("password") String password);

    //验证手机是否重复注册
    @Select("SELECT * FROM user WHERE userTel=#{tel}")
    public User checkUserTel(@Param("tel") String tel);

}
