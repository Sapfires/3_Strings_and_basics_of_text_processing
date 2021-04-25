package com.epam.intro;

import java.util.Scanner;

public class SubTask2 {
    public static void main(String[] args) {
        String str = readStringVariable("string: ");
        String replace = str.replaceAll("word", "letter");
        System.out.println(replace);
    }
    public static String readStringVariable(String variableName) {
        System.out.println("Please input " + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
