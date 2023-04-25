package com.dk.listviewexample;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ClubListAdapter extends ArrayAdapter<String> {

    Context mContext;
    String[] clubNames;

    String[] clubAddress;

    String[] clubTypeList;

    public ClubListAdapter(Context context, String[] clubNameList, String[] clubAddress, String[] clubTypes) {
        super(context, R.layout.item_club, clubNameList);
        mContext = context;
        clubNames = clubNameList;
        this.clubAddress = clubAddress;
        clubTypeList = clubTypes;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = ((Activity)mContext).getLayoutInflater().inflate(R.layout.item_club,null,false);

        TextView tvName = v.findViewById(R.id.tvClubName);
        tvName.setText(clubNames[position]);

        TextView tvAddress = v.findViewById(R.id.tvClubAddress);
        tvAddress.setText(clubAddress[position]);

        TextView tvClubType = v.findViewById(R.id.tvClubType);

        tvClubType.setText(clubTypeList[position]);


        return v;
    }
}
