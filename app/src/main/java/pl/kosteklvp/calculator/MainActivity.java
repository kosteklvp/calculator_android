package pl.kosteklvp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.addExact;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {



    List<Double> listOfNumbersEntered = new ArrayList<>();
    List<Character> listOfCharsEntered = new ArrayList<>();
    List<String> history = new ArrayList<>();

    int countOfHistory = 1;


    public static String format(double d)
    {
        if(d == (long) d)
            return String.format("%d",(long)d);
        else
            return String.format("%s",d);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText editText = findViewById(R.id.editText);
        final TextView textView = findViewById(R.id.textView2);
        final TextView textViewHistory = findViewById(R.id.textView5);
        final ScrollView scrollView = findViewById(R.id.scroolView);

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
        getSupportActionBar().setTitle(R.string.xxx);




            editText.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if(textViewHistory.getVisibility() == View.VISIBLE) {
                        textViewHistory.setVisibility(View.INVISIBLE);
                    } else {
                        textViewHistory.setVisibility(View.VISIBLE);
                    }

                    if(scrollView.getVisibility() == View.VISIBLE) {
                        scrollView.setVisibility(View.INVISIBLE);
                    } else {
                        scrollView.setVisibility(View.VISIBLE);
                    }
                }
            });

            textViewHistory.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if(textViewHistory.getVisibility() == View.VISIBLE) {
                        textViewHistory.setVisibility(View.INVISIBLE);
                    } else {
                        textViewHistory.setVisibility(View.VISIBLE);
                    }

                    if(scrollView.getVisibility() == View.VISIBLE) {
                        scrollView.setVisibility(View.INVISIBLE);
                    } else {
                        scrollView.setVisibility(View.VISIBLE);
                    }
                }
            });

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
                    if(!editText.getText().toString().equals("") ) {
                        editText.setText(editText.getText().subSequence(0, editText.getText().length() - 1));
                        textView.setText("");
                    }
                }
            });

            buttonC.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(!editText.getText().toString().equals("") ) {
                        editText.getText().clear();
                        textView.setText("");
                    }
                }
            });

            button_dot.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    editText.setText(editText.getText() + ".");
                }
            });

            button_divide.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(!editText.getText().toString().equals("") ) {
                        listOfNumbersEntered.add(Double.parseDouble(editText.getText().toString()));
                        listOfCharsEntered.add('/');
                        editText.getText().clear();
                        textView.setText("/");
                    }

                }
            });

            button_equals.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {


                    if(!editText.getText().toString().equals("") || listOfNumbersEntered.size()>1) {
                        listOfNumbersEntered.add(Double.parseDouble(editText.getText().toString()));

                        if(listOfNumbersEntered.size()>1) {
                            history.add("#" + String.valueOf(countOfHistory) + " | ");
                            countOfHistory++;
                            history.set(history.size() - 1, history.get(history.size() - 1) + String.valueOf(format(listOfNumbersEntered.get(0))));
                        }

                        double equal = 0;

                        for (int i = 0; i < listOfNumbersEntered.size() - 1; i++) {
                            switch (listOfCharsEntered.get(i)) {

                                case '+':
                                    listOfNumbersEntered.set(i + 1, listOfNumbersEntered.get(i) + listOfNumbersEntered.get(i + 1));
                                    history.set(history.size()-1, history.get(history.size()-1) + " + " + String.valueOf(format(listOfNumbersEntered.get(i + 1) - listOfNumbersEntered.get(i))));
                                    equal = listOfNumbersEntered.get(i + 1);
                                    break;

                                case '-':
                                    listOfNumbersEntered.set(i + 1, listOfNumbersEntered.get(i) - listOfNumbersEntered.get(i + 1));
                                    history.set(history.size()-1, history.get(history.size()-1) + " - " + String.valueOf(format(listOfNumbersEntered.get(i) - listOfNumbersEntered.get(i+1))));
                                    equal = listOfNumbersEntered.get(i + 1);
                                    break;

                                case '*':
                                    listOfNumbersEntered.set(i + 1, listOfNumbersEntered.get(i) * listOfNumbersEntered.get(i + 1));
                                    history.set(history.size()-1, history.get(history.size()-1) + " x " + String.valueOf(format(listOfNumbersEntered.get(i + 1) / listOfNumbersEntered.get(i))));
                                    equal = listOfNumbersEntered.get(i + 1);
                                    break;

                                case '/':
                                    listOfNumbersEntered.set(i + 1, listOfNumbersEntered.get(i) / listOfNumbersEntered.get(i + 1));
                                    history.set(history.size()-1, history.get(history.size()-1) + " / " + String.valueOf(format(listOfNumbersEntered.get(i) / listOfNumbersEntered.get(i+1))));
                                    equal = listOfNumbersEntered.get(i + 1);
                                    break;

                            }

                        }

                        if(listOfNumbersEntered.size()>1) {
                            editText.setText(String.valueOf(format(equal)));

                            history.set(history.size() - 1, history.get(history.size() - 1) + " = " + String.valueOf(format(equal)));

                            textViewHistory.setText(history.get(history.size() - 1) + "\n" + textViewHistory.getText());
                        }
                        listOfNumbersEntered.clear();
                        listOfCharsEntered.clear();
                        textView.setText("");
                    }
                }
            });

            button_minus.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(!editText.getText().toString().equals("") ) {
                        listOfNumbersEntered.add(Double.parseDouble(editText.getText().toString()));
                        listOfCharsEntered.add('-');
                        editText.getText().clear();
                        textView.setText("-");
                    }
                }
            });

            button_multiply.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(!editText.getText().toString().equals("") ) {
                        listOfNumbersEntered.add(Double.parseDouble(editText.getText().toString()));
                        listOfCharsEntered.add('*');
                        editText.getText().clear();
                        textView.setText("x");
                    }
                }
            });

            button_plus.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(!editText.getText().toString().equals("") ) {
                        listOfNumbersEntered.add(Double.parseDouble(editText.getText().toString()));
                        listOfCharsEntered.add('+');
                        editText.getText().clear();
                        textView.setText("+");
                    }
                }
            });

            button_square.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!editText.getText().toString().equals("")) {

                        history.add("#" + String.valueOf(countOfHistory) + " | ");
                        countOfHistory++;
                        history.set(history.size() - 1, history.get(history.size() - 1) + String.valueOf(editText.getText()) + "² = ");
                        editText.setText(String.valueOf(format(pow(Double.parseDouble(editText.getText().toString()), 2))));
                        textView.setText("");

                        history.set(history.size() - 1, history.get(history.size() - 1) + String.valueOf(editText.getText()));
                        textViewHistory.setText(history.get(history.size() - 1) + "\n" + textViewHistory.getText());
                    }
                }
            });

            button_squareroot.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(!editText.getText().toString().equals("") ) {

                        history.add("#" + String.valueOf(countOfHistory) + " | ");
                        countOfHistory++;
                        history.set(history.size() - 1, history.get(history.size() - 1) + "√" + String.valueOf(editText.getText()) + " = ");
                        editText.setText(String.valueOf(format(sqrt(Double.parseDouble(editText.getText().toString())))));
                        textView.setText("");
                        history.set(history.size() - 1, history.get(history.size() - 1) + String.valueOf(editText.getText()));
                        textViewHistory.setText(history.get(history.size() - 1) + "\n" + textViewHistory.getText());
                    }
                }
            });


    }


}
