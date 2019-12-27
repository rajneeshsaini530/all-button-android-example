package com.mcti.buttomexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.google.android.material.chip.Chip;

public class ChipExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chip_example);

        //all chip view
        Chip action = findViewById(R.id.action);
        Chip filter = findViewById(R.id.filter);
        Chip entry = findViewById(R.id.entry);
        Chip choice = findViewById(R.id.choice);

        //action chip click
        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ChipExample.this, "Action", Toast.LENGTH_SHORT).show();
            }
        });

        //filter state change listener
        filter.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(ChipExample.this, "select", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(ChipExample.this, "Unselect", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //entry close button click listener
        entry.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ChipExample.this, "close", Toast.LENGTH_SHORT).show();
            }
        });

        //choice state change listener
        choice.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(ChipExample.this, "select", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(ChipExample.this, "Unselect", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
