package com.java.playground.textblocks;

public class TextBlock1 {
    public static void main(String[] args) {
        String textBlock = """
                This is a text block example.
                It can span multiple lines.
                It preserves the formatting and indentation.
                """;

        String textBlock1 = """
                This is a text block example.
                It can span multiple lines.
                It preserves the formatting and indentation.
            """;
        String textBlock2 = """
                This is a text block example.
                It can span multiple lines.
                It preserves the formatting and indentation.
                    """;
        String textBlock3 = """
                This is a text block example.
                It can span multiple lines.
                It preserves the formatting and indentation.""";

        System.out.println(textBlock);
        System.out.println(textBlock1);
        System.out.println(textBlock2);
        System.out.println(textBlock3);
    }
}
