package com.prince.mall.goods.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.prince.mall.goods.entity.AdItems;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.mapper <br\>
 * <p>
 * Description :  首页推广商品Mapper<br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/28 22:20
 */
public interface AdItemsMapper extends BaseMapper<AdItems> {

    @Select("SELECT sku_id FROM ad_items WHERE type = #{type}")
    List<String> findSkuIdsByAdItemsType(Integer type);
}
