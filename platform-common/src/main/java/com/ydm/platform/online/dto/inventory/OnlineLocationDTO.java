package com.ydm.platform.online.dto.inventory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author myseital
 * @date 2021/6/29 19:47
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineLocationDTO {
    public String id;
    public String name;
}
