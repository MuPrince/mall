package com.prince.mall.goods.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.prince.mall.goods.entity.Brand;
import com.prince.mall.goods.service.BrandService;
import com.prince.mall.util.RespResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.controller <br\>
 * <p>
 * Description : 品牌控制器 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/7/7 6:43
 */
@RestController
//@AllArgsConstructor
@RequiredArgsConstructor
@RequestMapping("brand")
public class BrandController {

    private final BrandService brandService;

    /**
     * Description :  添加
     * @param brand
     * @return RespResult
     * @throws
     * @since 2021/7/7 7:01
     * @author StrangePrince
     */
    @PostMapping
    public RespResult add(@RequestBody Brand brand) {
        brandService.save(brand);
        return RespResult.ok();
    }

    /**
     * Description :  修改
     * @param brand
     * @return RespResult
     * @throws
     * @since 2021/7/7 7:01
     * @author StrangePrince
     */
    @PutMapping
    public RespResult update(@RequestBody Brand brand) {
        brandService.updateById(brand);
        return RespResult.ok();
    }

    /**
     * Description :  删除
     * @param id
     * @return RespResult
     * @throws
     * @since 2021/7/7 7:01
     * @author StrangePrince
     */
    @DeleteMapping("{id}")
    public RespResult delete(@PathVariable(value = "id") String id) {
        brandService.removeById(id);
        return RespResult.ok();
    }

    /**
     * Description :
     * @param
     * @return RespResult {@link RespResult}
     * @throws
     * @since 2021/7/7 7:43
     * @author StrangePrince
     */
    @GetMapping("list")
    public RespResult<List<Brand>> getList() {
        return RespResult.ok(brandService.list());
    }

    /**
     * Description :
     * @param
     * @return RespResult {@link RespResult}
     * @throws
     * @since 2021/7/7 7:43
     * @author StrangePrince
     */
    @PostMapping("search")
    public RespResult<List<Brand>> getList(@RequestBody Brand brand) {
        return RespResult.ok(brandService.queryList(brand));
    }

    /**
     * Description :
     * @param brand 品牌信息条件
     * @param page 当前页码
     * @param size 每页条数
     * @return RespResult {@link RespResult}
     * @throws
     * @since 2021/8/29 0:57
     * @author StrangePrince
     */
    @PostMapping("search/{page}/{size}")
    public RespResult<Page<Brand>> getPage(@RequestBody Brand brand, @PathVariable Long page, @PathVariable Long size) {
        return RespResult.ok(brandService.queryPage(brand, page, size));
    }

    /**
     * Description : 根据分类id查询品牌集合
     * @param categoryId 分类id
     * @return com.prince.mall.util.RespResult<java.util.List<com.prince.mall.goods.entity.Brand>> {@link RespResult}
     * @throws
     * @since 2021/8/29 1:03
     * @author StrangePrince
     */
    @GetMapping("{categoryId}")
    public RespResult<List<Brand>> getBrandsByCategoryId(@PathVariable Integer categoryId) {
        return RespResult.ok(brandService.queryListByCategoryId(categoryId));
    }
}
