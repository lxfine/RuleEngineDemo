package com.example.ruleenginedemo.liteFlow.component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

@LiteflowComponent("ANodeCompent")
public class ANodeCompent extends NodeComponent {

    @Override
    public void process() throws Exception {
        System.out.println("AAAAAAAA");
    }
}
