package io.dracula.test.dagger2;

import javax.inject.Inject;

public class PrintJob {
    //    需要打印的报表
    @Inject
    public ReportPage reportPage;

    @Inject
    public ReportPage reportPage2;

    public void print() {
        this.reportPage.print();
    }

}