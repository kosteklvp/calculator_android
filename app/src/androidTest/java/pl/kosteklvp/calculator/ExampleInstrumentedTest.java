package pl.kosteklvp.calculator;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityUnitTestCase;
import android.widget.Button;
import android.widget.EditText;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class ExampleInstrumentedTest {

//    private MainActivity activity;
//
//    private Button buttonDodaj;
//    private Button buttonOdejmij;
//    private Button buttonPomnoz;
//    private Button buttonDziel;
//    private Button buttonRownaSie;
//    private Button button1;
//    private Button button2;
//    private EditText editText;
//
//    @Rule
//    public ActivityTestRule<MainActivity> rule  = new  ActivityTestRule<>(MainActivity.class);
//
//    public ExampleInstrumentedTest() {
//        super(MainActivity.class);
//    }
//
//    @Test
//    public void dodaj() {
//        activity = rule.getActivity();
//        buttonDodaj = (Button) activity.findViewById(R.id.button_plus);
//        buttonOdejmij = (Button) activity.findViewById(R.id.button_minus);
//        buttonDziel = (Button) activity.findViewById(R.id.button_divide);
//        buttonPomnoz = (Button) activity.findViewById(R.id.button_multiply);
//        button1 = (Button) activity.findViewById(R.id.button1);
//        button2 = (Button) activity.findViewById(R.id.button2);
//        buttonRownaSie = (Button) activity.findViewById(R.id.button_equals);
//        editText = (EditText) activity.findViewById(R.id.editText);
//        button1.performClick();
//    }

    @Before
    public void setUp() throws Exception {
//        onView();
    }

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);
}

