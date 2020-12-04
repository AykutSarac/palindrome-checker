package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Test edilecek değeri girin:");
        String input = sc.nextLine();

        // Input ikiye bölünmemeli
        if (input.length() % 2 != 1) {
            System.out.println("Palindrom değil!");
            return;
        }

        // Orta harf/rakam bulunur
        int midChar = (input.length() / 2);

        String leftSide = input.substring(0, midChar);
        String rightSide = (input.substring(midChar+1));
        String rightMatch = "";

        // Değerin sağdaki kısmı ters çevrilir
        for (int i = rightSide.length(); i>0; i--) {
            rightMatch = rightMatch + rightSide.charAt(i-1);
        }

        // Karşılaştırma yapılır
        if (leftSide.matches(rightMatch)) {
            System.out.println("Palindrom.");
        } else {
            System.out.println("Palindrom değil!");
        }

    }
}
