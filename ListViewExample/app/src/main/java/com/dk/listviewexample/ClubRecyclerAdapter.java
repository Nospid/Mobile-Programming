package com.dk.listviewexample;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ClubRecyclerAdapter extends RecyclerView.Adapter<ClubRecyclerAdapter.ClubViewHolder> {

    Context context;
    List<Club> clubList;

    public ClubRecyclerAdapter(Context context, List<Club> clubList){
        this.context = context;
        this.clubList = clubList;
    }

    @NonNull
    @Override
    public ClubViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = ((Activity)context).getLayoutInflater().inflate(R.layout.item_club,parent,false);
        ClubViewHolder clv  = new ClubViewHolder(v);
        return clv;
    }

    @Override
    public void onBindViewHolder(@NonNull ClubViewHolder holder, int position) {
        holder.tvClubName.setText(clubList.get(position).getName());
        holder.tvClubAddress.setText(clubList.get(position).getAddress());
        holder.tvClubType.setText(clubList.get(position).getType());
        holder.tvClubFee.setText("Entry Rs. "+clubList.get(position).getEntryFree());

    }

    @Override
    public int getItemCount() {
        return clubList.size();
    }

    public static class ClubViewHolder extends RecyclerView.ViewHolder{


        TextView tvClubName;

        TextView tvClubAddress;

        TextView tvClubType;

        TextView tvClubFee;

        public ClubViewHolder(View itemView){
            super(itemView);

            tvClubName = itemView.findViewById(R.id.tvClubName);
            tvClubAddress = itemView.findViewById(R.id.tvClubAddress);
            tvClubType = itemView.findViewById(R.id.tvClubType);
            tvClubFee = itemView.findViewById(R.id.tvClubEntryFee);
        }

    }
}
