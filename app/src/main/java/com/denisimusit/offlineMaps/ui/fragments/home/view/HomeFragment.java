package com.denisimusit.offlineMaps.ui.fragments.home.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.denisimusit.offlineMaps.R;
import com.denisimusit.offlineMaps.databinding.FragmentHomeBinding;
import com.denisimusit.offlineMaps.ui.base.BaseBindingToolbarFragment;
import com.denisimusit.offlineMaps.ui.fragments.home.presenter.HomePresenter;

public class HomeFragment extends BaseBindingToolbarFragment<HomePresenter, FragmentHomeBinding> implements HomeView {

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
        startDownloadMap();
    }

    @Override
    public void startDownloadMap() {
      presenter.downloadMap("denmark_europe");
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


}
