package com.prince.mall.cart.mapper;

import com.mongodb.client.MongoClient;
import com.prince.mall.cart.entity.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Project mall <br\>
 * Package com.prince.mall.cart <br\>
 * <p>
 * Description : 购物车持久层 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/9/6 22:26
 */
public interface CartMapper extends MongoRepository<Cart, String> {
}
