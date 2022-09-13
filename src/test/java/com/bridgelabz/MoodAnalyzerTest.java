package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessageSadThanMoodAnalyzerSad(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String actualMood1 = moodAnalyzer.analyseMood();
        Assert.assertEquals("sad",actualMood1);
    }
    @Test
    public void  givenMessageAnyMoodThenMoodAnalyzerHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        String actualMood2 = moodAnalyzer.analyseMood();
        Assert.assertEquals("Happy",actualMood2);
    }
    @Test
    public void givenMassageIsNull(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actualMood = moodAnalyzer.analyseMood();
        Assert.assertEquals("Happy",actualMood);
    }
}
