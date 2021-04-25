package com.epam.intro;

import java.util.Scanner;

public class SubTask11 {
    public static void main(String[] args) {
        String str = readStringVariable("string: ");
        String[] strAsArray = getStringAsArray(str);
        String result = "";
        for (int i = 0; i < strAsArray.length; i++) {
            result = result + strAsArray[i] + strAsArray[i];
        }
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
