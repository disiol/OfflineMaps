package com.denisimusit.offlineMaps.di.component;

import android.content.Context;

import com.denisimusit.offlineMaps.TaxiApplication;
import com.denisimusit.offlineMaps.di.modules.ApplicationModule;
import com.denisimusit.offlineMaps.ui.activities.MainActivity;

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

    void inject(TaxiApplication app);
    void inject(MainActivity app);
}
