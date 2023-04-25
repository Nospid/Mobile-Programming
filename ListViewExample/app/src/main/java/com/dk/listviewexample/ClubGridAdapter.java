package com.dk.listviewexample;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ClubGridAdapter extends ArrayAdapter<String> {

    Context context;

    String clubNames[];
    String clubTypes[];

    String clubAddress[];


    public ClubGridAdapter(Context context,String[] clubNames,String[] clubTypes,String[] clubAddress){
        super(context,R.layout.item_club,clubNames);
        this.context = context;

        this.clubNames = clubNames;
        this.clubTypes = clubTypes;
        this.clubAddress = clubAddress;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = ((Activity)context).getLayoutInflater().inflate(R.layout.item_club,null,false);
        TextView tvName = v.findViewById(R.id.tvClubName);
        TextView tvClubTypes = v.findViewById(R.id.tvClubType);
        TextView tvClubAddress = v.findViewById(R.id.tvClubAddress);
        tvName.setText(clubNames[position]);
        tvClubTypes.setText(clubTypes[position]);
        tvClubAddress.setText(clubAddress[position]);
        return v;
    }
}
