package com.ydm.platform.online;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author myseital
 * @date 2021/5/31 11:47
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineQueryRequest implements Serializable {

    /**
     * 分页条件
     */
    private Pagination pagination;

    /**
     * 页面
     */
    private Integer page;
    /**
     * 每页条数
     */
    private Integer pageSize;
    /**
     * 商品id
     */
    private String id;
    /**
     * 商品编码
     */
    private String code;
    /**
     * 商品id列表
     */
    private List<String> idList;
    /**
     * 商品状态
     */
    private String status;
    /**
     * 商品状态列表
     */
    private List<String> statusList;
    /**
     * 商品查询起止时间（默认更新时间）
     */
    private Date startTime;
    /**
     * 商品查询终止时间（默认更新时间）
     */
    private Date endTime;
    /**
     * 付款状态
     */
    private String payStatus;
    /**
     * 物流状态
     */
    private String deliveryStatus;
    /**
     * 分页参数特征值
     * shopify分页查询参数
     */
    private String pageInfo;

    @Data
    public static class Pagination {
        /**
         * 页面
         */
        private Integer page;
        /**
         * 每页条数
         */
        private Integer pageSize;
    }

}
