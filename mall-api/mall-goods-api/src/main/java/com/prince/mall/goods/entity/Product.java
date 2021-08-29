package com.prince.mall.goods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.entity <br\>
 * <p>
 * Description : 产品 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/28 22:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    /**
     * Spu
     */
    private Spu spu;
    /**
     * Sku
     */
    private List<Sku> skus;
}
