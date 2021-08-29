package com.prince.mall.goods.controller;

import com.prince.mall.goods.entity.Category;
import com.prince.mall.goods.service.CategoryService;
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
 * Description : 分类控制层Controller <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/28 23:20
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("category")
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("parent/{id}")
    public RespResult<List<Category>> getByParentId(@PathVariable Integer id) {
        return RespResult.ok(categoryService.queryByParentId(id));
    }
}
