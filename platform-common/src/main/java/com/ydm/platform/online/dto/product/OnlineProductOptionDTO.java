package com.ydm.platform.online.dto.product;

import lombok.Data;

import java.util.List;

/**
 * @author myseital
 * @date 2021/10/27 15:21
 */
@Data
public class OnlineProductOptionDTO {
    /**
     * 规格名称 如 颜色
     */
    private String name;
    /**
     * 规格属性列表
     */
    private List<OnlineProductOptionValueDTO> values;
}
