package com.project.hzwlcd.english_idioms_solitaire.di.modules;

import android.content.Context;

import com.project.hzwlcd.english_idioms_solitaire.base.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Project EnglishidiomsSolitaire/com.project.hzwlcd.englishidiomssolitaire.di.modules/ApplicationModule
 * Created by HZW
 * Data 2017/10/16
 * Time 17:24
 */

@Module
public class ApplicationModule {
    private final App app;

    public ApplicationModule(App app) {
        this.app = app;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return this.app;
    }
}
