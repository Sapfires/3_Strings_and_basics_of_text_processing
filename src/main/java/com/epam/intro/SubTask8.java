package com.epam.intro;

import java.util.Scanner;

public class SubTask8 {
    public static void main(String[] args) {
        String str = readStringVariable("string: ");
        boolean isPalindrom = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (!str.substring(i, i + 1).equals(str.substring(str.length() - i - 1, str.length() - i))) {
                isPalindrom = false;
                break;
            }
        }
        System.out.println(isPalindrom);
    }


    public static String readStringVariable(String variableName) {
        System.out.println("Please input " + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
