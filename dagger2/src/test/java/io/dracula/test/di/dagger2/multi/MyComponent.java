package io.dracula.test.di.dagger2.multi;

import dagger.Component;
import io.dracula.test.di.impl.BillingServiceImpl;

@Component(modules = MyModule.class)
public interface MyComponent {

    void inject(BillingServiceImpl billingService);

}
