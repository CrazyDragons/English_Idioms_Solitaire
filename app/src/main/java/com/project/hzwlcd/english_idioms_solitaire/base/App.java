package com.project.hzwlcd.english_idioms_solitaire.base;

import android.app.Application;

import com.project.hzwlcd.english_idioms_solitaire.di.components.ApplicationComponent;
import com.project.hzwlcd.english_idioms_solitaire.di.components.DaggerApplicationComponent;
import com.project.hzwlcd.english_idioms_solitaire.di.modules.ApplicationModule;

/**
 * Project EnglishidiomsSolitaire/com.project.hzwlcd.englishidiomssolitaire.display.activity.Init/App
 * Created by HZW
 * Data 2017/10/16
 * Time 16:16
 */

public class App extends Application {

    private ApplicationComponent applicationComponent;
    private static App mApp;

    @Override
    public void onCreate() {
        super.onCreate();
        this.initializeInjector();
    }

    private void initializeInjector() {
        this.applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public static App getBaseApplication() {
        if (mApp != null) {
            return mApp;
        } else {
            mApp = new App();
            mApp.onCreate();
            return mApp;
        }
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

}
