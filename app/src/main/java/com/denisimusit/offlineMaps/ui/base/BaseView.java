package com.denisimusit.offlineMaps.ui.base;

public interface BaseView {

    void startDownloadMap();

    void showProgress();

    void hideProgress();

    void showMessage(String message);

    void showError(Throwable throwable);

}
