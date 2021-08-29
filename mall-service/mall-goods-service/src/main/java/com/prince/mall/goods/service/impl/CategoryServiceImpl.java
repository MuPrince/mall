package com.prince.mall.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.prince.mall.goods.entity.Category;
import com.prince.mall.goods.mapper.CategoryMapper;
import com.prince.mall.goods.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.service.impl <br\>
 * <p>
 * Description : 分类信息Service实现 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/28 23:16
 */
@Service
@AllArgsConstructor
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    private final CategoryMapper categoryMapper;

    @Override
    public List<Category> queryByParentId(Integer parentId) {
        //构建查询条件
        QueryWrapper<Category> query = new QueryWrapper<>();
        query.eq("parent_id",parentId);

        return categoryMapper.selectList(query);
    }
}
