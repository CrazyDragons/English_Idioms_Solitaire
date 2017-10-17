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
    /*Person providerPerson() {//先判断Module中是否有提供该对象实例化的方法(根据返回值类型及@Provides注解来判断)，如果有则注入返回的对象
        return new Person("hzw");//如果没有，则查找Inject注解的构造函数。如果有，则注入使用此构造方法创建的对象
        //如果@Provides方法或@Inject构造方法需要参数，则先按同样的步骤初始化参数。若存在参数但无法初始化参数，则编译不通过。
    }*/
}
