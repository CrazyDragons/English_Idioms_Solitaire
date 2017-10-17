package com.project.hzwlcd.english_idioms_solitaire.data.repo;

import com.project.hzwlcd.english_idioms_solitaire.base.PerActivity;
import com.project.hzwlcd.english_idioms_solitaire.data.apis.TestApi;

import javax.inject.Inject;

/**
 * Project EnglishidiomsSolitaire/com.project.hzwlcd.englishidiomssolitaire.data.repo/TestRepo
 * Created by HZW
 * Data 2017/10/17
 * Time 10:22
 */

@PerActivity
public class TestRepo {
    private TestApi testApi;
    @Inject
    TestRepo(TestApi testApi){this.testApi = testApi;}
}
