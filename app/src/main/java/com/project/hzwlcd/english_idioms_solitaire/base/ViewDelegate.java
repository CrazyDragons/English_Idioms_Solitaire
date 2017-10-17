package com.project.hzwlcd.english_idioms_solitaire.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Project EnglishidiomsSolitaire/com.project.hzwlcd.englishidiomssolitaire.base/ViewDelegate
 * Created by HZW
 * Data 2017/10/17
 * Time 9:39
 */

public abstract class ViewDelegate<V extends View, P extends Presenter<V>> {
    private P mPresenter;

    public void onCreate(@Nullable Bundle savedInstanceState) {
        mPresenter = createPresenter();
        checkPresenter();
    }

    public void onStart(V view) {
        checkPresenter();
        mPresenter.attachView(view);
    }

    public void onStop() {
        checkPresenter();

    }

    public void onDestroy() {
        checkPresenter();
        mPresenter.detachView();
        mPresenter.onDestroy();
    }

    protected abstract P createPresenter();

    private void checkPresenter() {
        if (mPresenter == null) {
            throw new IllegalStateException(
                    "You must call YaViewDelegate#onCreate! And createPresenter must return "
                            + "non-null");
        }
    }
}
