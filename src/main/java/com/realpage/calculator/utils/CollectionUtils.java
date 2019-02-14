package com.realpage.calculator.utils;


import java.util.Collection;

public final class CollectionUtils {

    private CollectionUtils() {

    }

    public static boolean isNotEmpty(Collection collection) {
        return collection != null && collection.size() > 0;
    }
}