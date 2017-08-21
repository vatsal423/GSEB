package com.example.vatsal.gsebstd_3english;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class home_page1 extends ActionBarActivity implements View.OnClickListener {

    TextView t1, t2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page1);
        getSupportActionBar().hide();


        findallid();
        animation1();
        animation2();
        b1.setOnClickListener(this);

    }

    public void findallid()
    {
        t1 = (TextView) findViewById(R.id.txtstd);
        t2 = (TextView) findViewById(R.id.txtsub);
        b1 = (Button)findViewById(R.id.btnstart);
    }

    public void animation1()
    {
        Animation a1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        t1.startAnimation(a1);
    }

    public void animation2()
    {
        Animation a1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        t2.startAnimation(a1);
    }

    public void onClick(View v)
    {
        Intent i = new Intent(home_page1.this,semester.class);
        startActivity(i);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_page1, menu);
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
}
