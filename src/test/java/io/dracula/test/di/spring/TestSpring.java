package io.dracula.test.di.spring;

import io.dracula.test.dagger2.PrintJob;
import io.dracula.test.dagger2.ReportPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class TestSpring {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test(){
        long start = System.currentTimeMillis();
        for (int i=0; i<10000; i++) {
            applicationContext.getBean(PrintJob.class);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    @Configuration
    static class Config {

        @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
        @Bean
        public PrintJob printJob(){
            return new PrintJob();
        }

        @Bean
        public ReportPage reportPage(){
            return new ReportPage();
        }

    }

}
