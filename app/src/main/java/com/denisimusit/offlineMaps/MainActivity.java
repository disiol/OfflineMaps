package com.denisimusit.offlineMaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.denisimusit.offlineMaps.R;
import com.denisimusit.offlineMaps.di.component.DaggerApplicationComponent;
import com.denisimusit.offlineMaps.interactor.DataStore;
import com.denisimusit.offlineMaps.ui.base.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject
    DataStore dataStore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
