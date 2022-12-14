package com.example.testapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.testapi.API.RetrofitClient;
import com.example.testapi.POJO.AllStops;
import com.example.testapi.POJO.Station;
import com.example.testapi.Room.RoomDB;
import com.example.testapi.Room.Stop;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RoomDB roomDB = RoomDB.getInstance(this);;
        TextView textView=findViewById(R.id.tv);
        ArrayList<Stop> stopTable=new ArrayList<>();

        RetrofitClient.getInstance().getApi().getAllNodes().enqueue(new Callback<AllStops>() {
            @Override
            public void onResponse(Call<AllStops> call, Response<AllStops> response) {
                AllStops allStops=response.body();
                ArrayList<Station> stops=allStops.getAllStops();

                for (Station stop : stops){
                    Stop stopTemp=new Stop(stop.getStationName(),stop.getLatitude());
                    stopTable.add(stopTemp);
                }

                //roomDB.Dao().deleteAllStops();

                //for (Stop stopRaw : stopTable){ roomDB.Dao().insert(stopRaw); }

                textView.setText(roomDB.Dao().getStop(0).getName()+"");

            }

            @Override
            public void onFailure(Call call, Throwable t) {
                textView.setText("10");
                Log.d("ahhhhhhhhhhhhhhhhhhh", "");
            }

        });

    }
}


//String osos=allStops.getAllStops().get(0).getStationName();

//textView.setText(stopTable.get(3).getLatitude()+"");