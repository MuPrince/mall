package com.prince.mall.goods.controller;

import com.prince.mall.goods.entity.AdItems;
import com.prince.mall.goods.entity.Sku;
import com.prince.mall.goods.service.AdItemsService;
import com.prince.mall.util.RespResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.controller <br\>
 * <p>
 * Description : 推广产品控制器 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/29 18:11
 */
@RestController
@RequestMapping("adItems")
@RequiredArgsConstructor
public class AdItemsController {

    private final AdItemsService adItemsService;

    @GetMapping("type/{type}")
    public RespResult<List<Sku>> getAdItemsByType(@PathVariable Integer type) {
        return RespResult.ok(adItemsService.queryAdItemsByType(type));
    }

    @DeleteMapping("{id}")
    public RespResult deleteAdItemsById(@PathVariable Integer id) {
        adItemsService.deleteAdItems(id);
        return RespResult.ok();
    }

    @PutMapping("save")
    public RespResult saveAdItems(@RequestBody AdItems adItems) {
        adItemsService.saveAdItems(adItems);
        return RespResult.ok();
    }
}
