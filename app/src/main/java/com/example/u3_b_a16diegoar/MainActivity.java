package com.example.u3_b_a16diegoar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

import com.example.u3_b_a16diegoar.fragments.ListaSelectDfrag;
import com.example.u3_b_a16diegoar.fragments.MsgDFrag;
import com.example.u3_b_a16diegoar.fragments.TresBotsDfrag;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "DialogFragment";
    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();
    }

    public void showMsgDfrag(View v) {
        (new MsgDFrag()).show(fm, TAG);
    }

    public void showTresBotsDfrag(View v) {
        (new TresBotsDfrag()).show(fm, TAG);
    }

    public void showListaSelectDfrag(View v) {
        (new ListaSelectDfrag()).show(fm, TAG);
    }

    public void showRadioButtonsDfrag(View v) {

    }

    public void showCheckboxDfrag(View v) {

    }

    public void showTxtinDfrag(View v) {

    }
}
