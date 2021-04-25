package com.epam.intro;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubTask13 {
    public static void main(String[] args) {
        String a = readStringVariable("string: ");
        Pattern pattern = Pattern.compile("\\S+");
        Matcher matcher = pattern.matcher(a);
        String max = "";
        while ( matcher.find()) {
            String current = matcher.group();
            if (max.length() == current.length()) {
                throw new RuntimeException("There is more than one the longest word");
            }
            max = current.length() > max.length() ? current : max;
        }
        System.out.println(max);
    }





    public static String readStringVariable(String variableName) {
        System.out.println("Please input " + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
