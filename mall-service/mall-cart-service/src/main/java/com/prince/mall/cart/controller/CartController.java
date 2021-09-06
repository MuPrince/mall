package com.prince.mall.cart.controller;

import com.prince.mall.cart.service.CartService;
import com.prince.mall.util.RespResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * Project mall <br\>
 * Package com.prince.mall.cart.controller <br\>
 * <p>
 * Description : 购物车控制器 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/9/6 22:54
 */
@RestController
@RequestMapping("cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @PostMapping("add")
    public RespResult add(@RequestParam String id, @RequestParam Integer num) {
        cartService.add(id, num);
        return RespResult.ok();
    }
}
