package com.denisimusit.offlineMaps.di.modules;

import com.denisimusit.offlineMaps.di.scopes.ActivityScope;
import com.denisimusit.offlineMaps.ui.activities.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Module(includes = {AndroidSupportInjectionModule.class, ApiModule.class, AppModule.class})
public interface ApplicationModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    MainActivity mainActivityInjector();

}
