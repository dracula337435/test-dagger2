package io.dracula.test.di.dagger2;

import dagger.Component;
import io.dracula.test.di.impl.BillingServiceImpl;

@Component(modules = MyModule.class)
public interface MyComponent {

    void inject(BillingServiceImpl billingService);

}
