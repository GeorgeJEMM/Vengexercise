package com.example.jemmg.vengexercise;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import java.util.Random;

public class principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }
    public void activarx1(View v){
        //final Button button = findViewById(R.id.v);
        //button.setOnClickListener(new View.OnClickListener() {
          //  public void onClick(View v) {
        v.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });

                // Code here executes on main thread after user presses button
         //   }
       // });
    }

    public void activar(View v){
        //final Button button = findViewById(R.id.v);
        //button.setOnClickListener(new View.OnClickListener() {
        //  public void onClick(View v) {
        //if (v.isEnabled())
        if (v.isEnabled())
            v.setEnabled(false);
        //else if(v.isPressed())
          //  v.setEnabled(true);
       // else
       //     v.setClickable(true);
        // Code here executes on main thread after user presses button
        //   }
        // });
    }


    public void habilitar(View v){
        final Button b1 = findViewById(R.id.bttnAdbo);
        final Button b2 = findViewById(R.id.bttnEscalon);
        final Button b3 = findViewById(R.id.bttnFlex);
        final Button b4 = findViewById(R.id.bttnSentadilla);
        final Button b5 = findViewById(R.id.bttnTabla);
        final Button b6 = findViewById(R.id.bttnZancada);
        b1.setEnabled(true);

        b2.setEnabled(true);

        b3.setEnabled(true);

        b4.setEnabled(true);

        b5.setEnabled(true);
        b6.setEnabled(true);
        b4.setBackgroundColor(Color.BLUE);
    }
    public void suerte(View v){
        final Random myRandom = new Random(6);
        final Button b1 = findViewById(R.id.bttnAdbo);
        final Button b2 = findViewById(R.id.bttnEscalon);
        final Button b3 = findViewById(R.id.bttnFlex);
        final Button b4 = findViewById(R.id.bttnSentadilla);
        final Button b5 = findViewById(R.id.bttnTabla);
        final Button b6 = findViewById(R.id.bttnZancada);
        View[] arrayOfString = { b1, b2,b3,b4,b5,b6};
        int img=0;

        //for (int i = 0; i >= myRandom.nextInt(); i++) {
            for (View s : arrayOfString) {
                img = s.getDrawingCacheBackgroundColor();
                s.setBackgroundColor(Color.CYAN);
                SystemClock.sleep(2000);
                s.setBackgroundColor(img);
            }

        //}

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
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
