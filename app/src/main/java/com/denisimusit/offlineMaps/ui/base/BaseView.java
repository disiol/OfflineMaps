package com.denisimusit.offlineMaps.ui.base;

public interface BaseView {

    void showProgress();

    void hideProgress();

    void showMessage(String message);

    void showError(Throwable throwable);
}
