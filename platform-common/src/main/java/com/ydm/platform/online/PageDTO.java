package com.ydm.platform.online;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author myseital
 * @date 2021/5/31 14:05
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageDTO <T> implements Serializable {

    private Integer page;
    private Integer pageSize;
    private Boolean hasNext;
    private List<T> data;
    /**
     * shopify分页特征值
     */
    private String nextPageInfo;
    private String previousPageInfo;
}
