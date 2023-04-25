package com.dk.listviewexample;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class ClubAdapter extends ArrayAdapter<String> {

    String[] clubNames;
    String[] clubAddress;
    String[] clubType;

    Context context;

    public ClubAdapter(String[] clubNames, String[] clubAddress, String[] clubType, Context context) {
        super(context,R.layout.item_club,clubNames);
        this.clubNames = clubNames;
        this.clubAddress = clubAddress;
        this.clubType = clubType;
        this.context = context;
    }

    public View getView(int position, View view, ViewGroup parent){
        View itemView = ((Activity)context).getLayoutInflater().inflate(R.layout.item_club,null,false);

        TextView tvClubName = itemView.findViewById(R.id.tvClubName);
        TextView tvClubAddress = itemView.findViewById(R.id.tvClubAddress);
        TextView tvClubType = itemView.findViewById(R.id.tvClubType);

        tvClubName.setText(clubNames[position]);
        tvClubAddress.setText(clubAddress[position]);
        tvClubType.setText(clubType[position]);



        return itemView;

    }
}
