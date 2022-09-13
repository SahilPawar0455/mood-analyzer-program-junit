package com.bridgelabz;

public class MoodAnalyzer {
    static String mood;
    private String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.equals("I am in Sad Mood")) {
            return mood = "sad";
        } else {
            return mood = "Happy";
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome the Mood Analyzer Program");
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        System.out.println(moodAnalyzer.analyseMood());
    }
}
