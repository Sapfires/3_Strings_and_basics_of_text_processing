package com.epam.intro;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SubTask12 {
    public static void main(String[] args) {
        String str = readStringVariable("string: ");
        str = str.replaceAll("\\s", "");
        String result = Arrays.stream(getStringAsArray(str)).distinct().collect(Collectors.joining());
        System.out.println(result);
    }
    private static String[] getStringAsArray(String iString) {
        String[] a = new String[iString.length()];
        for (int j = 0; j < iString.length(); j++) {
            a[j] = iString.substring(j, j + 1);
        }
        return a;
    }


    public static String readStringVariable(String variableName) {
        System.out.println("Please input " + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
