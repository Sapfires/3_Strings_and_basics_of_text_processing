package com.epam.intro;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SubTask3 {
    public static void main(String[] args) {
        String str = readStringVariable("string: ");
        Pattern pattern = Pattern.compile("\\d{1}");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
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