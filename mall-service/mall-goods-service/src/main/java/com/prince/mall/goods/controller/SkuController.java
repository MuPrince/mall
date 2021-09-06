package com.prince.mall.goods.controller;

import com.prince.mall.goods.entity.Sku;
import com.prince.mall.goods.service.SkuService;
import com.prince.mall.util.RespResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.controller <br\>
 * <p>
 * Description : 商品SKU控制器 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/9/6 22:12
 */
@RestController
@RequestMapping("sku")
@RequiredArgsConstructor
public class SkuController {

    private final SkuService skuService;

    /**
     * Description :  根据ID查询商品详情
     * @param id
     * @return com.prince.mall.util.RespResult<com.prince.mall.goods.entity.Sku>
     * @throws
     * @since 2021/9/6 22:22
     * @author StrangePrince
     */
    @GetMapping("{id}")
    public RespResult<Sku> getSkuById(@PathVariable String id) {
        return RespResult.ok(skuService.getById(id));
    }
}
