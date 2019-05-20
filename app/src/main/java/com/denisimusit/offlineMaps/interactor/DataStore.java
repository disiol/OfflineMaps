package com.denisimusit.offlineMaps.interactor;

import com.denisimusit.offlineMaps.api.Api;
import com.google.gson.Gson;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DataStore {

    private Api api;
    private Gson gson;

    @Inject
    public DataStore(Api api, Gson gson) {
        this.api = api;
        this.gson = gson;
    }
}
