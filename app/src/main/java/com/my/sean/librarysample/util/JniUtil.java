package com.my.sean.librarysample.util;

public class JniUtil {
    static {
        System.loadLibrary("native-lib");
    }

    public static native String stringFromJNI();
}
