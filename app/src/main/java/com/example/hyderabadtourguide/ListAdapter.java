package com.example.hyderabadtourguide;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends ArrayAdapter<ListModel> {
    private ArrayList<ListModel> listModelArrayList;
    private ListModel currentListModel;
    private Context context;
    //ClickInterface clickInterface;
    public ListAdapter(@NonNull Context context,ArrayList<ListModel> listModelArrayList ) {

        super(context, 0, listModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view=convertView;
        currentListModel=getItem(position);

        if (view==null){
            view= LayoutInflater.from(getContext()).inflate(R.layout.description_xml,parent,false);
        }
        ImageView image=view.findViewById(R.id.imageView);
        image.setImageResource(currentListModel.getImageId());

        image.setOnClickListener(v -> {
            Intent i = new Intent(getContext(),DetailsActivity.class);

            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            i.putExtra("title",currentListModel.getTitle());
            i.putExtra("desc",currentListModel.getDescription());
            i.putExtra("url",currentListModel.getInformationURL());
            i.putExtra("image",currentListModel.getImageId());
            getContext().startActivity(i);
        });

        TextView title=view.findViewById(R.id.textView);
        title.setText(currentListModel.getTitle());

        return view;
    }

}
