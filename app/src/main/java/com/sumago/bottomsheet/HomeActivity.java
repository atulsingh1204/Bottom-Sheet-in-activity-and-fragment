package com.sumago.bottomsheet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class HomeActivity extends AppCompatActivity {

    Button show;
    FrameLayout Mycontainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        show = findViewById(R.id.show);
        Mycontainer = findViewById(R.id.container);



        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                Show_bottom_sheet_fragment fragment = new Show_bottom_sheet_fragment();
                fm.beginTransaction().add(R.id.container,fragment).commit();
            }
        });
    }
}