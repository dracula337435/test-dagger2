package io.dracula.test.di.dagger2;

import io.dracula.test.dagger2.PrintJob;
import org.junit.Test;

public class TestDagger2 {

    @Test
    public void test(){
        PrintJobComponent printJobComponent = DaggerPrintJobComponent.create();
        long start = System.currentTimeMillis();
        for (int i=0; i<10000; i++) {
            PrintJob job = new PrintJob();
            printJobComponent.inject(job);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        //执行打印
//        job.print();
    }

}
