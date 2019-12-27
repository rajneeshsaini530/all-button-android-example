package com.mcti.buttomexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class SwitchExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_example);

        Switch switchButton = findViewById(R.id.switch1);
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(SwitchExample.this, "ON", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(SwitchExample.this, "OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
