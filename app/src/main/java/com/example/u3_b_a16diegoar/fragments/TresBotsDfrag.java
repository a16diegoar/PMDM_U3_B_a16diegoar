package com.example.u3_b_a16diegoar.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.u3_b_a16diegoar.R;

public class TresBotsDfrag extends DialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.dfrag_tres_bots, container, false);
        getDialog().setTitle("Enquisa");

        Button btnSi = rootView.findViewById(R.id.btnSi);
        btnSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respuesta(v);
            }
        });

        Button btnNo = rootView.findViewById(R.id.btnNon);
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respuesta(v);
            }
        });

        Button btnVeces = rootView.findViewById(R.id.btnVeces);
        btnVeces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respuesta(v);
            }
        });

        return rootView;
    }

    public void respuesta(View v) {
        dismiss();
    }
}
