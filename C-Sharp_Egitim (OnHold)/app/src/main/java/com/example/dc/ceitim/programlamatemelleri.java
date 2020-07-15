package com.example.dc.ceitim;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class programlamatemelleri extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programlamatemelleri);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Programlama Temelleri");

        this.setTitle("Programlama Temelleri");

        final Button programlamanedir=findViewById(R.id.button4);

        Button algoritmanedir=findViewById(R.id.button5);

        Button helloworld=findViewById(R.id.button2);

        Button temelaritmatikislemler=findViewById(R.id.button3);

        Button ornekprogramlar=findViewById(R.id.button6);

        Button sorular=findViewById(R.id.button7);


        programlamanedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent programlamaNedir=new Intent(programlamatemelleri.this,Progromlamanedir.class);
                startActivity(programlamaNedir);
            }
        });

        algoritmanedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent algoritmaNedir=new Intent(programlamatemelleri.this,Algoritmanedir.class);
                startActivity(algoritmaNedir);
            }
        });

        helloworld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helloWorld=new Intent(programlamatemelleri.this,HelloWorld.class);
                startActivity(helloWorld);
            }
        });

        temelaritmatikislemler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent temelAritmatikIslemler=new Intent(programlamatemelleri.this,Temelaritmatikislemler.class);
                startActivity(temelAritmatikIslemler);
            }
        });

        ornekprogramlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ornekProgramlar=new Intent(programlamatemelleri.this,bolum1_orneksorular.class);
                startActivity(ornekProgramlar);
            }
        });




        sorular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Sorular=new Intent();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.programlamatemelleri, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.bolum1) {


        } else if (id == R.id.bolum2) {
            Intent bolum2=new Intent(programlamatemelleri.this,degiskentipleri.class);
            startActivity(bolum2);
            this.finish();
        }
        else if(id==R.id.bolum3)
        {
Intent bolum3=new Intent(programlamatemelleri.this,kontrolmekanizmalari.class);
startActivity(bolum3);
this.finish();
        }
        else if(id==R.id.bolum4)
        {

        }
        else if(id==R.id.bolum5)
        {

        }
        else if(id==R.id.bolum6)
        {

        }
        else if(id==R.id.geribildirim) {

        }
        else if(id==R.id.ulasin)
        {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
