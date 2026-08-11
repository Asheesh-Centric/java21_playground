package com.java.playground.textblocks;

public class TextBlock3 {
    public static void main(String[] args) {
        String textBlock = """
                {
                    "Name": "John Doe",
                    "Age": 30,
                    "Address": {
                        "Street": "123 Main St",
                        "City": "Anytown"
                    }
                }
                """;

        String textBlock1 = """
                {
                    "Name": "John Doe",
                    "Age": 30,
                    "Address": {
                        "Street": "123 Main St",\
                        "City": "Anytown"
                    }
                }""";

        String textBlock2 = """
                {
                    "Name": "John Doe", \s \
                    "Age": 30,
                    "Address": {
                        "Street": "123 Main St",
                        "City": "Anytown"
                    }
                }""";

        System.out.println(textBlock);
        System.out.println(textBlock1);
        System.out.println(textBlock2);
    }
}
