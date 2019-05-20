package com.denisimusit.offlineMaps.di.modules;

import com.denisimusit.offlineMaps.di.scopes.FragmentScope;
import com.denisimusit.offlineMaps.ui.fragments.home.view.HomeFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface MainActivityModule {


    @FragmentScope
    @ContributesAndroidInjector
    HomeFragment homeFragment();



}
