package io.dracula.test.di.impl;

import io.dracula.test.di.LogService;
import io.dracula.test.di.TransferService;

import javax.inject.Inject;

/**
 * @author dk
 */
public class TransferServiceImpl implements TransferService {

    @Inject
    LogService logService;

    @Override
    public void transfer() {
        System.out.println(super.toString()+toString());
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "logService=" + logService +
                '}';
    }

}
