package com.example.u3_b_a16diegoar.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.u3_b_a16diegoar.R;

public class ListaSelectDfrag extends DialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.dfrag_lista_selec, container, false);
        getDialog().setTitle("Escolle unha opción");

        final ListView lst = rootView.findViewById(R.id.lstOpcions);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String txt = (lst.getItemAtPosition(position)).toString();
                Toast.makeText(getContext(), txt, Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });

        return rootView;
    }
}
