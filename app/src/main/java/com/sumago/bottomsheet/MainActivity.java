package com.sumago.bottomsheet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_bottom_sheet,fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_bottom_sheet = findViewById(R.id.btn_bottom_sheet);
        fragment = findViewById(R.id.fragment);

        btn_bottom_sheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Fragment_bottom_sheet fragment_bottom_sheet = new Fragment_bottom_sheet();
                fragment_bottom_sheet.show(getSupportFragmentManager(), fragment_bottom_sheet.getTag());
            }
        });


        fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ii = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(ii);

            }
        });
    }
}