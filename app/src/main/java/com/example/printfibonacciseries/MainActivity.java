
// Question 2: Fibonacci Sequence
// Write a program to generate the Fibonacci sequence up to 100.
package com.example.printfibonacciseries;


import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        StringBuilder output = new StringBuilder();

        int n = 100; // Generate Fibonacci sequence up to 100
        int a = 0, b = 1;

        while (a <= n) {
            output.append(a).append(", ");
            int sum = a + b;
            a = b;
            b = sum;
        }

        textView.setText(output.toString());
    }
}
