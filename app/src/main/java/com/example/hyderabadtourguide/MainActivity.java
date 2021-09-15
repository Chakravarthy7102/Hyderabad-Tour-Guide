package com.example.hyderabadtourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView hotel,places,food,shopping;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     // hotel=findViewById(R.id.hotels);
     // food=findViewById(R.id.food);
        places=findViewById(R.id.historicPlaces);
     //  shopping=findViewById(R.id.shopping_multiplexes);
       //Intents methods to go around

        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,PlaceActivity.class);
                startActivity(intent);

            }
        });
    }

}