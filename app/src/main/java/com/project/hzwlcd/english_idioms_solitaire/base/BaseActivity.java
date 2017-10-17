package com.project.hzwlcd.english_idioms_solitaire.base;

import android.os.Bundle;

import com.project.hzwlcd.english_idioms_solitaire.di.modules.ActivityModule;

/**
 * Project EnglishidiomsSolitaire/com.project.hzwlcd.englishidiomssolitaire.display.activity/BaseActivity
 * Created by HZW
 * Data 2017/10/16
 * Time 15:02
 */

public abstract class BaseActivity<V extends View, P extends Presenter<V>, C> extends MvpDiActivity<V, P, C> {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }
}
