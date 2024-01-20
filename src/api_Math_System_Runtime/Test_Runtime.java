package com.nancheung.api_Math_System_Runtime;

import java.io.IOException;

public class Test_Runtime {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime r = Runtime.getRuntime();
        System.out.println(r.availableProcessors());
        System.out.println(r.totalMemory()/1024.0/1024.0 + "MB");
        System.out.println(r.freeMemory()/1024.0/1024.0 + "MB");
        // start program
        Process p = r.exec("\"C:\\Program Files (x86)\\Mobatek\\MobaXterm\\\"");
        Thread.sleep(5000);
        p.destroy();
    }
}
