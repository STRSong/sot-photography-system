package com.sot.photography.mapper;

import com.sot.photography.bean.Commodityinfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author 宋佳敏STRSong
 * @Date 2020/4/13 21:10
 * @Version 1.0
 **/
public interface CommodityInfoMapper {

    //通过商品id查找商品展示信息
    @Select("select * from commodityinfo WHERE commondityId = #{id} ;")
    public List<Commodityinfo> getCommodityinfoByCommodityId(Integer id);

    //查询所有商品展示信息
    @Select("select * from commodityinfo;")
    public List<Commodityinfo> getAllCommodityinfo();

    //插入商品展示信息
    @Options(useGeneratedKeys = true,keyProperty = "commodityInfoId",keyColumn = "id")
    @Insert("insert into commodityinfo (commondityId, commodityDataType, commondityData, commodityDescribe) " +
            "values (#{commondityId} ,#{commodityDataType} ,#{commondityData} ,#{commodityDescribe} );")
    public int insertCommodityInfo(Commodityinfo commodityinfo);

    //根据id更新商品展示信息
    @Update("update commodityinfo set commondityId = #{commondityId} ,commodityDataType = #{commodityDataType} ,commondityData = #{commondityData}, " +
            "commodityDescribe = #{commodityDescribe}  where commodityInfoId = #{commodityInfoId} ;")
    public int updateCommodityInfo(Commodityinfo commodityInfo);

    //根据id删除商品展示信息
    @Delete("DELETE FROM commodityinfo WHERE commodityInfoId = #{id} ;")
    public int deleteCommodityInfo(Integer id);

}
