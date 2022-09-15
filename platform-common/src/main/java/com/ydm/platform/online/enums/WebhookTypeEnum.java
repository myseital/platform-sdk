package com.ydm.platform.online.enums;

import lombok.Getter;

import java.util.Objects;

/**
 * @author myseital
 * @date 2021/11/17 16:54
 */
@Getter
public enum WebhookTypeEnum {
    ORDER(1, "order"),
//    PRODUCT(2, "product"),
    ;

    private Integer code;
    private String path;

    WebhookTypeEnum(Integer code, String path) {
        this.code = code;
        this.path = path;
    }

    public static WebhookTypeEnum getByCode(Integer code){
        for(WebhookTypeEnum statusEnum : values()){
            if(Objects.equals(statusEnum.getCode(), code)){
                return statusEnum;
            }
        }
        return null;
    }
}
