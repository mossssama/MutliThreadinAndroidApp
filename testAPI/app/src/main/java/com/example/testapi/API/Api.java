package com.example.testapi.API;

import com.example.testapi.POJO.AllStops;

import retrofit2.Call;
import retrofit2.http.GET;

/* Interface to defines requests & their EndPoints*/
/* It manage Api usage*/
public interface Api {

    String BASE_URL="https://samplepublictransportationsapi.onrender.com/"; /* Api doc: BaseURL used in every Api request */

    @GET(".")           /* GET request URL = Base URL */
    Call<AllStops> getAllNodes();

}