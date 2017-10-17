package com.project.hzwlcd.english_idioms_solitaire.display.activity;

import com.project.hzwlcd.english_idioms_solitaire.base.PerActivity;
import com.project.hzwlcd.english_idioms_solitaire.data.modules.TestModule;
import com.project.hzwlcd.english_idioms_solitaire.di.modules.ActivityModule;

import dagger.Subcomponent;

/**
 * Project EnglishidiomsSolitaire/com.project.hzwlcd.englishidiomssolitaire.display.activity.Init/TestComponent
 * Created by HZW
 * Data 2017/10/16
 * Time 15:43
 */

@PerActivity
@Subcomponent(modules = {ActivityModule.class, TestModule.class})
public interface TestComponent {
    void inject(TestActivity testActivity);
}
