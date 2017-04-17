package com.vanesharma.palindromegame;

import android.content.Intent;
import android.os.Build;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;

import static junit.framework.Assert.assertTrue;


@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)

public class PalindromeActivityTest {
    private PalindromeActivity activity;

    @Before
    public void setup(){
        activity = Robolectric.setupActivity(PalindromeActivity.class);
    }

    @Test
    public void validateTextViewContent(){
        TextView palindromeTextView = (TextView) activity.findViewById(R.id.palindromeTextView);
        assertTrue("Yay! Your word is a palindrome!".equals(palindromeTextView.getText().toString()));
    }
    @Test
    public void mainActivityStarted() {
        activity.findViewById(R.id.replayButton).performClick();
        Intent expectedIntent = new Intent(activity, MainActivity.class);
        ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
        Intent actualIntent = shadowActivity.getNextStartedActivity();
        assertTrue(actualIntent.filterEquals(expectedIntent));

    }
}