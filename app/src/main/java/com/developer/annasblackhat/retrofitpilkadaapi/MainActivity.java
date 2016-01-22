package com.developer.annasblackhat.retrofitpilkadaapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;


public class MainActivity extends AppCompatActivity {

    private final String API_KEY = "192eda9bf86e7c6008f6f1f4c4c13e02";
    private final String BASE_URL = "http://api.pemiluapi.org";

    static final String WEATHER_URL="http://api.openweathermap.org";
    static final String OPEN_WEATHER_API = "51337ba29f38cb7a5664cda04d84f4cd";

    private ArrayAdapter<String> mArrayAdapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> pilkadas = new ArrayList<String>();
        mArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pilkadas);

        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(mArrayAdapter);

        //getWeatherData();
        getPilkadaData();
    }

    private void getWeatherData(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(WEATHER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetPilkadaAPI service = retrofit.create(GetPilkadaAPI.class);
        Call<WeatherData> call = service.getWeatherFromAPI("Yogyakarta",OPEN_WEATHER_API);
        call.enqueue(new Callback<WeatherData>() {
            @Override
            public void onResponse(Response<WeatherData> response, Retrofit retrofit) {
                if(response.isSuccess()){
                    WeatherData w = response.body();
                ((TextView)findViewById(R.id.kota)).setText(w.getBase());
                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }

    private void getPilkadaData(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        GetPilkadaAPI pilkadaAPI = retrofit.create(GetPilkadaAPI.class);
        Call<Pilkada> call = pilkadaAPI.getPilkadaFromAPI(API_KEY);

        call.enqueue(new Callback<Pilkada>() {
            @Override
            public void onResponse(Response<Pilkada> response, Retrofit retrofit) {
                if(response.isSuccess()){
                    Pilkada pilkada = response.body();

                    String dukungan = pilkada.getData().getResults().getCandidates()[0].getPaslon()[0].getNama();
                    //((TextView)findViewById(R.id.kota)).setText(dukungan);

                    mArrayAdapter.clear();

                    Pilkada.Candidates[] candidates = pilkada.getData().getResults().getCandidates();
                    for(Pilkada.Candidates c : candidates){
                        mArrayAdapter.add(c.getPaslon()[0].getNama());
                    }

                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
}
