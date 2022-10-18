package com.example.lab5calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public TextView outputText;
    public double operand;
    public double operand1;
    public String operator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputText = (TextView) findViewById(R.id.output);
        operand = 0.0; // starting value
        operand1 = 0.0; // starting value
        operator = "";

        // we have stated that this activity "implments" a click listener so it will receive such events
        // remember the pattern here is:
        // Datatype variableName = (Datatype)findViewById(ask resource manager object R for button by id
        // note that the variableName DOES NOT need to be identical to the id to function, that's just for consistency
        Button buttonC = (Button)findViewById(R.id.buttonC);
        Button buttonPlus = (Button)findViewById(R.id.buttonPlus);
        Button buttonMinus = (Button)findViewById(R.id.buttonMinus);
        Button buttonDiv = (Button)findViewById(R.id.buttonDiv);
        Button buttonMult = (Button)findViewById(R.id.buttonMult);
        Button button0 = (Button)findViewById(R.id.button0);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);
        Button buttonEqual = (Button)findViewById(R.id.buttonEqual);
        Button buttonDot = (Button)findViewById(R.id.buttonDot);
        // link this activity object to each button as the event listener
        buttonC.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonMult.setOnClickListener(this);
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
    }

    // Implement the OnClickListener callback as promised
    public void onClick(View v) {
        String val = "";
        switch(v.getId()) {
            case R.id.buttonC:
                operand = 0.0;
                operand1 = 0.0;
                outputText.setText("0");
                operator = "";
                break;
            case R.id.button0:
                val = (String) outputText.getText();
                if (val != "0"){
                    val += "0";
                }
                outputText.setText(val);
                break;
            case R.id.button1:
                val = (String) outputText.getText();
                if (val.equals("0")) {
                    val = "1";
                }  else {
                    val += "1";
                }
                outputText.setText(val);
                break;
            case R.id.button2:
                val = (String) outputText.getText();
                if (val.equals("0")) {
                    val = "2";
                }  else {
                    val += "2";
                }
                outputText.setText(val);
                break;
            case R.id.button3:
                val = (String) outputText.getText();
                if (val.equals("0")) {
                    val = "3";
                }  else {
                    val += "3";
                }
                outputText.setText(val);
                break;
            case R.id.button4:
                val = (String) outputText.getText();
                if (val.equals("0")) {
                    val = "4";
                }  else {
                    val += "4";
                }
                outputText.setText(val);
                break;
            case R.id.button5:
                val = (String) outputText.getText();
                if (val.equals("0")) {
                    val = "5";
                }  else {
                    val += "5";
                }
                outputText.setText(val);
                break;
            case R.id.button6:
                val = (String) outputText.getText();
                if (val.equals("0")) {
                    val = "6";
                }  else {
                    val += "6";
                }
                outputText.setText(val);
                break;
            case R.id.button7:
                val = (String) outputText.getText();
                if (val.equals("0")) {
                    val = "7";
                }  else {
                    val += "7";
                }
                outputText.setText(val);
                break;
            case R.id.button8:
                val = (String) outputText.getText();
                if (val.equals("0")) {
                    val = "8";
                }  else {
                    val += "8";
                }
                outputText.setText(val);
                break;
            case R.id.button9:
                val = (String) outputText.getText();
                if (val.equals("0")) {
                    val = "9";
                }  else {
                    val += "9";
                }
                outputText.setText(val);
                break;
            case R.id.buttonPlus:
                val = (String) outputText.getText();
                operand1 = Double.parseDouble(val);
                operator = "+";
                outputText.setText("0");
                break;
            case R.id.buttonMinus:
                val = (String) outputText.getText();
                operand1 = Double.parseDouble(val);
                operator = "-";
                outputText.setText("0");
                break;
            case R.id.buttonDiv:
                val = (String) outputText.getText();
                operand1 = Double.parseDouble(val);
                operator = "/";
                outputText.setText("0");
                break;
            case R.id.buttonMult:
                val = (String) outputText.getText();
                operand1 = Double.parseDouble(val);
                operator = "*";
                outputText.setText("0");
                break;
            case R.id.buttonEqual:
                Double result = 0.0;
                if (!operator.equals("")) {
                    val = (String) outputText.getText();
                    operand = Double.parseDouble(val);
                    switch(operator) {
                        case "+":
                            result = operand1 + operand;
                            break;
                        case "-":
                            result = operand1 - operand;
                            break;
                        case "*":
                            result = operand1 * operand;
                            break;
                        case "/":
                            result = operand1 / operand;
                            break;
                    }
                    operator = "";
                    // tests whether a number can be represented as an integer (i.e. no decimal place)
                    // if so, truncate the value with no zeros, otherwise just use the decimal value
                    // this allows the result to be used as a decimal later by the dot button if user wants
                    if (result == Math.floor(result)) {
                        val = String.format("%.0f", result); //Format is: 0 places after decimal point
                    } else {
                        val = Double.toString(result);
                    }
                    outputText.setText(val);
                }
                break;
            case R.id.buttonDot:
                val = (String) outputText.getText();
                // check whether there's a decimal already using the String contains method
                if (!val.contains(".")){
                    val += ".";
                    operand = Double.parseDouble(val);
                }
                outputText.setText(val);
                break;

        }
    }
}