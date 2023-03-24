package com.example.ruleenginedemo.liteFlow.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class PlanConfigDTO {
    
    private String planCode;

    /**
     * 保险期间（起）
     */
    public LocalDate insurancePeriodStart;

    /**
     * 保险期间（止）
     */
    public LocalDate insurancePeriodEnd;

    /**
     * 自付比例
     */
    public BigDecimal policyCopayment;

    /**
     * 年度限额
     */
    private BigDecimal normOfYear;

}
