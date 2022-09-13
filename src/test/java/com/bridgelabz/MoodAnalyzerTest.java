package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessageSadThanMoodAnalyzerSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actualMood1 = moodAnalyzer.analyseMood("I am in Sad Mood");
        Assert.assertEquals("sad", actualMood1);
    }

    @Test
    public void givenMessageAnyMoodThenMoodAnalyzerHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actualMood2 = moodAnalyzer.analyseMood("I am in Any Mood");
        Assert.assertEquals("Happy", actualMood2);
    }
}
