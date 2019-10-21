package com.example.u3_b_a16diegoar.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.u3_b_a16diegoar.R;

public class TxtinDfrag extends DialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.dfrag_txtin, container, false);
        getDialog().setTitle("Indica usuario e contrasinal");

        Button btnAc = rootView.findViewById(R.id.btnAceptInput);
        btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txeNom = rootView.findViewById(R.id.txeNom);
                EditText txePasswd = rootView.findViewById(R.id.txePasswd);

                String txt = "Usuario: \"";
                txt += txeNom.getText();
                txt += "\"; Contrasinal: \"";
                txt += txePasswd.getText();
                txt += "\"";

                Toast.makeText(getContext(), txt, Toast.LENGTH_LONG).show();
                dismiss();
            }
        });

        Button btnCal = rootView.findViewById(R.id.btnCancelInput);
        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        return rootView;
    }
}
