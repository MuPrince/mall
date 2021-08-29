package com.prince.mall.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.prince.mall.goods.mapper.BrandMapper;
import com.prince.mall.goods.entity.Brand;
import com.prince.mall.goods.service.BrandService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.service <br\>
 * <p>
 * Description : 品牌接口实现 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/7/7 6:37
 */
@Service
@AllArgsConstructor
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

    private final BrandMapper brandMapper;

    @Override
    public List<Brand> queryList(Brand brand) {
        QueryWrapper<Brand> qw = new QueryWrapper<>();
        qw.like("name",brand.getName()).eq("initial",brand.getInitial());
        return brandMapper.selectList(qw);
    }

    @Override
    public Page<Brand> queryPage(Brand brand, Long currentPage, Long size) {
        QueryWrapper<Brand> qw = new QueryWrapper<>();
        qw.like("name",brand.getName());

        return brandMapper.selectPage(new Page<>(currentPage, size), qw);
    }

    @Override
    public List<Brand> queryListByCategoryId(Integer categoryId) {
        //根据分类id查询品牌ids集合
        List<Integer> brandIds = brandMapper.findBrandIdsByCategoryId(categoryId);
        if (brandIds != null && brandIds.size() > 0) {
            //根据品牌ids查询品牌
            return brandMapper.selectList(new QueryWrapper<Brand>().in("id",brandIds));
        }
        return null;
    }
}
