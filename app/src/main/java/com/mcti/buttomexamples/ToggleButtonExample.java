package com.mcti.buttomexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.mcti.buttomexamples.R;

public class ToggleButtonExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button_example);

        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(ToggleButtonExample.this, "checked", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(ToggleButtonExample.this, "Unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
