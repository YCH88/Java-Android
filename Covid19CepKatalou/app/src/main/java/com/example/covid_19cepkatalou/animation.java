package com.example.covid_19cepkatalou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class animation extends AppCompatActivity {

    TextView txt;
    ImageView img;
    public static int delay=5000;
    public static String bilgi[]={
            "Sizin sağlığınız için çalışan sağlık ve güvenlik görevlilerine bir iyilik yapın ve dışarı çıkmayın",
            "Gençmisin? İyi, o zaman dışarı çıkıp insanlara virüs bulaştırma!",
            "Virüs özellikle bağışıklık sistemi düşük, solunum yetmezliği olan ve 60 yaş üstü bireylerde daha ölümcüldür.",
            "Covid-19 Korona virüs ailesindendir ve Korona latincede Taç manasına gelmektedir.",
            "Covid-19, Gripden daha hızlı yayılan ve yine kat ve kat daha ölümcül bir virüsdür.",
            "Zorunlu Olmadıkça Evinizden Çıkmayın.",
            "Hayır grip gibi değil.",
            "Mümkün mertebe kendinizi toplu alanlardan izole etmeye çalışın.",
            "Eğer çalışıyorsanız maske ve eldiven kullanın.",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        txt=findViewById(R.id.t_biliyormusun);
        img=findViewById(R.id.imageView2);

        Random rnd=new Random();
        txt.setText(bilgi[rnd.nextInt(bilgi.length)]);
        Animation oynat= AnimationUtils.loadAnimation(animation.this,R.anim.anim);
        txt.startAnimation(oynat);
        img.startAnimation(oynat);

    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent gecis=new Intent(animation.this,MainActivity.class);
            startActivity(gecis);
            finish();
        }
    },delay);
    }
}
