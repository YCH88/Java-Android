package com.example.dc.ceitim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();


        Button menuye=findViewById(R.id.button);

        menuye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent anamenuye=new Intent(MainActivity.this,Anamenu.class);

                startActivity(anamenuye);
            }
        });

    }
}
