package com.realpage.calculator.utils;

public final class StringUtils {

    private StringUtils() {

    }

    public static boolean isNotEmpty(final CharSequence cs) {
        return cs != null && cs.length() > 0;
    }

    public static boolean isDouble(String inputValue) {
        if (isNotEmpty(inputValue)) {
            try {
                Double.parseDouble(inputValue);
            } catch (NumberFormatException e) {
                return false;
            }
            return true;
        }
        return false;
    }
}