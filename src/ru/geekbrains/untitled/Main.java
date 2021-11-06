package ru.geekbrains.untitled;

public class Main {
    public static void main(String[] args) {
        printThreeWors();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWors() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 2, b = 2;
        if (a+b >= 0) {
            System.out.println("Значение положительное");
        }
        else System.out.println("Значение отрицательное");
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
           System.out.println("Красный");
        }
        else if (value <= 100 ) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 3;
        int b = 5;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }

}