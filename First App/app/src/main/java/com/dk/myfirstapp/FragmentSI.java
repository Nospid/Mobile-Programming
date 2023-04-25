package com.dk.myfirstapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentSI extends Fragment {


        EditText etp,etr,ett;
        Button btcalulate;
        TextView tvcalculate;

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//            return super.onCreateView(inflater, container, savedInstanceState);
            View view=inflater.inflate(R.layout.fragment_interest,container,false);

            etp=view.findViewById(R.id.etp);
            etr=view.findViewById(R.id.etr);
            ett=view.findViewById(R.id.ett);

            btcalulate=view.findViewById(R.id.btcalculate);
            tvcalculate=view.findViewById(R.id.tvcalculate);

            btcalulate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String principleText = etp.getText().toString();
                    String rateText = etr.getText().toString();
                    String timeText=ett.getText().toString();

                    int calculate = (Integer.parseInt(principleText) * Integer.parseInt(rateText) * Integer.parseInt(timeText))/100;
                    tvcalculate.setText("Simple Interset is :" +calculate);
                }

            });
            return view;
    }

}
