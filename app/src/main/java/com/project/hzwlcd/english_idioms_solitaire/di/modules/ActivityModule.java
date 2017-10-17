package com.project.hzwlcd.english_idioms_solitaire.di.modules;

import android.app.Activity;

import com.project.hzwlcd.english_idioms_solitaire.base.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Project EnglishidiomsSolitaire/com.project.hzwlcd.englishidiomssolitaire.di.modules/ActivityModule
 * Created by HZW
 * Data 2017/10/16
 * Time 18:31
 */

@Module
public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    /**
     * Expose the activity to dependents in the graph.
     */
    @Provides
    @PerActivity
    Activity activity() {
        return this.activity;
    }
}
