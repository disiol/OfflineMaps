package com.denisimusit.offlineMaps.interactor;

import android.util.Log;

import com.denisimusit.offlineMaps.api.Api;
import com.google.gson.Gson;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Singleton;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.denisimusit.offlineMaps.constants.Constants.LOG_TEG;

@Singleton
public class DataStore {

    private Api api;
    private Gson gson;

    @Inject
    public DataStore(Api api, Gson gson) {
        this.api = api;
        this.gson = gson;
    }

    public  void  downloadMap(String fileName){
        api.downloadMap("yes",fileName).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                if (response.isSuccessful()) {
                    try {
                        Log.d(LOG_TEG, response.body().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                } else {
                    try {

                        response.errorBody().string();
                        //TODO finish the text of an error
                        Log.e(LOG_TEG, " errorBody: " + response.errorBody().string());


                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }
}
