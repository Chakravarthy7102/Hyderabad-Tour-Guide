package com.example.hyderabadtourguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaceActivity extends AppCompatActivity {

   private ListAdapter listAdapter;
   private ArrayList<ListModel> listModelArrayList;
   private ListModel placeListModel;
   private ListView placeListView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list_xml);
        ActionBar actionBar = getSupportActionBar();
        // Customize the back button
        // actionBar.setHomeAsUpIndicator(R.drawable.back);
        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);

        listModelArrayList=new ArrayList<>();
        listModelArrayList.add(new ListModel(R.drawable.assembly,"Assembly","https://en.wikipedia.org/wiki/Telangana_Legislative_Assembly","The Telangana Legislative Assembly is the lower house of the Telangana Legislature. The Legislative Assembly of Telangana currently consists of 119 elected members and 1 nominated member from the Anglo-Indian community. Its chief engineer was Nawab Sarwar Jung..."));
        listModelArrayList.add(new ListModel(R.drawable.charminar_web_place,"Charminar","https://en.wikipedia.org/wiki/Charminar","The Charminar (lit. 'four minarets') constructed in 1591, is a monument and mosque located in Hyderabad, Telangana, India. The landmark has become known globally as a symbol of Hyderabad and is listed among the most recognised structures in India. It has also been officially incorporated as the Emblem of Telangana for the state of Telangana.[3] The Charminar's long history includes the existence of a mosque on its top floor for more than 400 years. While both historically and religiously significant, it is also known for its popular ..."));
        listModelArrayList.add(new ListModel(R.drawable.birla_mandir,"Birla Mandir","https://en.wikipedia.org/wiki/Birla_Mandir","Birla Mandir (Birla Temple) refers to different Hindu temples or Mandirs built by the Birla family, in different cities across India. All these temples are magnificently built, some of them in white marble or in sandstone. The temples are generally located in a prominent location, carefully designed to accommodate a large number of visitors...."));
        listModelArrayList.add(new ListModel(R.drawable.golconda,"golconda","https://en.wikipedia.org/wiki/Golconda_Fort","It was initially called Shepherd’s Hill, meaning Golla Konda in Telugu while according to legend, on this rocky hill a shepherd boy had come across an idol and the information was conveyed to the ruling Kakatiya king at that time. The king constructed a mud fort around this holy spot and after 200 years, Bahamani rulers took possession of the place. Under the Bahmani Sultanate, Golconda slowly r…"));
        listModelArrayList.add(new ListModel(R.drawable.falaknuma_palace,"Faluknuma Palace","https://en.wikipedia.org/wiki/Falaknuma_Palace","Falaknuma is a palace in Hyderabad, Telangana, India.[3][4] It originally belonged to the Paigah family, and was later owned by the Nizam of Hyderabad.[5] It is on a hillock and covers a 13-hectare (32-acre) area in Falaknuma, 5 kilometres (3.1 mi) from Charminar...."));
        listModelArrayList.add(new ListModel(R.drawable.hussain_sagar,"Hussain Sagar","https://en.wikipedia.org/wiki/Hussain_Sagar","Hussain Sagar (alternatively referred to as Tank Bund,[1] (Telugu pronunciation: [ɦusen sɑːgər])) is a heart-shaped lake in Hyderabad, Telangana, built by Ibrahim Quli Qutb Shah in 1563. It is spread across an area of 5.7 square kilometres (2.2 sq mi) and is fed by the River Musi. A large monolithic statue of the Gautama Buddha, erected ..."));
        listModelArrayList.add(new ListModel(R.drawable.lumbini_park,"Lumbini Park","https://en.wikipedia.org/wiki/Lumbini_Park","Lumbini Park, officially T. Anjaiah Lumbini Park,[1] is a small public, urban park of 3 hectares (7.5 acres) adjacent to Hussain Sagar in Hyderabad, India. Since it is located in the centre of the city and is in close proximity to other tourist attractions, such as Birla Mandir and Necklace Road,...."));
        listModelArrayList.add(new ListModel(R.drawable.ntr_garden,"NTR Gardens","https://en.wikipedia.org/wiki/NTR_Gardens","NTR Gardens is a small public, urban park of 36 acres (0.15 km2; 0.056 sq mi) adjacent to Hussain Sagar lake in Hyderabad, India. It is named after the former Chief minister of Andhra Pradesh, N. T. Rama Rao. Constructed in several phases since 1999, the area that is predominantly a park is geographically lo..."));
        listModelArrayList.add(new ListModel(R.drawable.ramoji_fim_city,"Ramoji Film City","https://www.ramojifilmcity.com/","Ramoji Film City. Ramoji Film City is India’s only thematic holiday destination with cine-magic. Certified as the World’s Largest Film Studio complex by Guinness World Records, it spreads across 2000 acres. Millions of tourists visit the amusement park to live their dream vacation. It is a perfect getaway and theme park that stimulates the ..."));
        listModelArrayList.add(new ListModel(R.drawable.shopping,"Hyderabad Central","https://www.bing.com/maps?q=hyderabad+central+ma&cvid=56a11ee41bda4ccaa0646f0a631d4c18&aqs=edge..69i57j0l4.8391j0j4&pglt=2211&FORM=ANAB01&PC=HCTS","Hyderabad Central Mall is near Punjagutta crossing. There are two buildings in this mall. Central mall is especially good to buy clothes. The options for dining are limited. This mall can be easily r…"));

        placeListView=findViewById(R.id.listview);
        placeListView.setAdapter(new ListAdapter(getApplicationContext(),listModelArrayList));


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }



}