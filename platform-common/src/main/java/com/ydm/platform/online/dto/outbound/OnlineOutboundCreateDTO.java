package com.ydm.platform.online.dto.outbound;

import lombok.Data;

import java.util.List;

/**
 * @author myseital
 * @date 2021/10/18 20:57
 */
@Data
public class OnlineOutboundCreateDTO {

    private List<OnlineOutboundItemCreateDTO> items;
}
