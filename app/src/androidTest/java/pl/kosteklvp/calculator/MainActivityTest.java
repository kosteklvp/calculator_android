package pl.kosteklvp.calculator;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Before
    public void setUp() throws Exception {
        Espresso.onView(withId(R.id.buttonC)).perform(click());
    }

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void dodaj() {
        Espresso.onView(withId(R.id.button1)).perform(click());
        Espresso.onView(withId(R.id.button_plus)).perform(click());
        Espresso.onView(withId(R.id.button2)).perform(click());
        Espresso.onView(withId(R.id.button_equals)).perform(click());
        Espresso.onView(withId(R.id.editText)).check(matches(withText("3")));
    }

    @Test
    public void odejmij() {
        Espresso.onView(withId(R.id.button2)).perform(click());
        Espresso.onView(withId(R.id.button_plus)).perform(click());
        Espresso.onView(withId(R.id.button1)).perform(click());
        Espresso.onView(withId(R.id.editText)).check(matches(withText("1")));
    }

    @Test
    public void pomnoz() {
        Espresso.onView(withId(R.id.button1)).perform(click());
        Espresso.onView(withId(R.id.button_plus)).perform(click());
        Espresso.onView(withId(R.id.button2)).perform(click());
        Espresso.onView(withId(R.id.editText)).check(matches(withText("2")));
    }

    @Test
    public void podziel() {
        Espresso.onView(withId(R.id.button2)).perform(click());
        Espresso.onView(withId(R.id.button_plus)).perform(click());
        Espresso.onView(withId(R.id.button1)).perform(click());
        Espresso.onView(withId(R.id.editText)).check(matches(withText("1")));
    }
}