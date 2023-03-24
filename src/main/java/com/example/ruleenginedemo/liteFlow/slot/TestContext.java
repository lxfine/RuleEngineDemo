package com.example.ruleenginedemo.liteFlow.slot;

import com.example.ruleenginedemo.liteFlow.dto.LipeiDTO;
import com.example.ruleenginedemo.liteFlow.dto.LipeiResultDTO;
import com.example.ruleenginedemo.liteFlow.dto.PlanConfigDTO;
import lombok.Data;

import java.util.List;

@Data
public class TestContext {

    /**
     * 计划配置
     */
    private List<PlanConfigDTO> planConfigs;

    private LipeiDTO lipeiDTO;

    private LipeiResultDTO lipeiResultDTO;


}
