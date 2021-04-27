package com.epam.intro;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SubTask16 {
    public static class Paragraph {
        String body;
        Integer numberOfSentences;

        public Paragraph(String body, int numberOfSentences) {
            this.numberOfSentences = numberOfSentences;
            this.body = body;
        }
    }

    private static class Lexema {
        String value;
        int countOfSymbols;

        public Lexema(String value) {
            this.value = value;
            this.countOfSymbols = 0;
        }
    }

    public static void main(String[] args) {
        String str = "Настя - умничка. Настя - большая умничка.\nНастя всегда была, есть и будет большой умничкой.";
        task3(str);

    }

    private static void task3(String str) {
        String searchString = "б";
        Pattern sentencePattern = Pattern.compile("[^.!?]+");
        Matcher sentenceMatcher = sentencePattern.matcher(str);
        while (sentenceMatcher.find()) {
            List<Lexema> words = new ArrayList<>();
            Pattern wordPattern = Pattern.compile("[^\\s,\n-]+");
            Matcher wordMatcher = wordPattern.matcher(sentenceMatcher.group());
            while (wordMatcher.find()) {
                words.add(new Lexema(wordMatcher.group()));
            }
            List<String> result = words.stream()
                    .peek(it -> it.countOfSymbols = countNumber(it.value, searchString))
                    .sorted((o1, o2) -> o2.countOfSymbols - o1.countOfSymbols == 0
                            ? o1.value.toLowerCase().compareTo(o2.value.toLowerCase())
                            : o2.countOfSymbols - o1.countOfSymbols)
                    .map(it -> it.value)
                    .collect(Collectors.toList());
            System.out.println(String.join(" ", result));
        }
    }

    private static int countNumber(String lexema, String search) {
        Pattern searchPattern = Pattern.compile(search);
        Matcher searchMatcher = searchPattern.matcher(lexema);
        int count = 0;
        while (searchMatcher.find()) {
            count++;
        }
        return count;
    }

    private static void task2(String str) {
        Pattern sentencePattern = Pattern.compile("[^.!?]+");
        Matcher sentenceMatcher = sentencePattern.matcher(str);
        while (sentenceMatcher.find()) {
            List<String> words = new ArrayList<>();
            Pattern wordPattern = Pattern.compile("[^\\s,]+");
            Matcher wordMatcher = wordPattern.matcher(sentenceMatcher.group());
            while (wordMatcher.find()) {
                words.add(wordMatcher.group());
            }
            words = words.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
            System.out.println(String.join(" ", words));
        }
    }

    private static void task1(String str) {
        Pattern pattern = Pattern.compile("[^\n]+");
        Matcher matcher = pattern.matcher(str);
        List<Paragraph> paragraphs = new ArrayList<>();
        while (matcher.find()) {
            str = matcher.group();
            System.out.println(str);
            Pattern sentencePattern = Pattern.compile("[^.!?]+");
            Matcher sentenceMatcher = sentencePattern.matcher(matcher.group());
            int count = 0;
            while (sentenceMatcher.find()) {
                count++;
            }
            paragraphs.add(new Paragraph(str, count));
        }
        paragraphs = paragraphs.stream().sorted((Comparator.comparing(o -> o.numberOfSentences))).collect(Collectors.toList());
        paragraphs.forEach(it -> System.out.println(it.body));
    }


}
