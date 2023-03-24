package com.example.ruleenginedemo;

import freemarker.template.TemplateException;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class SpelTest {
    public static void main(String[] args) throws IOException, TemplateException {
        /**
         * 条件判断
         */
        Map params = new HashMap();
        params.put("age", 1);
        params.put("sex", "F");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        params.put("time", LocalDate.parse("2023-03-16", dateTimeFormatter));
        String condition = "(#age > 0 || #sex eq 'M') && T(java.time.LocalDate).now().isAfter(#time)";
        System.out.println(getResult(params, condition));
        /**
         *  逻辑运算
         */
        Map params1 = new HashMap();
        BigDecimal bigDecimal0 = new BigDecimal("1228.12");
        params1.put("num0", bigDecimal0);
        BigDecimal bigDecimal1 = new BigDecimal("1.888888888");
        params1.put("num1", bigDecimal1);
        //除法
        String condition0 = "#num0.divide(#num1,2,T(java.math.RoundingMode).HALF_UP)";
        //乘法
        String condition1 = "#num0.multiply(#num1)";
        BigDecimal result = (BigDecimal) getResult(params1, condition0);
        System.out.println(result);
    }

    public static Object getResult(Map<String, Object> params, String condition) throws IOException, TemplateException {
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression(condition);
        EvaluationContext context = new StandardEvaluationContext();
        params.forEach((k, v) -> {
            context.setVariable(k, v);
        });
        return expression.getValue(context);
    }
}
