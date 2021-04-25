package com.epam.intro;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubTask15 {
    public static void main(String[] args) {
        String a = readStringVariable("string: ");
        Pattern pattern = Pattern.compile("[!?.]");
        Matcher matcher = pattern.matcher(a);
        int count = 0;
        while ( matcher.find()) {
            count++;
        }
        System.out.println(count);
    }

    public static String readStringVariable(String variableName) {
        System.out.println("Please input " + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
