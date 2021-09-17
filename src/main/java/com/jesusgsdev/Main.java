package com.jesusgsdev;

public class Main {

    public static void main(String[] args) {
        textBlockExample();
    }

    private static void textBlockExample(){
        final String textBlock =
                """
                     ##    ###    ##     ##    ###          ##   ########
                     ##   ## ##   ##     ##   ## ##       ####   ##    ##
                     ##  ##   ##  ##     ##  ##   ##        ##       ##
                     ## ##     ## ##     ## ##     ##       ##      ##
               ##    ## #########  ##   ##  #########       ##     ##
               ##    ## ##     ##   ## ##   ##     ##       ##     ##
                ######  ##     ##    ###    ##     ##     ######   ##
                """;

        System.out.println(textBlock);
    }

}