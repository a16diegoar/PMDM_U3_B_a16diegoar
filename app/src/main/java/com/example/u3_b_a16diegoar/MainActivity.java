package com.example.u3_b_a16diegoar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

import com.example.u3_b_a16diegoar.fragments.MsgDFrag;
import com.example.u3_b_a16diegoar.fragments.TresBotsDfrag;

public class MainActivity extends AppCompatActivity {

    private final String DEBUG_TAG = "NYAAAAAN";
    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();
    }

    public void showMsgDfrag(View v) {
        (new MsgDFrag()).show(fm, DEBUG_TAG);
    }

    public void showTresBotsDfrag(View v) {
        (new TresBotsDfrag()).show(fm, DEBUG_TAG);
    }

    public void showListaSelectDfrag(View v) {

    }

    public void showRadioButtonsDfrag(View v) {

    }

    public void showCheckboxDfrag(View v) {

    }

    public void showTxtinDfrag(View v) {

    }
}
