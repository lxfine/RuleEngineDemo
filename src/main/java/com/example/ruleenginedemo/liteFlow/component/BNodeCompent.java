package com.example.ruleenginedemo.liteFlow.component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

@LiteflowComponent("BNodeCompent")
public class BNodeCompent extends NodeComponent {

    @Override
    public void process() throws Exception {
        System.out.println("BBBBBBBB");
    }
}
