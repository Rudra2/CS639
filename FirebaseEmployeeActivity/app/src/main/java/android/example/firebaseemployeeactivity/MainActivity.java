package android.example.firebaseemployeeactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a new Employee object with last name "Doe" and first name "John"
        Employee employee = new Employee("Doe", "John");

        // Get references to the TextViews in the layout
        TextView firstNameTextView = findViewById(R.id.first_name_text_view);
        TextView lastNameTextView = findViewById(R.id.last_name_text_view);

        // Set the text of the TextViews to the first and last names of the Employee object
        firstNameTextView.setText(employee.getFirstName());
        lastNameTextView.setText(employee.getLastName());
    }
}
