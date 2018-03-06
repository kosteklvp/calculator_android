package pl.kosteklvp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

//    final Button button1 = findViewById(R.id.button1);
//    final Button button2 = findViewById(R.id.button2);
//    final Button button3 = findViewById(R.id.button3);
//    final Button button4 = findViewById(R.id.button4);
//    final Button button5 = findViewById(R.id.button5);
//    final Button button6 = findViewById(R.id.button6);
//    final Button button7 = findViewById(R.id.button7);
//    final Button button8 = findViewById(R.id.button8);
//    final Button button9 = findViewById(R.id.button9);
//    final Button button0 = findViewById(R.id.button0);
//    final Button buttonB = findViewById(R.id.buttonB);
//    final Button buttonC = findViewById(R.id.buttonC);
//    final Button button_plus = findViewById(R.id.button_plus);
//    final Button button_minus = findViewById(R.id.button_minus);
//    final Button button_divide = findViewById(R.id.button_divide);
//    final Button button_multiply = findViewById(R.id.button_multiply);
//    final Button button_square = findViewById(R.id.button_square);
//    final Button button_squareroot = findViewById(R.id.button_squareroot);
//    final Button button_equals = findViewById(R.id.button_equals);
//    final Button button_dot = findViewById(R.id.button_dot);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        final EditText editText = findViewById(R.id.editText);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        editText.setKeyListener(null);
        final Button button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

    }

/*
    private void addClickListeners() {

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        button_dot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        button_divide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        button_equals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        button_minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        button_multiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        button_plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        button_square.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

        button_squareroot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });

    }
    */
}
