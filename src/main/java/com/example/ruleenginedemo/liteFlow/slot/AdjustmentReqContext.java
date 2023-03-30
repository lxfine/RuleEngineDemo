package com.example.ruleenginedemo.liteFlow.slot;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AdjustmentReqContext {


    /**
     * 发生额
     */
    private BigDecimal amtIncurred;

    /**
     * 赔付比例
     */
    private BigDecimal compensationRatio;


    /**
     * 剩余免赔额
     */
    private BigDecimal remainingDeductibles;


    /**
     * 剩余个人oop
     */
    private BigDecimal remainingOop;

    /**
     * 剩余家庭oop
     */
    private BigDecimal remainingFamilyOop;


}
