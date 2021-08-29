package com.prince.mall.goods.controller;

import com.prince.mall.goods.entity.SkuAttribute;
import com.prince.mall.goods.service.SkuAttributeService;
import com.prince.mall.util.RespResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.controller <br\>
 * <p>
 * Description : Sku属性控制器 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/29 12:44
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("skuAttribute")
public class SkuAttributeController {

    private final SkuAttributeService skuAttributeService;

    @GetMapping("{categoryId}")
    public RespResult<List<SkuAttribute>> getListByCategoryId(@PathVariable Integer categoryId) {
        long start = System.nanoTime();
        RespResult ok = RespResult.ok(skuAttributeService.queryListByCategoryId(categoryId));
        long end = System.nanoTime();
        System.out.println(end - start);
        return ok;
    }
}
