package com.sot.photography.mapper;

import com.sot.photography.bean.Parameter;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author 宋佳敏STRSong
 * @Date 2020/4/13 21:43
 * @Version 1.0
 **/
public interface ParameterMapper {

    //查询所有参数
    @Select("select * from parameter;")
    public List<Parameter> getAllParameter();

    //根据参数类型查询参数
    @Select("select * from parameter WHERE parameterType = #{parameterType} ;")
    public List<Parameter> getParameterByType(@Param("parameterType") String parameterType);

    //根据id查询参数
    @Select("select * from parameter WHERE parameterId = #{id} ;")
    public Parameter getPatraMeterById(Integer id);

    //添加参数信息
    @Options(useGeneratedKeys = true,keyProperty = "parameterId",keyColumn = "id")
    @Insert("insert into parameter (parameterType, parameterContent, paramaterMark, paramaterPrice, paramaterDescribe) " +
            "values (#{parameterType} ,#{parameterContent} ,#{paramaterMark} ,#{paramaterPrice} ,#{paramaterDescribe} );")
    public int insertParameter(Parameter parameter);

    //g根据id更新参数信息
    @Update("update parameter set parameterType = #{parameterType} ,parameterContent = #{parameterContent} , paramaterMark = #{paramaterMark} ," +
            " paramaterPrice = #{paramaterPrice} , paramaterDescribe = #{paramaterDescribe}  where parameterId = #{parameterId}  ;")
    public int updateParamater(Parameter parameter);

    //根据id删除参数信息
    @Delete("DELETE FROM parameter WHERE parameterId = #{id} ;")
    public int deleteParamater(Integer id);

}
