package com.mcti.buttomexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.chip.Chip;

public class CheckBoxExample extends AppCompatActivity implements CheckBox.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_example);

        CheckBox checkBoxJava = findViewById(R.id.checkBox_java);
        CheckBox checkBoxAndroid = findViewById(R.id.checkBox_android);
        CheckBox checkBoxPHP = findViewById(R.id.checkBox_php);
        CheckBox checkBoxHTML = findViewById(R.id.checkBox_html);
        checkBoxAndroid.setOnCheckedChangeListener(this);
        checkBoxJava.setOnCheckedChangeListener(this);
        checkBoxHTML.setOnCheckedChangeListener(this);
        checkBoxPHP.setOnCheckedChangeListener(this);


        Button button = findViewById(R.id.next_check);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CheckBoxExample.this, ChipExample.class));
            }
        });
        
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        int id = compoundButton.getId();
        switch (id){
            case R.id.checkBox_java:{
                if(b){
                Toast.makeText(this, "java", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Java Unselect", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.checkBox_php:{
                if(b){
                    Toast.makeText(this, "PHP", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "PHP Unselect", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.checkBox_html:{
                if(b){
                    Toast.makeText(this, "HTML", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "HTML Unselect", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.checkBox_android:{
                if(b){
                    Toast.makeText(this, "Android", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Android Unselect", Toast.LENGTH_SHORT).show();
                }

            }
        }


    }
}
