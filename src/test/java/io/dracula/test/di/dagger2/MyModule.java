package io.dracula.test.di.dagger2;

import dagger.Module;
import dagger.Provides;
import io.dracula.test.di.LogService;
import io.dracula.test.di.ScoreService;
import io.dracula.test.di.TransferService;
import io.dracula.test.di.UserService;
import io.dracula.test.di.impl.LogServiceImpl;
import io.dracula.test.di.impl.ScoreServiceImpl;
import io.dracula.test.di.impl.TransferServiceImpl;
import io.dracula.test.di.impl.UserServiceImpl;

@Module
public class MyModule {

    @Provides
    public UserService provideUserService(){
        return new UserServiceImpl();
    }

    @Provides
    public TransferService provideTransferService(){
        return new TransferServiceImpl();
    }

    @Provides
    public ScoreService provideScoreService(){
        return new ScoreServiceImpl();
    }

    @Provides
    public LogService provideLogService(){
        return new LogServiceImpl();
    }

}
