package io.dracula.test.dagger2;

import dagger.Component;

@Component(modules = ReportPageModule.class)
public interface PrintJobComponent {

    void inject(PrintJob job);

}