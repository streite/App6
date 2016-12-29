package com.mairyu.app6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView txtResult = (TextView) findViewById(R.id.txtResult);
        final EditText edtNumber = (EditText) findViewById(R.id.edtNumber);
        Button btnResult = (Button) findViewById(R.id.btnResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textFieldValue = edtNumber.getText() + "";
                int intValue = Integer.parseInt(textFieldValue);
                String result = "";

/*                if (textFieldValue.contains("51")) {
                    txtResult.setText(textFieldValue + "Great");

                } else {

                    txtResult.setText("The Value is not 51, the value is: " + textFieldValue);
                }*/

/*                if (textFieldValue.contains("90")) {
                    result = "Your Grade is A and your number is: " + textFieldValue;
                } else if (textFieldValue.contains("80")) {
                    result = "Your Grade is B and your number is: " + textFieldValue;
                } else {
                    result = "You are not sufficient";
                }*/

                if (intValue > 90) {
                    result = "Your Grade is A and your number is: " + textFieldValue;

                } else if (intValue > 80){
                    result = "Your Grade is B and your number is: " + textFieldValue;

                } else {
                    result = "You are not accepted";
                }

                txtResult.setText(result);
            }
        });
    }
}
