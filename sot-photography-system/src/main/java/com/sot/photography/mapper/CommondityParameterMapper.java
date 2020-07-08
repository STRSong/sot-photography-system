package com.sot.photography.mapper;

import com.sot.photography.bean.Commodityparameter;
import org.apache.ibatis.annotations.*;

/**
 * @Author 宋佳敏STRSong
 * @Date 2020/4/13 21:26
 * @Version 1.0
 **/
public interface CommondityParameterMapper {

    //根据商品id获取商品参数信息
    @Select("select * from commodityparameter WHERE commodityId = #{id} ;")
    public Commodityparameter getCommodityparameterByCommodityId(Integer id);

    //添加商品参数信息
    @Options(useGeneratedKeys = true,keyProperty = "commodityParameterId",keyColumn = "id")
    @Insert("insert into commodityparameter (commodityId, clothing, makeup, headdress, shootingStyle, view , style, photographer) " +
            "values (#{commodityId} ,#{clothing} ,#{makeup} ,#{headdress} ,#{shootingStyle} ,#{view} ,#{style} ,#{photographer} );")
    public int insertCommodityparameter(Commodityparameter commodityparameter);

    //根据商品id修改商品参数信息
    @Update("update commodityparameter set clothing = #{clothing} ,makeup = #{makeup} ,headdress = #{headdress} ,shootingStyle = #{shootingStyle} ," +
            "view = #{view} ,style=#{style} ,photographer = #{photographer}  where commodityId = #{commodityId}  ;")
    public int updateCommodityParameter(Commodityparameter commodityparameter);

    //根据商品id删除商品参数信息
    @Delete("DELETE FROM commodityparameter WHERE commodityId = #{id} ;")
    public int deleteCommodityParameter(Integer id);

}
