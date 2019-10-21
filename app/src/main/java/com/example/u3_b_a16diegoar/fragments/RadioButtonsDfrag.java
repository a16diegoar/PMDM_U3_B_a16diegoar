package com.example.u3_b_a16diegoar.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.u3_b_a16diegoar.R;

public class RadioButtonsDfrag extends DialogFragment {

    private RadioGroup rg;
    private static int rbSelecId;
    private static boolean guardado = false;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.dfrag_radio_buttons, container, false);
        getDialog().setTitle("Selecciona un smartphone");

        rg = rootView.findViewById(R.id.rgPrincipal);
        if (guardado) {
            rg.check(rbSelecId);
        } else {
            rg.check(R.id.rbIphone);
        }

        Button btnAc = rootView.findViewById(R.id.btnAceptSmartphone);
        btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardado = true;
                String txt = "";
                rbSelecId = rg.getCheckedRadioButtonId();
                RadioButton rb = rootView.findViewById(rbSelecId);
                txt = rb.getText().toString();
                Toast.makeText(getContext(), txt, Toast.LENGTH_LONG).show();

                dismiss();
            }
        });

        Button btnCan = rootView.findViewById(R.id.btnCancelSmartphone);
        btnCan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardado = false;
                dismiss();
            }
        });

        return rootView;
    }

    /*
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            guardado = savedInstanceState.getBoolean("guardado");
            if (guardado) {
                rbSelecId = savedInstanceState.getInt("rbSelecId");
                rg.check(rbSelecId);
            }
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putBoolean("guardado", guardado);
        outState.putInt("rbSelecId", rbSelecId);
        super.onSaveInstanceState(outState);
    }

     */

}
