package com.project.hzwlcd.english_idioms_solitaire.base;

import android.os.Bundle;

import javax.inject.Inject;

/**
 * Project EnglishidiomsSolitaire/com.project.hzwlcd.englishidiomssolitaire.base/MvpDiActivity
 * Created by HZW
 * Data 2017/10/17
 * Time 9:33
 */

public abstract class MvpDiActivity <V extends View, P extends Presenter<V>, C> extends MvpActivity<V, P>{
    @Inject
    protected P mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        C component = initializeDi();
        injectDependencies(component);
        super.onCreate(savedInstanceState);
    }

    protected abstract C initializeDi();


    protected final P createPresenter() {
        return mPresenter;
    }

    protected abstract void injectDependencies(C component);
}
