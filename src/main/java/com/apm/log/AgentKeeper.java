package com.apm.log;

import com.apm.log.plugins.TimerPlugin;

import java.lang.instrument.Instrumentation;

/**
 * Hello world!
 *
 */
public class AgentKeeper
{
    public static void premain(String agentArgs, Instrumentation inst)
    {
        System.out.println( "Welcome use agent Keeper ." );
        inst.addTransformer(new TimerPlugin());
    }
}
