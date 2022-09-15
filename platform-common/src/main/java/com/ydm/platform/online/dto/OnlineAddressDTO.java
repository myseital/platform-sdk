package com.ydm.platform.online.dto;

import com.ydm.platform.common.utils.StringUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 收件人信息
 * @author myseital
 * @date 2021/5/31 21:07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineAddressDTO implements Serializable {

    /**
     * 收件人姓名
     */
    private String name;
    /**
     * 国家名称
     */
    private String country;
    /**
     * 国家简码
     */
    private String countryCode;
    /**
     * 省/州/地区
     */
    private String state;
    /**
     * 省/州/地区 对应编码
     */
    private String stateCode;
    /**
     * 城市
     */
    private String city;
    /**
     * 城市编码
     */
    private String cityCode;
    /**
     * 区
     */
    private String district;
    /**
     * 区编码
     */
    private String districtCode;
    /**
     * 邮编
     */
    private String postcode;
    /**
     * 地址1
     */
    private String address1;
    /**
     * 地址2
     */
    private String address2;
    /**
     * 收件人电话号码
     */
    private String phone;
    /**
     * 收件人邮箱
     */
    private String email;

    private String firstName;
    private String lastName;

    /**
     * 个人税号
     */
    private String consigneeTaxNumber;


    public void setName(String firstName, String lastName) {
        firstName = StringUtil.isEmpty(firstName) ? "" : firstName;
        lastName = StringUtil.isEmpty(lastName) ? "" : " " + lastName;
        this.name = firstName + lastName;
    }

    public String getName() {
        if (StringUtil.isNotEmpty(name)) {
            return name;
        }
        firstName = StringUtil.isEmpty(firstName) ? "" : firstName;
        lastName = StringUtil.isEmpty(lastName) ? "" : " " + lastName;
        return firstName + lastName;
    }

    public String getAddress() {
        String a = StringUtil.isEmpty(address1) ? "" : address1;
        String b = StringUtil.isEmpty(address2) ? "" : " " + address2;
        return a + b;
    }
}
