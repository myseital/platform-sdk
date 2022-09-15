package com.ydm.platform.online.dto.order;

import com.ydm.platform.common.utils.StringUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author myseital
 * @date 2021/6/2 17:01
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineOrderLogisticsDTO implements Serializable {

    private String myLogisticsChannelId;

    private String myLogisticsChannel;

    private String trackNumber;

    private String labelPdfUrl;


    /**
     * 是否使用自有物流
     * @return
     */
    public boolean useSelfLogistics() {
        return StringUtil.isNotEmpty(myLogisticsChannelId) && !Objects.equals(myLogisticsChannelId, "1010");
    }

}
