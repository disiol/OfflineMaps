package com.denisimusit.offlineMaps.ui.fragments.home.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.denisimusit.offlineMaps.R;
import com.denisimusit.offlineMaps.databinding.FragmentHomeBinding;
import com.denisimusit.offlineMaps.modell.MapModel;
import com.denisimusit.offlineMaps.ui.base.BaseBindingToolbarFragment;
import com.denisimusit.offlineMaps.ui.fragments.home.presenter.HomePresenter;
import com.denisimusit.offlineMaps.ui.holdersAndAdapters.MapAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends BaseBindingToolbarFragment<HomePresenter, FragmentHomeBinding> implements HomeView {

    private List<MapModel> regionsList = new ArrayList<>();
    //Объявим RecyclerView
    RecyclerView rvMain;
    //И его адаптер
    MapAdapter mapAdapter;


    @Override
    public String getTitle() {
        return getString(R.string.home_fragment_title);
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_home;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getNameMaps();

        //Привяжем его к элементу
        rvMain = view.findViewById(R.id.home_RecyclerView);
        //Создадим адаптер
        mapAdapter = new MapAdapter(regionsList);
        //Применим наш адаптер к RecyclerView
        rvMain.setAdapter(mapAdapter);
        //И установим LayoutManager
        rvMain.setLayoutManager(new LinearLayoutManager(getActivity()));


        presenter.getFreeSpace(binding.freeSpaceTextView);
//        getNameMaps();
//        startDownloadMap();
    }

    @Override
    public void startDownloadMap() {
        presenter.downloadMap("denmark_capital-region");
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showError(Throwable throwable) {

    }

    public List<MapModel> getNameMaps() {
        MapModel denmark = new MapModel("denmark", "yes");
        regionsList.add(denmark);
        MapModel germany = new MapModel("germany", "yes");
        regionsList.add(germany);
        MapModel france = new MapModel("france", "yes");
        regionsList.add(france);

        MapModel paysDeLaLoire = new MapModel("pays-de-la-loire", null);
        regionsList.add(paysDeLaLoire);

        return regionsList;
    }


}



