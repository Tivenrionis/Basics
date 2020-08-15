package com.tiven.questy.DebugingAndTesting;

public class StringUtilities {
    private StringBuilder stringBuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder sb, char c) {
        sb.append(c);
        charsAdded++;
    }

    public String upperAndPrefix(String str) {
        String upper = str.toUpperCase();
        return "Prefix " + upper;
    }

    public String addSuffic(String str) {
        return str + "__Suffix";
    }
}
