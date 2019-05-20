package com.denisimusit.offlineMaps.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Streaming;

public interface Api {
    @Streaming
    @GET("api/")
    Call<ResponseBody> downloadFileWithFixedUrl();



}
