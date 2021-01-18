package com.knoldus;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String userInputedStr = scanner.nextLine();
        StringFunctions stringFunctions = new StringFunctions();
        System.out.println("Reverse of the entered string: " + stringFunctions.reverseString(userInputedStr));
        System.out.println("Size of the entered string: " + stringFunctions.sizeOfStr(userInputedStr));
    }
}
