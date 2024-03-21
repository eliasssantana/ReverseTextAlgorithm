package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.reverse("2312cba"));

        // Divisão com casas decimais
        // O "(double)" faz o casting do resultado para o tipo flutuante, ou seja, converte o resultado para decimal.
        System.out.println((double) "2312cba".length()/2);


        // Divisão sem casas decimais
        System.out.println("2312cba".length()/2);
    }
}