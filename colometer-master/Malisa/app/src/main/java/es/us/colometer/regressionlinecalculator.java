package es.us.colometer;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.preference.PreferenceManager;
import android.content.Intent;

import java.math.BigDecimal;
import java.math.RoundingMode;

import es.us.colometer.app.R;

public class regressionlinecalculator extends AppCompatActivity {

    //SharedPreferences sharedPreferences; //commented out for demo purposes
    //String first_control;
    //String second_control;
    //String third;
    //String unknown;





    private static Button button_sbm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regressionlinecalculator);
        //sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        //first_control = sharedPreferences.getString("0", "");
       // second_control = sharedPreferences.getString("1", "");
        //third = sharedPreferences.getString("2", "");
        //unknown = sharedPreferences.getString("3", "");
        Button asdf = (Button)findViewById(R.id.switch_to_DisplayConcentration);
        asdf.setVisibility(View.GONE);

        OnClickButtonListener();
    }

    public void OnClickButtonListener(){
        button_sbm = (Button) findViewById(R.id.switch_to_DisplayConcentration);
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("es.us.colometer.DisplayConcentration");
                        startActivity(intent);
                    }
                }
        );


    }









    public void view_concentration(View view) {
        TextView change_for_equation = (TextView) findViewById(R.id.equation_text_view);
        Button view_conc = (Button) findViewById(R.id.view_line);
        Button asdf = (Button)findViewById(R.id.switch_to_DisplayConcentration);

        //puts the x and y values into double data type so they can be manipulated, they were strings
        /* double first_x = Double.parseDouble(first_control);
        double second_x = Double.parseDouble(second_control);
        double third_x = Double.parseDouble(third);
        double fourth_x = Double.parseDouble(unknown);

        //update these once you get concentration values from excel
        double first_y = 0.1;        //nanograms per ml low concentration
        double second_y = 1;         //medium
        double third_y = 10;         //high


        // slope = (Nxysum) - (xsumysum)/(Nx2sum) - (xsumxsum)
        // y-intercept = (x2sumysum) - (xsumxysum)/(Nx2sum) - (xsumxsum)


        double x_sum = first_x + second_x + third_x;

        double y_sum = first_y + second_y + third_y;

        double xysum = (first_x * first_y) + (second_x * second_y) + (third_x * third_y);

        double x2sum = Math.pow(first_x, 2) + Math.pow(second_x, 2) + Math.pow(third_x, 2);

        double y2sum = Math.pow(first_y, 2) + Math.pow(second_y, 2) + Math.pow(third_y, 2);

        double N = 3;

        double slope = ((N * xysum) - (x_sum * y_sum)) / ((N * x2sum) - (x_sum * x_sum));

        double y_intercept = ((x2sum * y_sum) - (x_sum * xysum)) / ((N * x2sum) - (x2sum * x2sum));

        // concentration = input * slope + y intercept
        String slope_rounded = String.format("%.5f", slope); //rounding to make presentation better
        String y_int_rounded = String.format("%.5f", y_intercept);

        double concentration = (Double.parseDouble(unknown) * slope) + y_intercept;

       String equation_string =  "y = " + slope_rounded + "x + " + y_int_rounded;  */

        change_for_equation.setText("y = 0.5x + 3.00"); //replace with equation_string
        view_conc.setVisibility(View.GONE);


        //storeColorInSharedPreferences(concentration);
        asdf.setVisibility(View.VISIBLE);

    }

   /* public void storeColorInSharedPreferences(double var) {

        SharedPreferences sharedprefernces = getSharedPreferences("conc", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedprefernces.edit();
        String value = String.valueOf(var);
        editor.putString("1", value);

        editor.commit();



    }
*/




}





