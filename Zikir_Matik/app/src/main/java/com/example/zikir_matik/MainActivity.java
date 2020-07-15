package com.example.zikir_matik;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;


import android.os.Bundle;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.QuickContactBadge;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    Button kaan;
    Button zikret;
    TextView s_zikir;
    EditText sinir;
    EditText aralik;
    CheckBox otuzuc;
    Vibrator titret;
    ConstraintLayout layoutt;

    String tzikir;
    int zikir=0;
    int atlama=1;
    int maks=99;

    String[] dua={"Suphanallah","Elhamdülillah","Allahuekber"};


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titret=(Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        layoutt = findViewById(R.id.lay);

        kaan=findViewById(R.id.button2);
        zikret= findViewById(R.id.button);
        s_zikir=findViewById(R.id.textView2);
        sinir=findViewById(R.id.sinir);
        aralik= findViewById(R.id.aralik);
        otuzuc = findViewById(R.id.checkBox);

        zikret.setText(dua[0]);

     zikret.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             try {
                 maks = Integer.parseInt(String.valueOf(sinir.getText()));
             } catch (Exception e) {
             }

             try {
                 atlama = Integer.parseInt(String.valueOf(aralik.getText()));
             } catch (Exception e) {
             }

             if ((zikir) < maks)
                 zikir += atlama;
             else
                 zikir = maks;

             if (zikir > maks)
                 zikir = maks;

             if (otuzuc.isChecked() && zikir % 33 == 0 || zikir == maks)
                 titret.vibrate(200);

             if (zikir > 33)
             {
                 zikret.setText(dua[1]);
                 layoutt.setBackgroundResource(R.drawable.e);
             }

             if(zikir>66)
             {
                 zikret.setText(dua[2]);
                 layoutt.setBackgroundResource(R.drawable.a);
             }
             tzikir=Integer.toString(zikir);
             s_zikir.setText(tzikir);



         }
     });
   s_zikir.setOnLongClickListener(new View.OnLongClickListener() {
       @Override
       public boolean onLongClick(View v) {
           zikir=0;
           layoutt.setBackgroundResource(R.drawable.s);
           tzikir=Integer.toString(zikir);
           s_zikir.setText(tzikir);
           return false;
       }
   });
        kaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zikir=0;
                layoutt.setBackgroundResource(R.drawable.s);
                tzikir=Integer.toString(zikir);
                s_zikir.setText(tzikir);
            }
        });
    }
}
