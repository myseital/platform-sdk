package com.ydm.platform.online.enums;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * @author myseital
 * @date 2021/6/8 11:25
 */
@Getter
public enum WeightUnitEnum {

    KG("kg","KG", new BigDecimal("1000")),
    G("g","G", new BigDecimal("1")),
    OZ("oz", "OZ", new BigDecimal("28.35")),
    LB("lb","LB", new BigDecimal("453.59")),
    ;
    private String code;
    private String message;
    /**
     * 对比g的比例
     */
    private BigDecimal rate;

    WeightUnitEnum(String code, String message, BigDecimal rate) {
        this.code = code;
        this.message = message;
        this.rate = rate;
    }

    public static WeightUnitEnum getByCode(String code){
        for(WeightUnitEnum statusEnum : WeightUnitEnum.values()){
            if(statusEnum.getCode().equalsIgnoreCase(code)){
                return statusEnum;
            }
        }
        return G;
    }
}
