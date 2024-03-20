package org.example;

import org.jetbrains.annotations.NotNull;
public class StringUtils{
    @NotNull
    public static String reverse(String text) throws RuntimeException{

        if (text == null){
            throw new RuntimeException("Texto não inicializado");
        }

        char[] chars = text.toCharArray();

        final int arrayLength = chars.length;

        char temp;

        for (int idx = 0; idx < arrayLength/2; idx++){
            temp = chars[idx];
            chars[idx] = chars[arrayLength - 1 - idx];
            chars[arrayLength - 1 - idx] = temp;
        }

        return String.valueOf(chars);
    }

    public static String reverseOddsText(String text) throws RuntimeException{
        if (text == null){
            throw new RuntimeException();
        }

        char[] chars = text.toCharArray();

        final int arrayLength = chars.length;

        char temp;

        for (int idx = 0; idx < arrayLength/2; idx++){
            if (idx + 1 % 2 != 0){

                temp = chars[idx];
                chars[idx] = chars[arrayLength - 1 - idx];
                chars[arrayLength - 1 - idx] = temp;
            }
        }

        return String.valueOf(chars);
    }
}