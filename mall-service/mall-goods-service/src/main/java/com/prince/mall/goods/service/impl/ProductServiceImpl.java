package com.prince.mall.goods.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.prince.mall.goods.entity.*;
import com.prince.mall.goods.mapper.BrandMapper;
import com.prince.mall.goods.mapper.CategoryMapper;
import com.prince.mall.goods.mapper.SkuMapper;
import com.prince.mall.goods.mapper.SpuMapper;
import com.prince.mall.goods.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.Map;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.service.impl <br\>
 * <p>
 * Description : spu实现 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/29 17:12
 */
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final SpuMapper spuMapper;

    private final SkuMapper skuMapper;

    private final BrandMapper brandMapper;

    private final CategoryMapper categoryMapper;

    @Override
    @Transactional
    public void saveProduct(Product product) {
        Spu spu = product.getSpu();
        //判断是添加还是修改
        if (StringUtils.isEmpty(spu.getId())) {
            //是否上架 1，已上架 0，未上架或已下架
            spu.setIsMarketable(1);
            //是否删除 0，未删除 1，已删除
            spu.setIsDelete(0);
            //审核状态，0：未审核，1：已审核，2：审核不通过
            spu.setStatus(1);
            //保存spu
            spuMapper.insert(spu);
        } else {
            //修改Spu信息
            spuMapper.updateById(spu);
            //删除所有SKU信息
            skuMapper.delete(new QueryWrapper<Sku>().eq("spu_id",spu.getId()));
        }

        //保存Sku集合
        Date date = new Date();
        //查询品牌信息
        Brand brand = brandMapper.selectById(spu.getBrandId());
        //查询分类信息
        Category category = categoryMapper.selectById(spu.getCategoryThreeId());
        product.getSkus().forEach(sku -> {
            //处理sku名称 = spu名称加上属性
            StringBuilder name = new StringBuilder(spu.getName());
            Map<String, String> attributes = JSON.parseObject(sku.getSkuAttribute(), Map.class);
            for(Map.Entry<String, String> entry : attributes.entrySet()) {
                name.append(" ").append(entry.getValue());
            }
            //sku名称
            sku.setName(name.toString());
            //创建时间
            sku.setCreateTime(date);
            //修改时间
            sku.setUpdateTime(date);
            //分类id
            sku.setCategoryId(spu.getCategoryThreeId());
            //分类名称
            sku.setCategoryName(category.getName());
            //品牌id
            sku.setBrandId(spu.getBrandId());
            //品牌名称
            sku.setBrandName(category.getName());
            //spuId
            sku.setSpuId(spu.getId());
            //商品状态 1-正常，2-下架，3-删除
            sku.setStatus(1);
            //保存sku
            skuMapper.insert(sku);
        });
    }
}
