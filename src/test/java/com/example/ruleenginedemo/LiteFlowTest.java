package com.example.ruleenginedemo;

import com.yomahub.liteflow.core.FlowExecutor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(classes = RuleEngineDemoApplication.class)
public class LiteFlowTest {
    @Resource
    private FlowExecutor flowExecutor;


    @Test
    public void simpleTest() {
//        TestContext slot = new TestContext();
//        slot.setCount(110);
//        slot.setAge(12);
//        LiteflowResponse response = flowExecutor.execute2Resp("chain1", null, slot);
//        System.out.println("最终折扣：" + slot.getDisCount());
//        System.out.println(response.isSuccess());
//        System.out.println(response.getExecuteStepStr());
    }
}
