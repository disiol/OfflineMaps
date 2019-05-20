package com.denisimusit.offlineMaps.ui.fragments.home.view;

import com.denisimusit.offlineMaps.R;
import com.denisimusit.offlineMaps.databinding.FragmentHomeBinding;
import com.denisimusit.offlineMaps.ui.base.BaseBindingFragment;
import com.denisimusit.offlineMaps.ui.fragments.home.presenter.HomePresenter;

public class HomeFragment extends BaseBindingFragment<HomePresenter, FragmentHomeBinding> implements HomeView {
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
}
