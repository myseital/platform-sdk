package com.ydm.platform.online.dto.logistics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 平台物流发货方式
 * @author myseital
 * @date 2021/5/31 09:50
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineLogisticsDTO {
    private String code;
    private String name;
    /**
     * 单号匹配正则表达式
     */
    private String pattern;
}
