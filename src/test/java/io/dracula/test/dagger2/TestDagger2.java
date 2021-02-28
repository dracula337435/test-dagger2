package io.dracula.test.dagger2;

import org.junit.Test;

public class TestDagger2 {

    @Test
    public void test(){
        PrintJob job = new PrintJob();
        DaggerPrintJobComponent.create().inject(job);
        //执行打印
        job.print();
    }

}
