package com.bridgelabz;

public class MoodAnalyzer {
    static String mood;

    public String analyseMood(String message) {
        if (message.equals("I am in Sad Mood")) {
            return mood = "sad";
        } else {
            return mood = "Happy";
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome the Mood Analyzer Program");
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        System.out.println("Current mood is " + moodAnalyzer.analyseMood("I am in Sad Mood"));
    }
}
