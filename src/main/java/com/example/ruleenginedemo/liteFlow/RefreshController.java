package com.example.ruleenginedemo.liteFlow;

import com.yomahub.liteflow.core.FlowExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rule")
public class RefreshController {

    @Autowired
    private FlowExecutor flowExecutor;

    @PostMapping("/refresh")
    public String refresh() {
        flowExecutor.reloadRule();
        return "OK";
    }

//    @PostMapping("/demo")
//    public String demo() {
//        TestContext testContext = new TestContext();
//        List<PlanConfigDTO> planConfigDTOList = new ArrayList<>();
//        PlanConfigDTO planConfigDTO = new PlanConfigDTO();
//        planConfigDTO.setPlanCode("ABC-001");
//        planConfigDTO.setNormOfYear(new BigDecimal("10000000"));
//        planConfigDTO.setInsurancePeriodStart(LocalDate.parse("2023-02-20", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//        planConfigDTO.setInsurancePeriodStart(LocalDate.parse("2025-02-20", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//        planConfigDTO.setPolicyCopayment(new BigDecimal("0.2"));
//        planConfigDTOList.add(planConfigDTO);
//        LipeiDTO slot = new LipeiDTO();
//        slot.setPlanCode("ABC-001");
//        slot.setAmount(new BigDecimal("200000"));
//        slot.setLiPeiTime(LocalDate.now());
//        slot.setAmountOfYear(new BigDecimal("10000000"));
//        testContext.setPlanConfigs(planConfigDTOList);
//        testContext.setLipeiDTO(slot);
//        testContext.setLipeiResultDTO(new LipeiResultDTO());
//        LiteflowResponse response = flowExecutor.execute2Resp("chain1", null, testContext);
//        return JSON.toJSONString(testContext.getLipeiResultDTO());
//    }

}
