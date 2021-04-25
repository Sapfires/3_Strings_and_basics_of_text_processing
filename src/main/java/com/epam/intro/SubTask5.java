package com.epam.intro;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubTask5 {
    public static void main(String[] args) {
        String str = readStringVariable("string: ");
        str = str.replaceAll("\\s{2,}", " ");
        System.out.println(str);
    }


    public static String readStringVariable(String variableName) {
        System.out.println("Please input " + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
