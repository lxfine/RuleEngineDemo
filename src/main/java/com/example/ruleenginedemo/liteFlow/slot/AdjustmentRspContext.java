package com.example.ruleenginedemo.liteFlow.slot;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AdjustmentRspContext {


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
     * 自付额
     */
    private BigDecimal coinsrByClaimant;


    /**
     * 本次oop金额
     */
    private BigDecimal oop;

    /**
     * 剩余免赔额
     */
    private BigDecimal remainingDeductible;


    /**
     * 剩余个人oop
     */
    private BigDecimal remainingOop;

    /**
     * 剩余家庭oop
     */
    private BigDecimal remainingFamilyOop;

}
