package com.prince.mall.goods.controller;

import com.prince.mall.goods.entity.Product;
import com.prince.mall.goods.service.ProductService;
import com.prince.mall.util.RespResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.controller <br\>
 * <p>
 * Description : spu控制器 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/29 17:15
 */
@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    /**
     * Description :  保存商品信息
     * @param product 产品信息，包括SPU和SKU集合{@link Product}
     * @see com.prince.mall.goods.entity.Spu
     * @see com.prince.mall.goods.entity.Sku
     * @return com.prince.mall.util.RespResult
     * @throws
     * @since 2021/8/29 17:55
     * @author StrangePrince
     */
    @PostMapping("save")
    public RespResult saveProduct(@RequestBody Product product) {
        productService.saveProduct(product);
        return RespResult.ok();
    }
}
