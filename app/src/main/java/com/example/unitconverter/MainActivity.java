package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView title,result;
    EditText editText;

    Button button1,button2;

    double kilos=0.0;
    String input=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title=findViewById(R.id.title);
        title.setText("Welcome to Unit Converter App");

        result=findViewById(R.id.result);

        editText=findViewById(R.id.editText);


        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    input=editText.getText().toString();

                    if(input.isEmpty()) {
                        Toast.makeText(MainActivity.this,
                                "Please enter the value in kilos",
                                Toast.LENGTH_SHORT).show();
                    }

                    else {

                        try{
                            input = editText.getText().toString();
                            kilos = Double.parseDouble(input);
                            double pounds = kilos * 2.20462;
                            result.setText("Result :\n"+pounds+" lb");

                        }
                        catch (NumberFormatException e){
                            Toast.makeText(MainActivity.this, "Please enter a numeric value", Toast.LENGTH_SHORT).show();;
                        }


                    }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Result : 0.0 lb");
                editText.getText().clear();
                kilos=0.0;

            }
        });




    }
}