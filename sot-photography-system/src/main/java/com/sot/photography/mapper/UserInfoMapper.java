package com.sot.photography.mapper;

import com.sot.photography.bean.User;
import com.sot.photography.bean.Userinfo;
import org.apache.ibatis.annotations.*;

/**
 * @Author 宋佳敏STRSong
 * @Date 2020/3/29 19:37
 * @Version 1.0
 **/
public interface UserInfoMapper {

    //根据用户详情id查找
    @Select("SELECT * FROM userinfo WHERE userInfoId=#{id} ")
    Userinfo getUserinfoByUserinfoId(Integer id);

    //根据用户Id查找
    @Select("SELECT  * FROM  userinfo WHERE userId=#{id} ")
    Userinfo getUserinfoByUserId(Integer id);

    //插入用户详情信息
    @Options(useGeneratedKeys = true,keyProperty = "userInfoId",keyColumn = "id")
    @Insert("INSERT INTO userinfo(userId, userHeaderImage,userRegisterTime) VALUES (#{userId} ,#{userHeaderImage} ,#{userRegisterTime} )")
    int insertUserinfo(Userinfo userinfo);

    //根据用户详情id删除用户详情信息
    @Delete("DELETE FROM userinfo WHERE userInfoId=#{id} ")
    int deleteUserinfoByUserInfoId(Integer id);

    //根据用户id删除用户详情信息
    @Delete("DELETE FROM userinfo WHERE userId=#{id} ")
    int deleteUserinfoByUserId(Integer id);

    //更新用户详情表信息
    @Update("UPDATE userinfo SET userHeaderImage=#{userHeaderImage} ,userSex=#{userSex} ,userAddress=#{userAddress}," +
            "userNote=#{userNote} ,userVip=#{userVip} ,userBirth=#{userBirth} WHERE userId=#{userId}")
    int updateUserinfo(Userinfo userinfo);

    //更新用户头像
    @Update("UPDATE userinfo SET userHeaderImage=#{userHeaderImage} WHERE userId=#{userId}")
    int updateUserHeaderImage(Userinfo userinfo);

}
