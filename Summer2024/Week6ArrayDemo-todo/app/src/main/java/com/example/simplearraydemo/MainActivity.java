package com.example.simplearraydemo;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity  {
    private TextView resultText;
    private int sum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultText = findViewById(R.id.resultTextView);
        //Declaring an array
        int[] ourArray;

        //Allocate memory for a maximum size of 6 elements
        ourArray = new int[6];

        //Initialize ourArray with values
        //The values are arbitrary as long as they are int
        //The indexes are not arbitrary 0 through 4 or crash!

        ourArray[0] = 25;
        ourArray[1] = 50;
        ourArray[2] = 125;
        ourArray[3] = 68;
        ourArray[4] = 47;
        ourArray[5] = 200;

        //Output all the stored values
        Log.i("info", "Here is ourArray:");
        Log.i("info", "[0] = "+ourArray[0]);
        Log.i("info", "[1] = "+ourArray[1]);
        Log.i("info", "[2] = "+ourArray[2]);
        Log.i("info", "[3] = "+ourArray[3]);
        Log.i("info", "[4] = "+ourArray[4]);

        // todo: calculate the sum of the elements of ourArray and store in sum

    }

    /**
     * click handler for calculate button
     */
    public void calculateAndShowResult(View view) {
        // todo: change the contents of the textView to reflect the answer (id = resultTextView)

    }

}