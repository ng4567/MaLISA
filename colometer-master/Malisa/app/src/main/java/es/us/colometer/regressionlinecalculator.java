package es.us.colometer;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.preference.PreferenceManager;

import es.us.colometer.app.R;

public class regressionlinecalculator extends ActionBarActivity {

    SharedPreferences sharedPreferences;
    String first_control;
    String second_control;
    String third;
    String unknown;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regressionlinecalculator);
        sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        first_control = sharedPreferences.getString("0", "");
        second_control = sharedPreferences.getString("1", "");
        third = sharedPreferences.getString("2", "");
        unknown = sharedPreferences.getString("3", "");




    }










    public void submit_to_server(View view) {

        Toast submit2server = Toast.makeText(this, new String("Patient Concentration and ID submitted"), Toast.LENGTH_SHORT);
        submit2server.show();
    }

    public void view_concentration(View view) {


        //puts the x and y values into double data type so they can be manipulated, they were strings
        double first_x = Double.parseDouble(first_control);
        double second_x = Double.parseDouble(second_control);
        double third_x = Double.parseDouble(third);
        double fourth_x = Double.parseDouble(unknown);

        //update these once you get concentration values from excel
        double first_y = 1;
        double second_y = 2;
        double third_y = 3;





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

        double concentration = (fourth_x * slope) + y_intercept;
        String equation_string =  slope + "x + " + y_intercept;
        String display_this_value = "Concentration: " + concentration + "best fit line equation: " + equation_string;


        Toast display = Toast.makeText(this, display_this_value, Toast.LENGTH_SHORT);

        display.show();



    }
}
