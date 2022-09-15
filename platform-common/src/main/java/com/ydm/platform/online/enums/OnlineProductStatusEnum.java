package com.ydm.platform.online.enums;

import lombok.Getter;

/**
 * 平台商品状态
 * @author myseital
 * @date 2021/5/31 09:43
 */
@Getter
public enum OnlineProductStatusEnum {
    ACTIVE(1, "上架"),
    DRAFT(0,"草稿"),
    REMOVED(-1,"已删除"),
    OFFLINE(2,"下架"),
    HIDDEN(3,"隐藏商品"),
    ;
    private Integer code;
    private String message;

    OnlineProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
