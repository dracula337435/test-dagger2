package io.dracula.test.di.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import io.dracula.test.dagger2.PrintJob;
import org.junit.Test;

public class TestGuice {

    @Test
    public void test(){
        Injector injector = Guice.createInjector(new MyModule());
        long start = System.currentTimeMillis();
        for (int i=0; i<10000; i++) {
            injector.getInstance(PrintJob.class);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

}
