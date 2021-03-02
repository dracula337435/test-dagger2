package io.dracula.test.dagger2;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = ReportPageModule.class)
public interface PrintJobComponent {

    void inject(PrintJob job);

}