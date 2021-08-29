package com.prince.mall.goods.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.prince.mall.goods.entity.AdItems;
import com.prince.mall.goods.entity.Sku;

import java.util.List;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.service <br\>
 * <p>
 * Description : 首页推广产品Service <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/28 22:22
 */
public interface AdItemsService extends IService<AdItems> {

    /**
     * Description : 根据推广产品类型查询推广产品列表
     * @param adItemsType 推广产品类型
     * @return java.util.List<com.prince.mall.goods.entity.Sku>
     * @throws
     * @since 2021/8/29 21:23
     * @author StrangePrince
     */
    List<Sku> queryAdItemsByType(Integer adItemsType);
}
