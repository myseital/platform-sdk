package com.ydm.platform.online.dto.inventory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author myseital
 * @date 2021/10/1 13:21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineInventoryDTO {
    public String id;
    public String skuId;
    public Integer quantity;
}
