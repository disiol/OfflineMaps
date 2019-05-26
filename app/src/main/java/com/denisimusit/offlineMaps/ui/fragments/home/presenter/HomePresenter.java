package com.denisimusit.offlineMaps.ui.fragments.home.presenter;

import android.widget.TextView;

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


    public void getFreeSpace(TextView freeSpaceTextView) {
        //TODO  https://developer.android.com/reference/android/app/ActivityManager.MemoryInfo.html#totalMem

    }

    public void getNameMaps(String mapName) {
        getView().showProgress();
        getView().hideProgress();
    }

    public void downloadMap(String mapName) {
        getView().showProgress();
        String firstUpperCase = firstUpperCase(mapName);
        String fileMapName = String.format("%s_europe_2.obf.zip", firstUpperCase);
        dataStore.downloadMap(fileMapName);
        getView().hideProgress();
    }
}
