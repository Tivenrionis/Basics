package com.tiven.questy.codingChallanges;

public class SecondsAndMinutesChallange {

    public static String getDurationString(int minutes, int seconds) {

        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            return String.format("%sh %sm %ss", minutes / 60, minutes % 60, seconds);
        } else return "Invalid value";
    }
    public static String getDurationString(int seconds) {

        if (seconds >= 0 ) {

            return getDurationString(seconds/60,seconds%60);

        } else return "Invalid value";
    }
}
