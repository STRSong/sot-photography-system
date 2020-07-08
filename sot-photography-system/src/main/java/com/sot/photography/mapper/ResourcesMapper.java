package com.sot.photography.mapper;

import com.sot.photography.bean.Resources;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author 宋佳敏STRSong
 * @Date 2020/4/8 10:28
 * @Version 1.0
 **/
public interface ResourcesMapper {

    //查询所有资源
    @Select("SELECT * FROM resources")
    public List<Resources> getAllResources();

    //根据资源ID查询
    @Select("SELECT * FROM resources WHERE resourcesId = #{id}")
    public Resources getResourcesByResourcesId(Integer id);

    //根据种类查询资源
    @Select("SELECT * FROM resources WHERE resourcesClass = #{resourcesClass} ")
    public List<Resources> getrResourcesByResourcesClass(@Param("resourcesClass") String resourcesClass);

    //插入资源信息
    @Options(useGeneratedKeys = true,keyProperty = "resourcesId",keyColumn = "id")
    @Insert("INSERT INTO resources(commodityId,resourcesName, resourcesType, resourcesClass, resourcesAddress, resourcesDescribe, resourcesPeople, resourcesTime, resourcesSize) " +
            "VALUES (#{commodityId} ,#{resourcesName},#{resourcesType} ,#{resourcesClass} ,#{resourcesAddress} ,#{resourcesDescribe} ,#{resourcesDescribe} ,#{resourcesPeople} ,#{resourcesTime} ,#{resourcesSize}  )" )
    public int insertResources(Resources resources);

    //更新资源信息
    @Update("UPDATE resources SET commodityId = #{commodityId} , resourcesName = #{resourcesName} ,resourcesType = #{resourcesType} ,resourcesClass = #{resourcesClass} ,resourcesAddress = #{resourcesType} ," +
            "resourcesDescribe = #{resourcesDescribe} ,resourcesPeople = #{resourcesPeople} ,resourcesTime = #{resourcesTime} ,resourcesSize = #{resourcesSize} ")
    public int updateResources(Resources resources);

    //软删除
    @Update("UPDATE resources SET desoft = #{desoft} WHERE resourcesId = #{resourcesId} ")
    public int updateDesoft(@Param("resourcesId")Integer id,@Param("desoft") Integer desoft);

    //根据id删除资源
    @Delete("DELETE FROM resources WHERE resourcesId = #{id} ")
    public int deleteResources(Integer id);

}
