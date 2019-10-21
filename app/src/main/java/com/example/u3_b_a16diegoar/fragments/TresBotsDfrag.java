package com.example.u3_b_a16diegoar.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.u3_b_a16diegoar.R;

public class TresBotsDfrag extends DialogFragment {

    View rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.dfrag_tres_bots, container, false);
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
        String txt = "A tua resposta é: ";
        Button btn = (Button) v;
        txt += btn.getText().toString();
        Toast.makeText(getContext(), txt, Toast.LENGTH_SHORT).show();
        dismiss();
    }
}
