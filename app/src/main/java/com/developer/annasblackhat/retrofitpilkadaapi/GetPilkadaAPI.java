package com.developer.annasblackhat.retrofitpilkadaapi;


import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by ANNAS BlackHat on 22/01/2016.
 */
public interface GetPilkadaAPI {
    @GET("/calonpilkada/api/candidates")
    Call<Pilkada> getPilkadaFromAPI(@Query("apiKey") String apiKey);

    @GET("/data/2.5/weather")
    Call<WeatherData> getWeatherFromAPI(@Query("q") String cityName,
                                        @Query("APPID") String appId);
}
