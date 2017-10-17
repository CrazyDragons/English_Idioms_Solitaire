package com.project.hzwlcd.english_idioms_solitaire.base;

import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;

/**
 * Project EnglishidiomsSolitaire/com.project.hzwlcd.englishidiomssolitaire.display.activity.Init/Presenter
 * Created by HZW
 * Data 2017/10/16
 * Time 16:00
 */

public abstract class Presenter <V extends View> {
    private V mView;

    @CallSuper
    public void attachView(V view) {
        mView = view;
    }

    @CallSuper
    public void detachView() {
        mView = null;
    }

    @CallSuper
    public void onDestroy() {
        if (isViewAttached()) {
            throw new IllegalStateException("View should been detached before destroy!");
        }
    }

    protected boolean isViewAttached() {
        return mView != null;
    }

    @NonNull
    protected V getView() {
        if (mView == null) {
            throw new IllegalStateException("View has been detached!");
        }
        return mView;
    }
}
