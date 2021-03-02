package io.dracula.test.di.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import io.dracula.test.dagger2.ReportPage;

public class MyModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ReportPage.class).in(Singleton.class);
    }

}