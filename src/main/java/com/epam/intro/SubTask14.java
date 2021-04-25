package com.epam.intro;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SubTask14 {
    public static void main(String[] args) {
        String str = readStringVariable("string: ");
        Pattern lowerCasePattern = Pattern.compile("[a-z]");
        Pattern upperCasePattern = Pattern.compile("[A-Z]");
        Matcher lowerCaseMatcher = lowerCasePattern.matcher(str);
        Matcher upperCaseMatcher = upperCasePattern.matcher(str);
        int lowerCount = 0;
        int upperCount = 0;
        while (lowerCaseMatcher.find()) {
            lowerCount++;
        }
        while (upperCaseMatcher.find()) {
            upperCount++;
        }
        System.out.println(lowerCount + " " + upperCount);
    }

    public static String readStringVariable(String variableName) {
        System.out.println("Please input " + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
