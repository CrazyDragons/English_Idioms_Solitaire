package com.project.hzwlcd.english_idioms_solitaire.di.components;

import com.project.hzwlcd.english_idioms_solitaire.di.modules.ActivityModule;
import com.project.hzwlcd.english_idioms_solitaire.di.modules.ApplicationModule;
import com.project.hzwlcd.english_idioms_solitaire.display.activity.TestComponent;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Project EnglishidiomsSolitaire/com.project.hzwlcd.englishidiomssolitaire.di.components/ApplicationComponent
 * Created by HZW
 * Data 2017/10/16
 * Time 17:23
 */

@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    TestComponent testComponent(ActivityModule activityModule);
}
