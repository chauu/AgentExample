package com.cwx.agent;

import java.lang.instrument.Instrumentation;

public class Agent {

    public static void premain(String agentOps, Instrumentation inst){
        System.out.println("------premain------");
//        inst.addTransformer(new CTransformer());
        inst.addTransformer(new DurationTransformer());
    }
}
