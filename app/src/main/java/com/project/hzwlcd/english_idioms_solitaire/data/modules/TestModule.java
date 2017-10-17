package com.project.hzwlcd.english_idioms_solitaire.data.modules;

import com.project.hzwlcd.english_idioms_solitaire.base.PerActivity;
import com.project.hzwlcd.english_idioms_solitaire.data.apis.TestApi;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Project EnglishidiomsSolitaire/com.project.hzwlcd.englishidiomssolitaire.data.modules/TestModule
 * Created by HZW
 * Data 2017/10/17
 * Time 10:38
 */

@Module
public class TestModule {
    @PerActivity
    @Provides
    TestApi testApi(final Retrofit retrofit){
        return retrofit.create(TestApi.class);
    }
}
