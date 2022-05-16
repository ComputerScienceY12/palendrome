package com.williamdaw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String value = new Scanner(System.in).next();
        StringBuilder sb = new StringBuilder(value);
        if ((value.equalsIgnoreCase(String.valueOf(sb.reverse())))) System.out.println("is a palindrome");
    }
}
