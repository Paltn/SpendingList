package com.example.pcardoso.spendinglist.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.pcardoso.spendinglist.R;

public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.main);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.main);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nav, menu);
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

        if (id == R.id.profile) {

            Toast.makeText(getApplicationContext(), "Profile", Toast.LENGTH_LONG).show();

        } else if (id == R.id.notification) {
            //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Fra3Fragment()).commit();

        } else if (id == R.id.budget) {

        } else if (id == R.id.category) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.main);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void add (View v)
    {
        Intent aa = new Intent(this, AddExpenseActivity.class);
        startActivity(aa);

    }

    public void calculator (View v)
    {
        Intent aa = new Intent(this, CalculatorActivity.class);
        startActivity(aa);

    }
    public void notification (View v) {
        Intent aa = new Intent(this, AddNotificationActivity.class);
        startActivity(aa);
    }

    public void report (View v) {
        Intent aa = new Intent(this, ReportActivity.class);
        startActivity(aa);
    }




}
