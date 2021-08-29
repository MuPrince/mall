package com.prince.mall.goods.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.prince.mall.goods.entity.SkuAttribute;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.mapper <br\>
 * <p>
 * Description : SKU属性Mapper <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/29 12:41
 */
public interface SkuAttributeMapper extends BaseMapper<SkuAttribute> {

    /**
     * Description :  根据分类Id查询Sku属性Id集合
     * @param categoryId 分类Id
     * @return java.util.List<java.lang.Integer>
     * @throws
     * @since 2021/8/29 12:54
     * @author StrangePrince
     */
    @Select("SELECT attr_id FROM category_attr WHERE category_id = #{categoryId}")
    List<Integer> findIdsByCategoryId(Integer categoryId);

    /**
     * Description :  根据分类ID查询SKU属性集合
     * @param categoryId 分类ID
     * @return java.util.List<com.prince.mall.goods.entity.SkuAttribute>
     * @throws
     * @since 2021/8/29 13:26
     * @author StrangePrince
     */
    @Select("SELECT id,options,name,sort FROM category_attr c LEFT JOIN sku_attribute s ON c.attr_id = s.id WHERE category_id = #{categoryId}")
    List<SkuAttribute> findSkuAttributesByCategoryId(Integer categoryId);
}
