package android.example.conversionrudrachobev1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {


    private EditText editTextMiles;
    private Button buttonConvert;
    private TextView textViewKms;

    private TextView textsafe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextMiles = findViewById(R.id.editTextMiles);
        buttonConvert = findViewById(R.id.buttonConvert);
        textViewKms = findViewById(R.id.textViewKms);
        textsafe = findViewById(R.id.textsafe);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertMilesToKm();
            }
        });
    }
    private void convertMilesToKm() {
        double miles = Double.parseDouble(editTextMiles.getText().toString());
        double kilometers = miles * 1.609;
        textViewKms.setText(String.format("%.2f kms", kilometers));
        if (kilometers < 50) {
            textsafe.setText("You are driving at a Safe Speed");
        } else {
            textsafe.setText("Please reduce speed and drive safe");
        }
    }
}