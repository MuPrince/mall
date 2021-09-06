package com.prince.mall.cart.service.impl;

import com.prince.mall.cart.entity.Cart;
import com.prince.mall.cart.mapper.CartMapper;
import com.prince.mall.cart.service.CartService;
import com.prince.mall.goods.entity.Sku;
import com.prince.mall.goods.feign.SkuFeign;
import com.prince.mall.util.RespResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Project mall <br\>
 * Package com.prince.mall.cart.service.impl <br\>
 * <p>
 * Description : 购物车实现 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/9/6 22:36
 */
@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

    private final CartMapper cartMapper;

    private final SkuFeign skuFeign;

    @Override
    public void add(String id, Integer num) {
        String userName = "userName";
        if (num > 0) {
            //删除购物车中已有的记录
            cartMapper.deleteById(userName + id);
            //查询商品详情

            RespResult<Sku> skuResp = skuFeign.getSkuById(id);
            Sku sku = skuResp.getData();
            //TODO sku需要做非空判断
            //组装购物车信息
            Cart cart = new Cart();
            cart.setId(userName + id);
            cart.setUserName(userName);
            cart.setImage(sku.getImage());
            cart.setName(sku.getName());
            cart.setPrice(sku.getPrice());
            cart.setSkuId(id);
            cartMapper.save(cart);
        }
    }

    @Override
    public void update(String id, Integer num) {
        //TODO 业务代码
    }

    @Override
    public void del(String id) {
        //TODO 业务代码
    }
}
