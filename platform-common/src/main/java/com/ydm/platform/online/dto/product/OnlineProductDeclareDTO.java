package com.ydm.platform.online.dto.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author myseital
 * @date 2021/5/31 09:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OnlineProductDeclareDTO {

    private String declareName;

    private String declareEname;

    private BigDecimal declareValue;

    private String declareCode;

    private Integer quantity;

    private BigDecimal declareWeight;

    private BigDecimal length;

    private BigDecimal width;

    private BigDecimal height;

}
