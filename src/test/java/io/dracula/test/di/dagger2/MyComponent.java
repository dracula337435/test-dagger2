package io.dracula.test.di.dagger2;

import dagger.Component;
import io.dracula.test.di.impl.BillingServiceImpl;
import io.dracula.test.di.impl.UserServiceImpl;

@Component(modules = MyModule.class)
public interface MyComponent {

    void inject(BillingServiceImpl billingService);

    void inject(UserServiceImpl userService);

}
