package com.prince.mall.goods.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.prince.mall.goods.entity.Brand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.mapper <br\>
 * <p>
 * Description : 品牌Mapper接口 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/7/7 6:14
 */
public interface BrandMapper extends BaseMapper<Brand> {

    /**
     * 根据分类ID查找品牌ID
     * @param categoryId
     * @return
     */
    @Select("SELECT brand_id FROM category_brand WHERE category_id = #{categoryId}")
    List<Integer> findBrandIdsByCategoryId(Integer categoryId);

}
