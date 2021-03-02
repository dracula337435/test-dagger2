package io.dracula.test.di.dagger2.multi;

import io.dracula.test.di.impl.BillingServiceImpl;
import org.junit.Test;

public class TestDagger2 {

    @Test
    public void test(){
        BillingServiceImpl billingService = new BillingServiceImpl();
        DaggerMyComponent.create().inject(billingService);
        billingService.pay();
    }

}
