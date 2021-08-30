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

    /**
     * Description : 根据id删除推广产品
     * @param ids
     * @return void
     * @throws
     * @since 2021/8/30 21:45
     * @author StrangePrince
     */
    void deleteAdItems(Integer... ids);

    /**
     * Description :  保存推广产品信息
     * @param adItems
     * @return void
     * @throws
     * @since 2021/8/30 22:01
     * @author StrangePrince
     */
    void saveAdItems(AdItems adItems);
}
