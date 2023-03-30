package com.example.ruleenginedemo.liteFlow.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AdjustmentRsp {
    

    /**
     * 批复额
     */
    private BigDecimal amtApproved;

    /**
     * 未批复金额
     */
    private BigDecimal amtToPay;


    /**
     * 免赔额
     */
    private BigDecimal deductible;

    /**
     * 免赔额
     */
    private BigDecimal coinsrByClaimant;


    private BigDecimal oop;

}
