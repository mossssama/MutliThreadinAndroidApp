package com.example.testapi.API;

import static com.example.testapi.API.Api.BASE_URL;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* Single Retrofit instance because Retrofit consumes large resources */
public class RetrofitClient {
    public static RetrofitClient instance =null;
    private Api api;

    /*Retrofit instance to send requests to Api */
    private RetrofitClient(){
        Retrofit retrofit= new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        api=retrofit.create(Api.class);
    }

    public static synchronized RetrofitClient getInstance(){
        if(instance==null){instance=new RetrofitClient();}
        return instance;
    }

    public Api getApi(){ return api; }
}

