package com.williamdaw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String value = new Scanner(System.in).next();
        if ((value.equalsIgnoreCase(String.valueOf(new StringBuilder(value).reverse()))))System.out.println("is a palindrome");
    }
}
