package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> aAtR = new ActivityTestRule<>(MainActivity.class);


}