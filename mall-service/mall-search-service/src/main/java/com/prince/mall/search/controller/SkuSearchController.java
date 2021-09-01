package com.prince.mall.search.controller;

import com.prince.mall.search.entity.SkuEs;
import com.prince.mall.search.service.SkuSearchService;
import com.prince.mall.util.RespResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * Project mall <br\>
 * Package com.prince.mall.search.controller <br\>
 * <p>
 * Description : sku搜索控制器 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/9/1 22:13
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("skuSearch")
public class SkuSearchController {

    private final SkuSearchService skuSearchService;

    /**
     * Description :  添加索引
     * @param skuEs {@link SkuEs}
     * @return com.prince.mall.util.RespResult
     * @throws
     * @since 2021/9/1 22:17
     * @author StrangePrince
     */
    @PostMapping("add")
    public RespResult add(@RequestBody SkuEs skuEs) {
        skuSearchService.add(skuEs);
        return RespResult.ok();
    }

    /**
     * Description : 删除索引
     * @param id
     * @return com.prince.mall.util.RespResult
     * @throws
     * @since 2021/9/1 22:19
     * @author StrangePrince
     */
    @DeleteMapping("{id}")
    public RespResult del(@PathVariable String id) {
        skuSearchService.del(id);
        return RespResult.ok();
    }
}
