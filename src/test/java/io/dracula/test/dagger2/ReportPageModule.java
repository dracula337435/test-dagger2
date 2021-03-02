package io.dracula.test.dagger2;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class ReportPageModule {

    @Singleton
    @Provides
    public ReportPage createPage() {
//        System.out.println("初始化成功!!!");
        return new ReportPage();
    }
}