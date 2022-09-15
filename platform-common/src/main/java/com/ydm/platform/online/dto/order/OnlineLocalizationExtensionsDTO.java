package com.ydm.platform.online.dto.order;

import lombok.Data;

import java.util.List;

/**
 * @author ：myseital
 * @date ：2021/10/27 10:53 上午
 * @description ：shopify本地扩展实体
 */
@Data
public class OnlineLocalizationExtensionsDTO {
    private List<OnlineLocalizationExtensionsEdgesDTO> edges;
}
