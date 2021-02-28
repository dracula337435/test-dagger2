package io.dracula.test.dagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class ReportPageModule {

    @Provides
    public ReportPage createPage() {
        System.out.println("初始化成功!!!");
        return new ReportPage();
    }
}