package com.dk.gridviewadapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class GridAdapter extends ArrayAdapter<String> {

    Context context;

    String clubNames[];
    String clubTypes[];
    String clubAddress[];

    int clubimages[];

    public GridAdapter(Context context, String[] clubNames, String[] clubTypes, String[]
            clubAddress, int[] clubimages){
        super(context,R.layout.activity_club_detail,clubNames);
        this.context = context;
        this.clubNames = clubNames;
        this.clubTypes = clubTypes;
        this.clubAddress = clubAddress;
        this.clubimages = clubimages;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View v = ((Activity)context).getLayoutInflater().inflate(R.layout.club_list,null,false);
        TextView tvName = v.findViewById(R.id.tvname);
        TextView tvClubTypes = v.findViewById(R.id.tvtype);
        TextView tvClubAddress = v.findViewById(R.id.tvaddress);
        ImageView image = v.findViewById(R.id.image1);
        tvName.setText(clubNames[position]);
        tvClubTypes.setText(clubTypes[position]);
        tvClubAddress.setText(clubAddress[position]);
          image.setImageResource(clubimages[position]);
        return v;
    }
}





