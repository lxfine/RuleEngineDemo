package com.example.ruleenginedemo.liteFlow.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class LipeiDTO {

    /**
     * 计划编码
     */
    private String planCode;

    /**
     * 理赔时间
     */
    private LocalDate liPeiTime;

    /**
     * 理赔金额
     */
    private BigDecimal amount;

    /**
     * 本年度已理赔金额
     */
    private BigDecimal amountOfYear;
}
