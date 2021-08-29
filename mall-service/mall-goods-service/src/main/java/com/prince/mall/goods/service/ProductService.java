package com.prince.mall.goods.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.prince.mall.goods.entity.Product;
import com.prince.mall.goods.entity.Spu;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.service <br\>
 * <p>
 * Description : spu <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/29 17:12
 */
public interface ProductService {

    /**
     * Description :  保存商品信息
     * @param product {@link Product}产品信息
     * @return void
     * @throws 
     * @since 2021/8/29 17:20
     * @author StrangePrince
     */
    void saveProduct(Product product);
}
