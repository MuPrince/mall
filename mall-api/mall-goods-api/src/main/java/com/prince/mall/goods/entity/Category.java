package com.prince.mall.goods.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.entity <br\>
 * <p>
 * Description : 分类 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/28 22:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "category")
public class Category implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 分类名称
     */
    private String name;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 父ID
     */
    private Integer parentId;
}
