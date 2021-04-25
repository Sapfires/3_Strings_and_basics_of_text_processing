package com.epam.intro;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubTask6 {
    public static void main(String[] args) {
        String str = readStringVariable("string: ");
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(str);
        int max = 0;
        while (matcher.find()) {
            max = Math.max(matcher.end() - matcher.start(), max);
        }
        System.out.println(max);
    }


    public static String readStringVariable(String variableName) {
        System.out.println("Please input " + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
