package io.dracula.test.di.dagger2;

import dagger.Component;
import io.dracula.test.dagger2.PrintJob;

import javax.inject.Singleton;

@Singleton
@Component(modules = ReportPageModule.class)
public interface PrintJobComponent {

    void inject(PrintJob job);

}