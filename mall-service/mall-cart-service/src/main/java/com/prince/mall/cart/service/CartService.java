package com.prince.mall.cart.service;

import com.prince.mall.cart.entity.Cart;

/**
 * Project mall <br\>
 * Package com.prince.mall.cart.service <br\>
 * <p>
 * Description : 购物车服务层接口 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/9/6 22:29
 */
public interface CartService {

   /**
    * Description : 加入购物车
    * @param id SkuId商品id
    * @param num 数量
    * @return java.lang.Boolean
    * @throws
    * @since 2021/9/6 22:34
    * @author StrangePrince
    */
   void add(String id, Integer num);

    /**
     * Description :  修改购物车商品
     * @param id SkuId商品id
     * @param num 数量
     * @return void
     * @throws
     * @since 2021/9/6 22:31
     * @author StrangePrince
     */
    void update(String id, Integer num);

    /**
     * Description :  删除购物车商品
     * @param id SkuId商品id
     * @return void
     * @throws
     * @since 2021/9/6 22:32
     * @author StrangePrince
     */
    void del(String id);

    void test();
}
