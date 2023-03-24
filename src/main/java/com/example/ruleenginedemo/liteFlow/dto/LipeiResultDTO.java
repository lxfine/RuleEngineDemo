package com.example.ruleenginedemo.liteFlow.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class LipeiResultDTO {
    /**
     * 是否可以理赔
     */
    private Boolean flag;

    /**
     * 实际理赔金额
     */
    private BigDecimal getAmount;
}
