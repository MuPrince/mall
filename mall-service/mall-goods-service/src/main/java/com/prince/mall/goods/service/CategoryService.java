package com.prince.mall.goods.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.prince.mall.goods.entity.Category;

import java.util.List;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.service <br\>
 * <p>
 * Description : 分类Service <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/28 23:13
 */
public interface CategoryService extends IService<Category> {

    /**
     * 根据父ID查询分类信息
     * @param parentId 分类父ID
     * @return
     */
    List<Category> queryByParentId(Integer parentId);
}
