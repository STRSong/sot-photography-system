package com.sot.photography.mapper;

import com.sot.photography.bean.Commodity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author 宋佳敏STRSong
 * @Date 2020/4/13 17:24
 * @Version 1.0
 **/
public interface CommodityMapper {

    //查询所有商品
    @Select("select * from commodity;")
    public List<Commodity> getAllCommodities();

    //通过id查找商品
    @Select("select * from commodity WHERE commodityId=#{id} ;")
    public Commodity getCommodityById(Integer id);

    //通过名称模糊查找商品
    @Select("select * from commodity WHERE commodityName LIKE #{commodityName} ;")
    public List<Commodity> getCommodityByName(@Param("commodityName") String commodityName);

    //添加商品信息
    @Options(useGeneratedKeys = true,keyProperty = "commodityId",keyColumn = "id")
    @Insert("insert into commodity (commodityName, commodityPrice, commoditySell, commodityAuthor, commodityOther)" +
            " values (#{commodityName} ,#{commodityPrice} ,#{commoditySell} ,#{commodityAuthor} ,#{commodityOther}  );")
    public int insertCommondity(Commodity commodity);

    //更新商品信息
    @Update("update commodity set commodityName = #{commodityName} ,commodityPrice = #{commodityPrice} ,commoditySell = #{commoditySell} ," +
            "commodityAuthor =  #{commodityAuthor} , commodityOther = #{commodityOther}  where commodityId = #{commodityId} ;")
    public int updateCommodity(Commodity commodity);

    //更新商品已售数量
    @Update("update commodity set commoditySell = #{sellNumber}  where commodityId = #{id} ;")
    public int updateCommoditySell(@Param("sellNumber") Integer sellNumber,@Param("id") Integer id);

    //通过id删除商品
    @Delete("DELETE FROM commodity WHERE commodityId = #{id} ;")
    public int deleteCommodity(Integer id);
}
