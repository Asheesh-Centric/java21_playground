package com.java.playground.textblocks;

public class TextBlock4 {
    public static void main(String[] args) {
        String textBlock = """
              Hello
              World
              """;

        String textBlock1 = """
              Hello
              World
          """;

        System.out.println(textBlock.stripIndent());
        System.out.println(textBlock1.stripIndent());
    }
}
