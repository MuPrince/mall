package com.prince.mall.cart.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Project mall <br\>
 * Package com.prince.mall.cart.entity <br\>
 * <p>
 * Description : 购物车实体 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/9/6 21:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart implements Serializable {
    /**
     * id
     */
    @Id
    private String id;
    /**
     * 用户名字
     */
    private String userName;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品价格
     */
    private Double price;
    /**
     * 商品图片
     */
    private String image;
    /**
     * 商品ID
     */
    private String skuId;
}
