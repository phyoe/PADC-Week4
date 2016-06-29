package xyz.phyoekhant.padcweek4.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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
import android.widget.FrameLayout;

import xyz.phyoekhant.padcweek4.R;
import xyz.phyoekhant.padcweek4.fragments.JobSearchFragment;
import xyz.phyoekhant.padcweek4.fragments.LinkedinFragment;
import xyz.phyoekhant.padcweek4.fragments.MainFragment;
import xyz.phyoekhant.padcweek4.fragments.PulseFragment;
import xyz.phyoekhant.padcweek4.fragments.WonZinFragment;
import xyz.phyoekhant.padcweek4.fragments.YoteShinFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FrameLayout flContainer;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_linkedin);

        flContainer = (FrameLayout) findViewById(R.id.fl_container);
        toolbar.setTitle(R.string.app_name);
        navigateToMain();
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
        getMenuInflater().inflate(R.menu.main, menu);
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
    public boolean onNavigationItemSelected(MenuItem menuItem) {

        // Handle navigation view item clicks here.
        final int id = menuItem.getItemId();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (id == R.id.nav_linkedin) {
                    toolbar.setTitle(R.string.str_linkedin);
                    navigateToLinkedIn();
                } else if (id == R.id.nav_job_search) {
                    toolbar.setTitle(R.string.str_job_search);
                    navigateToJobSearch();
                } else if (id == R.id.nav_pulse) {
                    toolbar.setTitle(R.string.str_pulse);
                    navigateToPulse();;
                } else if (id == R.id.nav_yoteshin) {
                    toolbar.setTitle(R.string.str_yoteshin);
                    navigateToYoteShin();
                } else if (id == R.id.nav_wonzin) {
                    toolbar.setTitle(R.string.str_wonzin);
                    navigateToWonZin();
                }
            }
        }, 100); //to close drawer smoothly.

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void navigateToMain() {
        MainFragment fragment = new MainFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container,fragment)
                .commit();
    }

    private void navigateToLinkedIn() {
        LinkedinFragment fragment = new LinkedinFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container,fragment)
                .commit();
    }

    private void navigateToJobSearch() {
        JobSearchFragment fragment = new JobSearchFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container,fragment)
                .commit();
    }

    private void navigateToPulse() {
        PulseFragment fragment = new PulseFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container,fragment)
                .commit();
    }

    private void navigateToYoteShin() {
        YoteShinFragment fragment = new YoteShinFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container,fragment)
                .commit();
    }

    private void navigateToWonZin() {
        WonZinFragment fragment = new WonZinFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container,fragment)
                .commit();
    }


}
