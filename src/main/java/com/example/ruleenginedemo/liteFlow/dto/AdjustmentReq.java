package com.example.ruleenginedemo.liteFlow.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AdjustmentReq {

    private Long BenefitId;

    /**
     * 发生额
     */
    private BigDecimal amtIncurred;

}
