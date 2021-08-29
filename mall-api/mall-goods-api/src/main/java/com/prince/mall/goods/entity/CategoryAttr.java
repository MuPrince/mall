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
 * Description : 属性分类 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/28 22:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "category_attr")
public class CategoryAttr {
    @TableField
    private Integer categoryId;

    @TableField
    private Integer attrId;
}
