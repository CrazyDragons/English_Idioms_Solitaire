package com.project.hzwlcd.english_idioms_solitaire.presenter;

import com.project.hzwlcd.english_idioms_solitaire.base.PerActivity;
import com.project.hzwlcd.english_idioms_solitaire.base.Presenter;
import com.project.hzwlcd.english_idioms_solitaire.data.repo.TestRepo;
import com.project.hzwlcd.english_idioms_solitaire.view.TestView;

import javax.inject.Inject;

/**
 * Project EnglishidiomsSolitaire/com.project.hzwlcd.englishidiomssolitaire.presenter/TestPresenter
 * Created by HZW
 * Data 2017/10/16
 * Time 15:49
 */

@PerActivity
public class TestPresenter extends Presenter<TestView>{

    private TestRepo testRepo;

    @Inject
    TestPresenter(TestRepo testRepo){
        this.testRepo = testRepo;
    }

    void  getTest(){}
}
