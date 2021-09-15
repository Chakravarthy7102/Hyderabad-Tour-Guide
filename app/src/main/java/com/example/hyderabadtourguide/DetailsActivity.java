package com.example.hyderabadtourguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private String title,clickUrl,desc;
    private int imageID;
    private Button click;
    private ImageView imageView ;
    private TextView titleView;
    private TextView description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ActionBar actionBar = getSupportActionBar();
        // Customize the back button
        // actionBar.setHomeAsUpIndicator(R.drawable.back);
        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);
        click=findViewById(R.id.intenet_button);
        imageView=findViewById(R.id.detailsImage);
        titleView=findViewById(R.id.title);
        description=findViewById(R.id.tag_state_description);

        imageID=getIntent().getIntExtra("image",0);
        title=getIntent().getStringExtra("title");
        clickUrl=getIntent().getStringExtra("url");
        desc=getIntent().getStringExtra("desc");

        imageView.setImageResource(imageID);
        titleView.setText(title);
        description.setText(desc);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=clickUrl;
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

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