package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Здраствуйте, рады вас видеть! ");
        System.out.println("Пожайлуста, введите свое имя:  ");
        String name = in.nextLine();

        String myName = " Asel";
        int NUM = 8;
        System.out.println(NUM + myName);
        String word = "Hello GeekTech  ";
        String a = "miru mir";
        System.out.println(word);
        System.out.println(word + a);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");

        }

    }
}