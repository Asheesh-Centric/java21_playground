package com.java.playground.textblocks;

public class TextBlock2 {
    public static void main(String[] args) {
        String textBlock = """
                <html>
                    <head>
                        <title>Text Block Example</title>
                    </head>
                    <body>
                        <h1>Hello, World!</h1>
                        <p>This is a text block example.</p>
                    </body>
                </html>
                """;
        String textBlock1 = """
                <html>
                    <head>
                        <title>Text Block Example</title>
                    </head>
                    <body>
                        <h1>Hello, World!</h1>
                        <p>This is a text block example.</p>
                    </body>
           </html>""";
        String textBlock2 = """
                <html>
                    <head>
                        <title>Text Block Example</title>
                    </head>
                    <body>
                        <h1>Hello, World!</h1>
                        <p>This is a text block example.</p>
                    </body>
                  </html>
                        """;
        String textBlock3 = """
                <html>
                    <head>
                        <title>Text Block Example</title>
                    </head>
                    <body>
                        <h1>Hello, World!</h1>
                        <p>This is a text block example.</p>
                    </body>
                </html>""";

        System.out.println(textBlock);
        System.out.println(textBlock1);
        System.out.println(textBlock2);
        System.out.println(textBlock3);
    }
}
