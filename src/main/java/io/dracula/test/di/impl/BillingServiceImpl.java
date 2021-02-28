package io.dracula.test.di.impl;

import io.dracula.test.di.BillingService;
import io.dracula.test.di.ScoreService;
import io.dracula.test.di.TransferService;
import io.dracula.test.di.UserService;

import javax.inject.Inject;

/**
 * @author dk
 */
public class BillingServiceImpl implements BillingService {

    @Inject
    UserService userService;

    @Inject
    TransferService transferService;

    @Inject
    ScoreService scoreService;

    @Override
    public void pay() {
        System.out.println(super.toString()+toString());
    }

    @Override
    public String toString() {
        return "BillingServiceImpl{" +
                "userService=" + userService +
                ", transferService=" + transferService +
                ", scoreService=" + scoreService +
                '}';
    }
}
