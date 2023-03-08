package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\nHello world!\nHello world!\nHello world!");
        System.out.println("안녕하세요!\n안녕하세요!\n안녕하세요!");

        int age = 20;
        System.out.println("당신의 나이 : " + age);

        if (age <= 20 && age <= 34) {
            System.out.println("청년");
        } else if (age <= 18) {
            System.out.println("미성년자");
        }
    }
}