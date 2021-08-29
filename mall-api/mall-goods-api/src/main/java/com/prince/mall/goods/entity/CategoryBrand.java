package com.prince.mall.goods.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.entity <br\>
 * <p>
 * Description : 品牌分类关系 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/28 22:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "category_brand")
public class CategoryBrand {
    @TableField
    private Integer categoryId;

    @TableField
    private Integer brandId;
}
