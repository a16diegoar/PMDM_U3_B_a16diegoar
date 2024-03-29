package com.example.u3_b_a16diegoar.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.u3_b_a16diegoar.R;

import java.util.ArrayList;

public class CheckboxDfrag extends DialogFragment {

    private static boolean[] valores = new boolean[] { false, true, false, true, false, false, false };

    View rootView;
    ArrayList<CheckBox> cajas;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.dfrag_checkbox, container, false);
        getDialog().setTitle("Selecciona modos de transporte");

        cajas = new ArrayList<>();
        cajas.add((CheckBox) rootView.findViewById(R.id.chkCoche));
        cajas.add((CheckBox) rootView.findViewById(R.id.chkMoto));
        cajas.add((CheckBox) rootView.findViewById(R.id.chkBici));
        cajas.add((CheckBox) rootView.findViewById(R.id.chkMetro));
        cajas.add((CheckBox) rootView.findViewById(R.id.chkTren));
        cajas.add((CheckBox) rootView.findViewById(R.id.chkAutobus));
        cajas.add((CheckBox) rootView.findViewById(R.id.chkAndando));

        //cargar valores
        for (int i = 0; i < cajas.size(); i++) {
            cajas.get(i).setChecked(valores[i]);
        }

        Button btnAc = rootView.findViewById(R.id.btnAceptTransporte);
        btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //guardar valores
                for (int i = 0; i < cajas.size(); i++) {
                    CheckBox caja = cajas.get(i);
                    valores[i] = caja.isChecked();
                }

                showSeleccion();
                dismiss();
            }
        });

        Button btnCan = rootView.findViewById(R.id.btnCancelTransporte);
        btnCan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        return rootView;
    }

    private void showSeleccion() {
        String txt = "";
        for (CheckBox c : cajas) {
            if (c.isChecked()) {
                txt += c.getText();
                txt += ", ";
            }
        }
        if (txt.length() > 0) {
            txt = txt.substring(0, txt.length()-2);
        }

        Toast.makeText(getContext(), txt, Toast.LENGTH_SHORT).show();
        //Log.println(Log.DEBUG, "NYAAAAAAAAN", txt);
    }
}
