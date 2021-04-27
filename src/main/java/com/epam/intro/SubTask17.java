package com.epam.intro;

public class SubTask17 {
    private enum CharacterType {
        OPEN, SLASH, OTHER;
    }

    private enum TagType {
        OPEN, CLOSE, SELF_CLOSED;
    }

    public static void main(String[] args) {
        String inputString = "<notes>" +
                "\n\t<note id=\"1\">" +
                "\n\t\t<to>Вася</to>" +
                "\n\t\t<from>Света</from>" +
                "\n\t\t<heading>Напоминание</heading>" +
                "\n\t\t<body>Позвони мне завтра!</body>" +
                "\n\t</note>" +
                "\n\t<note id=\"2\">" +
                "\n\t\t<to>Петя</to>" +
                "\n\t\t<from>Маша</from>" +
                "\n\t\t<heading>Важное напоминание</heading>" +
                "\n\t\t<body/>" +
                "\n\t</note>" +
                "\n</notes>";
        System.out.println(inputString);
        char[] inputContent = inputString.toCharArray();
        CharacterType characterType = CharacterType.OTHER;
        StringBuilder content = new StringBuilder();
        TagType tagType = null;
        String previousContent = null;
        for (char element : inputContent) {
            if (element == '<') {
                previousContent = content.toString()
                        .replaceAll("\n","")
                        .replaceAll("\t","");
                characterType = CharacterType.OPEN;
                content = new StringBuilder();
                tagType = TagType.OPEN;
            } else if (element == '/') {
                if (characterType.equals(CharacterType.OPEN)) {
                    if(!previousContent.isEmpty()){
                        System.out.println("body: " + previousContent);
                    }

                    tagType = TagType.CLOSE;
                    content = new StringBuilder();
                }
                characterType = CharacterType.SLASH;

            } else if (element == '>') {
                if (characterType.equals(CharacterType.SLASH)) {
                    tagType = TagType.SELF_CLOSED;

                } else {
                    content = content.indexOf(" ")>0
                            ? new StringBuilder(content.substring(0, content.indexOf(" ")))
                                .append(" @")
                                .append(content.substring(content.indexOf(" ")))
                            : content;
                }
                System.out.println("tag: " + tagType + " " + content);
                content = new StringBuilder();
            } else {
                characterType = CharacterType.OTHER;
                content.append(element);
            }

        }
    }
}
