package com.example.u3_b_a16diegoar;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.example.u3_b_a16diegoar.fragments.CheckboxDfrag;
import com.example.u3_b_a16diegoar.fragments.ListaSelectDfrag;
import com.example.u3_b_a16diegoar.fragments.MsgDfrag;
import com.example.u3_b_a16diegoar.fragments.RadioButtonsDfrag;
import com.example.u3_b_a16diegoar.fragments.TresBotsDfrag;
import com.example.u3_b_a16diegoar.fragments.TxtinDfrag;

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
        (new MsgDfrag()).show(fm, TAG);
    }

    public void showTresBotsDfrag(View v) {
        (new TresBotsDfrag()).show(fm, TAG);
    }

    public void showListaSelectDfrag(View v) {
        (new ListaSelectDfrag()).show(fm, TAG);
    }

    public void showRadioButtonsDfrag(View v) {
        (new RadioButtonsDfrag()).show(fm, TAG);
    }

    public void showCheckboxDfrag(View v) {
        (new CheckboxDfrag()).show(fm, TAG);
    }

    public void showTxtinDfrag(View v) {
        (new TxtinDfrag()).show(fm, TAG);
    }
}
