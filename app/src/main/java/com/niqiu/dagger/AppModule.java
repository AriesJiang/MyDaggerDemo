package com.niqiu.dagger;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.niqiu.dagger.domain.DomainModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 毅东 on 2015/11/16.
 */
@Module(
        injects = {
                App.class
        },
        includes = {
                DomainModule.class,
        }
)
public class AppModule {

    private App app;

    public AppModule(App app) {
        Log.d("AppModule", "---AppModule()---" + app);
        this.app = app;
    }

    @Provides public Application provideApplication() {
        return app;
    }
}
