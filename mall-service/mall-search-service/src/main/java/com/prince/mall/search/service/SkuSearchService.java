package com.prince.mall.search.service;

import com.prince.mall.search.entity.SkuEs;

/**
 * Project mall <br\>
 * Package com.prince.mall.search.service <br\>
 * <p>
 * Description : Sku搜索服务接口 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/9/1 22:07
 */
public interface SkuSearchService {
    /**
     * Description : 增加索引
     * @param skuEs {@link SkuEs}
     * @since 2021/9/1 22:09
     * @author StrangePrince
     */
    void add(SkuEs skuEs);

    /**
     * Description :  删除索引
     * @param id 主键
     * @since 2021/9/1 22:09
     * @author StrangePrince
     */
    void del(String id);
}
