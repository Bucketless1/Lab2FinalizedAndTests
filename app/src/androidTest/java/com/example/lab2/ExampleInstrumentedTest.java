package com.example.lab2;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.instanceOf;
import static java.util.EnumSet.allOf;

import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.RootMatchers;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4ClassRunner.class)
@LargeTest
public class ExampleInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule
            = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void checkInitialState() {
        // Check if the initial text in the TextView is "Hello World!"
        Espresso.onView(ViewMatchers.withId(R.id.tvMain))
                .check(ViewAssertions.matches(withText("Hello World!")));
    }

    @Test
    public void enterTextAndCountSymbols() {
        // Enter text into the EditText
        Espresso.onView(ViewMatchers.withId(R.id.edUserInput))
                .perform(ViewActions.typeText("Test text"));

        // Click the Count button
        Espresso.onView(ViewMatchers.withId(R.id.btnCount))
                .perform(click());

        // Check if the text view displays the correct symbol count (for "Test text" it should be 9)
        Espresso.onView(ViewMatchers.withId(R.id.tvMain))
                .check(ViewAssertions.matches(withText("9")));
    }
}
