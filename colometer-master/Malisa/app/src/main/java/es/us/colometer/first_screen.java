package es.us.colometer;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import es.us.colometer.app.R;

public class first_screen extends AppCompatActivity {
    private static Button switch_to_camera;
    TextView arial_tv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        arial_tv = (TextView) findViewById(R.id.malisa_textview);


        String fontPath = "fonts/arial.ttf";
        Typeface.createFromAsset(getAssets(),fontPath);

        OnClickButtonListener();


    }





    public void OnClickButtonListener() {

       switch_to_camera = (Button) findViewById(R.id.switch_to_camera);
        switch_to_camera.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent("es.us.colometer.PrincipalScreen");
                        startActivity(intent);

                    }
                }

        );

    }








}

