package com.denisimusit.offlineMaps.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.denisimusit.offlineMaps.R;
import com.denisimusit.offlineMaps.di.component.DaggerApplicationComponent;
import com.denisimusit.offlineMaps.interactor.DataStore;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    DataStore dataStore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        DaggerApplicationComponent.builder()
                .context(this)
                .build()
                .inject(this);

        dataStore.downloadMap("Denmark_europe_2.obf.zip");
    }
}
