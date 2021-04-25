package com.epam.intro;

import java.util.Locale;
import java.util.Scanner;

public class SubTask1 {
    public static void main(String[] args) {
        int lengthOfArray = readVariable("Length of Array: ");
        String[] a = new String[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            a[i] = readStringVariable("a[" + i + "]");
        }
        for (int i = 0; i < lengthOfArray; i++) {
            String[] charArray = new String[a[i].length()];
            for (int j = 0; j < a[i].length(); j++) {
               charArray[j] = a[i].substring(j, j+1);
            }
            a[i] = "";
            for (int j = 0; j < charArray.length; j++) {
                a[i] = a[i] + transform(charArray[j]);
            }
        }
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println(a[i]);
        }
    }

    private static String transform(String s) {
        return s.toLowerCase().equals(s) ? s : "_" + s.toLowerCase();
    }


    public static int readVariable(String variableName) {
        System.out.println("Please input in camelCase" + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static String readStringVariable(String variableName) {
        System.out.println("Please input " + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
