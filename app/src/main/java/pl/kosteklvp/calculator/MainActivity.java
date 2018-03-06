package pl.kosteklvp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {



    List<Float> listOfNumbersEntered = new ArrayList<>();
    List<Character> listOfCharsEntered = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText editText = findViewById(R.id.editText);
        final Button button1 = findViewById(R.id.button1);
        final Button button2 = findViewById(R.id.button2);
        final Button button3 = findViewById(R.id.button3);
        final Button button4 = findViewById(R.id.button4);
        final Button button5 = findViewById(R.id.button5);
        final Button button6 = findViewById(R.id.button6);
        final Button button7 = findViewById(R.id.button7);
        final Button button8 = findViewById(R.id.button8);
        final Button button9 = findViewById(R.id.button9);
        final Button button0 = findViewById(R.id.button0);
        final Button buttonB = findViewById(R.id.buttonB);
        final Button buttonC = findViewById(R.id.buttonC);
        final Button button_plus = findViewById(R.id.button_plus);
        final Button button_minus = findViewById(R.id.button_minus);
        final Button button_divide = findViewById(R.id.button_divide);
        final Button button_multiply = findViewById(R.id.button_multiply);
        final Button button_square = findViewById(R.id.button_square);
        final Button button_squareroot = findViewById(R.id.button_squareroot);
        final Button button_equals = findViewById(R.id.button_equals);
        final Button button_dot = findViewById(R.id.button_dot);
        editText.setKeyListener(null);



            button1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    editText.setText(editText.getText() + "1");
                }
            });

            button2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    editText.setText(editText.getText() + "2");
                }
            });

            button3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    editText.setText(editText.getText() + "3");
                }
            });

            button4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    editText.setText(editText.getText() + "4");
                }
            });

            button5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    editText.setText(editText.getText() + "5");
                }
            });

            button6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    editText.setText(editText.getText() + "6");
                }
            });

            button7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    editText.setText(editText.getText() + "7");
                }
            });

            button8.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    editText.setText(editText.getText() + "8");
                }
            });

            button9.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    editText.setText(editText.getText() + "9");
                }
            });

            button0.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    editText.setText(editText.getText() + "0");
                }
            });

            buttonB.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    editText.setText(editText.getText().subSequence(0, editText.getText().length()-1));
                }
            });

            buttonC.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    editText.getText().clear();
                }
            });

            button_dot.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    editText.setText(editText.getText() + ".");
                }
            });

            button_divide.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    listOfNumbersEntered.add(Float.parseFloat(editText.getText().toString()));
                    listOfCharsEntered.add('/');
                    editText.getText().clear();
                }
            });

            button_equals.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    listOfNumbersEntered.add(Float.parseFloat(editText.getText().toString()));

                    float equal = 0;

                    for(int i=0; i<listOfNumbersEntered.size(); i++) {
                        switch (listOfCharsEntered.get(i)) {

                            case '+':
                                equal = equal + listOfNumbersEntered.get(i);
                                break;

                            case '-':
                                equal = equal - listOfNumbersEntered.get(i);
                                break;

                            case '*':
                                equal = equal * listOfNumbersEntered.get(i);
                                break;

                            case '/':
                                equal = equal / listOfNumbersEntered.get(i);
                                break;

                            case '2':
                                equal = equal * equal;
                                break;

                            case 'v':
                                break;
                        }
                    }
                    editText.setText((int) equal);
                }
            });

            button_minus.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    listOfNumbersEntered.add(Float.parseFloat(editText.getText().toString()));
                    listOfCharsEntered.add('-');
                    editText.getText().clear();
                }
            });

            button_multiply.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    listOfNumbersEntered.add(Float.parseFloat(editText.getText().toString()));
                    listOfCharsEntered.add('*');
                    editText.getText().clear();
                }
            });

            button_plus.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    listOfNumbersEntered.add(Float.parseFloat(editText.getText().toString()));
                    listOfCharsEntered.add('+');
                    editText.getText().clear();
                }
            });

            button_square.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    listOfNumbersEntered.add(Float.parseFloat(editText.getText().toString()));
                    listOfCharsEntered.add('2');
                    editText.getText().clear();
                }
            });

            button_squareroot.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    listOfNumbersEntered.add(Float.parseFloat(editText.getText().toString()));
                    listOfCharsEntered.add('v');
                    editText.getText().clear();
                }
            });


    }


}
