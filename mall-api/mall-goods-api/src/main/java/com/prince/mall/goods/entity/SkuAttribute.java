package com.prince.mall.goods.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.entity <br\>
 * <p>
 * Description : SKU属性 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/28 23:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sku_attribute")
public class SkuAttribute implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 属性名称
     */
    private String name;
    /**
     * 属性选项
     */
    private String options;
    /**
     * 排序
     */
    private Integer sort;

    /**
     * 对应分类
     */
    @TableField(exist = false)
    private List<Category> categories;
}
