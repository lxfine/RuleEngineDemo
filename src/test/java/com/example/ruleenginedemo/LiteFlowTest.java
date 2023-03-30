package com.example.ruleenginedemo;

import com.alibaba.fastjson2.JSON;
import com.example.ruleenginedemo.liteFlow.slot.AdjustmentReqContext;
import com.example.ruleenginedemo.liteFlow.slot.AdjustmentRspContext;
import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;

@SpringBootTest(classes = RuleEngineDemoApplication.class)
public class LiteFlowTest {
    @Resource
    private FlowExecutor flowExecutor;


    @Test
    public void simpleTest() {
        AdjustmentReqContext adjustmentReqContext = new AdjustmentReqContext();
        adjustmentReqContext.setAmtIncurred(new BigDecimal("3517.5"));
        adjustmentReqContext.setRemainingDeductibles(new BigDecimal("3500"));
        adjustmentReqContext.setRemainingOop(new BigDecimal("10400.00"));
        adjustmentReqContext.setRemainingFamilyOop(new BigDecimal("37600.00"));
        adjustmentReqContext.setCompensationRatio(new BigDecimal("0.8"));
        AdjustmentRspContext adjustmentRspContext = new AdjustmentRspContext();
        LiteflowResponse response = flowExecutor.execute2Resp("chain", null, adjustmentReqContext, adjustmentRspContext);
        System.out.println("结果：" + JSON.toJSONString(adjustmentRspContext));
        System.out.println("===================OOP======================");
        System.out.println("发生额：" + adjustmentReqContext.getAmtIncurred());
        System.out.println("批复额：" + adjustmentRspContext.getAmtApproved());
        System.out.println("未批复：" + adjustmentRspContext.getAmtToPay());
        System.out.println("免赔额：" + adjustmentRspContext.getDeductible());
        System.out.println("自付额：" + adjustmentRspContext.getCoinsrByClaimant());
        System.out.println("OOP：" + adjustmentRspContext.getOop());
        System.out.println("个人剩余OOP：" + adjustmentRspContext.getRemainingOop());
        System.out.println("家庭剩余OOP：" + adjustmentRspContext.getRemainingFamilyOop());
        System.out.println("剩余免赔额：" + adjustmentRspContext.getRemainingDeductible());

//        TestContext slot = new TestContext();
//        slot.setCount(110);
//        slot.setAge(12);
//        LiteflowResponse response = flowExecutor.execute2Resp("chain1", null, slot);
//        System.out.println("最终折扣：" + slot.getDisCount());
//        System.out.println(response.isSuccess());
//        System.out.println(response.getExecuteStepStr());
    }
}
