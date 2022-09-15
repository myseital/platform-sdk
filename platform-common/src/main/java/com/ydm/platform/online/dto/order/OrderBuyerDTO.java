package com.ydm.platform.online.dto.order;

import com.ydm.platform.common.utils.StringUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author myseital
 * @date 2021/5/31 21:09
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderBuyerDTO implements Serializable {
    private String id;
    private String name;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String mobilePhone;

    public void setName(String firstName, String lastName) {
        firstName = StringUtil.isEmpty(firstName) ? "" : firstName + " ";
        lastName = StringUtil.isEmpty(lastName) ? "" : lastName;
        this.name = firstName + lastName;
    }
}
