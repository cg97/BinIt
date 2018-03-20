package com.example.currentplacedetailsonmap;

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
import android.widget.Toast;

public class home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Button btnmap,btgraph,btroute,btreport,btfeedback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnmap=(Button)findViewById(R.id.Mapbutton);
        btnmap.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                // check if any of the fields are vaccant
                Toast.makeText(getApplicationContext(), "Map Successfully launched ", Toast.LENGTH_LONG).show();
                Intent i = new Intent(home.this, MapsActivityCurrentPlace.class);

                startActivity(i);
            }
        });

        btgraph=(Button)findViewById(R.id.Graphbutton);
        btgraph.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                // check if any of the fields are vaccant
                Toast.makeText(getApplicationContext(), "Graph Successfully launched ", Toast.LENGTH_LONG).show();
                Intent i = new Intent(home.this, graphs.class);

                startActivity(i);
            }
        });
        btroute=(Button)findViewById(R.id.showroute);
        btroute.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                // check if any of the fields are vaccant
                Toast.makeText(getApplicationContext(), "Route to be followed:launched ", Toast.LENGTH_LONG).show();
                Intent i = new Intent(home.this, route.class);

                startActivity(i);
            }
        });
        btreport=(Button)findViewById(R.id.report);
        btreport.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                // check if any of the fields are vaccant
                Toast.makeText(getApplicationContext(), "Report area lacking Dustbins ", Toast.LENGTH_LONG).show();
                Intent i = new Intent(home.this, report.class);

                startActivity(i);
            }
        });

        btfeedback=(Button)findViewById(R.id.feedback);
        btfeedback.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                // check if any of the fields are vaccant
                Toast.makeText(getApplicationContext(), "Help us improve by giving your Feedback", Toast.LENGTH_LONG).show();
                Intent i = new Intent(home.this, feedback.class);

                startActivity(i);
            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
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
        getMenuInflater().inflate(R.menu.home, menu);
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

        if (id == R.id.nav_camera) {
            Intent i = new Intent(home.this, MapsActivityCurrentPlace.class);
            startActivity(i);
        } else if (id == R.id.nav_gallery) {
            Intent i = new Intent(home.this, graphs.class);
            startActivity(i);

        } else if (id == R.id.nav_slideshow) {
            Intent i = new Intent(home.this, route.class);
            startActivity(i);

        } else if (id == R.id.nav_manage) {

            Toast.makeText(getApplicationContext(), "Sorry, no tools available at this time.", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_share) {

            Intent myintent = new Intent(Intent.ACTION_SEND);
            myintent.setType("text/plain");
            String sharebody = "Hey!!! Check out this new App";
            String sharesub =  "these people are really cool .they made a app about dustbins";
            myintent.putExtra(Intent.EXTRA_SUBJECT,sharesub);
            myintent.putExtra(Intent.EXTRA_TEXT,sharebody);
            startActivity(Intent.createChooser(myintent,"SHARE THIS AWESOME APP BY: Chirag,Divya ,Ishan"));
        } else if (id == R.id.nav_send) {

            Intent i = new Intent(home.this, aboutus.class);
            startActivity(i);

        } else if(id == R.id.nav_feedback){

            Intent i = new Intent(home.this, feedback.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
