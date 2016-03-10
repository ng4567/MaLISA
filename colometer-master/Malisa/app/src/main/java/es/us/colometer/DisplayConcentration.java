package es.us.colometer;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import es.us.colometer.app.R;

public class DisplayConcentration extends AppCompatActivity {
    SharedPreferences sharedPreferences; 
    String concentration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_concentration);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        sharedPreferences = getSharedPreferences("conc", Context.MODE_PRIVATE);
        concentration = sharedPreferences.getString("1", "");

        TextView concen = (TextView) findViewById(R.id.concentration_text_view);
        TextView ng = (TextView) findViewById(R.id.ngml);
        concen.setText(concentration);
        ng.setText("ng/mL");


    }



}

