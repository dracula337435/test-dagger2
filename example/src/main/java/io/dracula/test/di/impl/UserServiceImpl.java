package io.dracula.test.di.impl;

import io.dracula.test.di.LogService;
import io.dracula.test.di.UserService;

import javax.inject.Inject;

/**
 * @author dk
 */
public class UserServiceImpl implements UserService {

    @Inject
    LogService logService;

    @Override
    public void valid() {
        System.out.println(super.toString()+toString());
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "logService=" + logService +
                '}';
    }
}
