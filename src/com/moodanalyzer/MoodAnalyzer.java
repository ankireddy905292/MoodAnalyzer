package com.moodanalyzer;

public class MoodAnalyzer {
    public static void main(String[] args) {

    }
    private String message;
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if(message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}

