package io.dracula.test.di.impl;

import io.dracula.test.di.LogService;
import io.dracula.test.di.ScoreService;

import javax.inject.Inject;

/**
 * @author dk
 */
public class ScoreServiceImpl implements ScoreService {

    @Inject
    LogService logService;

    @Override
    public void add() {
        System.out.println(super.toString()+toString());
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "logService=" + logService +
                '}';
    }

}
