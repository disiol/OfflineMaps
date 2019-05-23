package com.denisimusit.offlineMaps.ui.fragments.home.presenter;

import com.denisimusit.offlineMaps.interactor.DataStore;
import com.denisimusit.offlineMaps.ui.base.BasePresenter;
import com.denisimusit.offlineMaps.ui.fragments.home.view.HomeView;

import javax.inject.Inject;

import static com.denisimusit.offlineMaps.util.StringsUtill.firstUpperCase;

public class HomePresenter extends BasePresenter<HomeView>{

//  TODO  1. Начальный экран, необходимые элементы:
//            - Список регионов Европы
//- Информации о доступном свободном месте на устройстве.
//- Вложенная структура. Большая часть стран разбиты на регионы.


    private DataStore dataStore;

    @Inject
    HomePresenter(DataStore dataStore) {
        this.dataStore = dataStore;

    }




    public void downloadMap(String mapName) {
        getView().showProgress();
        String firstUpperCase = firstUpperCase(mapName);
        String fileMapName = String.format("%s_2.obf.zip", firstUpperCase);
        dataStore.downloadMap(fileMapName);
        getView().hideProgress();
    }
}
