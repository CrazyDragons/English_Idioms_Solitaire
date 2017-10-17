package com.project.hzwlcd.english_idioms_solitaire.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Project EnglishidiomsSolitaire/com.project.hzwlcd.englishidiomssolitaire.base/MvpActivity
 * Created by HZW
 * Data 2017/10/17
 * Time 9:34
 */

public abstract class MvpActivity<V extends View, P extends Presenter<V>> extends AppCompatActivity implements View {
    private ViewDelegate<V, P> mViewDelegate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewDelegate = new ViewDelegate<V, P>() {
            @Override
            protected P createPresenter() {
                return MvpActivity.this.createPresenter();
            }
        };
        mViewDelegate.onCreate(savedInstanceState);
        mViewDelegate.onStart((V) this);
    }


    @SuppressWarnings("unchecked")
    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onStop() {
        super.onStop();
        mViewDelegate.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mViewDelegate.onDestroy();
    }

    protected abstract P createPresenter();
}
