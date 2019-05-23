package com.denisimusit.offlineMaps.di.component;

import android.content.Context;

import com.denisimusit.offlineMaps.OfflineMapsApplication;
import com.denisimusit.offlineMaps.di.modules.ApplicationModule;
import com.denisimusit.offlineMaps.MainActivity;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder context(Context context);
        ApplicationComponent build();
    }

    void inject(OfflineMapsApplication app);
    void inject(MainActivity app);
}
