package com.company;

import java.util.Scanner;

public class Bot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line
    

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What is compiler?");
        System.out.println("1. A compiler is a program that creates code");
        System.out.println("2. A compiler is a program that translates text written in a programming language into a set of machine codes.");
        System.out.println("3. A compiler is a programming language");
        System.out.println("4. A compiler is a system that helps a computer program");
        int answer = 0;
        while (answer != 2){
            answer = scanner.nextInt();
            if(answer != 2){
                System.out.println("Sorry. It's fail. Try again.");
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
