package com.example.ruleenginedemo;

import freemarker.template.TemplateException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.io.IOException;
import java.util.Map;

@SpringBootTest
class RuleEngineDemoApplicationTests {

    @Test
    void test() {


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
