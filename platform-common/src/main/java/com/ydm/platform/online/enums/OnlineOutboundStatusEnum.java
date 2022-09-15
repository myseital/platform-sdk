package com.ydm.platform.online.enums;

import com.google.common.collect.Lists;
import lombok.Getter;

import java.util.List;

/**
 * @author myseital
 * @date 2021/10/19 11:05
 */
@Getter
public enum OnlineOutboundStatusEnum {

    DELETE(0,"作废"),
    DRAFT(1, "草稿"),
    CONFIRM(2,"确认（待审核）"),
    VERIFY(3,"审核通过"),
    SHIP(4,"出库"),
    ;

    private Integer code;
    private String message;

    OnlineOutboundStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static List<Integer> sendMqStatusList(){
        return Lists.newArrayList(DELETE.getCode(), VERIFY.getCode(), SHIP.getCode());
    }
}
