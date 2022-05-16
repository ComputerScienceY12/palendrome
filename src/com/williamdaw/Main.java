package com.williamdaw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        StringBuilder sb = new StringBuilder(value);
        if ((value.equalsIgnoreCase(String.valueOf(sb.reverse())))) System.out.println("is a palindrome");
    }
}
