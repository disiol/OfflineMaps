package com.denisimusit.offlineMaps.api;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.Part;
import retrofit2.http.Query;
import retrofit2.http.Streaming;

public interface Api {
    @Streaming
    @GET("download.php")
    Call<ResponseBody> downloadMap(@Query("standard") String description,
                                   @Query("file") String fileName);



}
