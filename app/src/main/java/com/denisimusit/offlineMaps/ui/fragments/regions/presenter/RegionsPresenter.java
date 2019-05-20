package com.denisimusit.offlineMaps.ui.fragments.regions.presenter;

import com.denisimusit.offlineMaps.interactor.DataStore;
import com.denisimusit.offlineMaps.ui.base.BasePresenter;
import com.denisimusit.offlineMaps.ui.fragments.regions.view.HomeView;

import javax.inject.Inject;

public class RegionsPresenter extends BasePresenter<HomeView> {

//  TODO Экран регионов.
//- После тапа на загрузку появляется индикатор загрузки у скачиваемого элемента.
//- После того как карта загрузилась, иконка слева окрашивается в зеленый цвет.


    private DataStore dataStore;

    @Inject
    RegionsPresenter(DataStore dataStore) {
        this.dataStore = dataStore;

    }


}
