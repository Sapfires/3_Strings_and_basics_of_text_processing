package com.epam.intro;

import java.util.Scanner;

public class SubTask7 {
    public static void main(String[] args) {
        String str = readStringVariable("string: ");
        str = str.replaceAll("a", "ab");
        System.out.println(str);
    }


    public static String readStringVariable(String variableName) {
        System.out.println("Please input " + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
