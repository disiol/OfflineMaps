package com.denisimusit.offlineMaps.ui.fragments.regions.view;

import com.denisimusit.offlineMaps.R;
import com.denisimusit.offlineMaps.databinding.FragmentHomeBinding;
import com.denisimusit.offlineMaps.ui.base.BaseBindingFragment;
import com.denisimusit.offlineMaps.ui.fragments.regions.presenter.RegionsPresenter;

public class RegionsFragment extends BaseBindingFragment<RegionsPresenter, FragmentHomeBinding> implements HomeView {
    @Override
    public int getLayoutResId() {
        return R.layout.fragment_home;
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

//TODO    После тапа на загрузку появляется индикатор загрузки у скачиваемого элемента.
// - После того как карта загрузилась, иконка слева окрашивается в зеленый цвет.

}
