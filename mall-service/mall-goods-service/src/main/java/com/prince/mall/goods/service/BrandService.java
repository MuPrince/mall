package com.prince.mall.goods.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.prince.mall.goods.entity.Brand;

import java.util.List;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.mapper <br\>
 * <p>
 * Description : 品牌Service <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/7/7 6:36
 */
public interface BrandService extends IService<Brand> {

    /**
     * Description :  条件查询
     * @param brand 品牌信息
     * @return java.util.List<com.prince.mall.goods.entity.Brand>
     * @since 2021/7/7 7:46
     * @author StrangePrince
     */
    List<Brand> queryList(Brand brand);

    /**
     * Description :  分页查询
     * @param brand {@link Brand}品牌信息
     * @return com.baomidou.mybatisplus.extension.plugins.pagination.Page<com.prince.mall.goods.entity.Brand>
     * @since 2021/7/7 8:08
     * @author StrangePrince
     */
    Page<Brand> queryPage(Brand brand, Long currentPage, Long size);

    /**
     * Description :  根据分类ID查询品牌集合
     * @param categoryId  分类id
     * @return java.util.List<com.prince.mall.goods.entity.Brand>
     * @throws
     * @since 2021/8/29 0:45
     * @author StrangePrince
     */
    List<Brand> queryListByCategoryId(Integer categoryId);
}
