package com.ohgiraffers.section01.level01.example;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        ExampleTest exampleTest = new ExampleTest();

        int value = 4;
        exampleTest.evenOdd(value);

        int first = 3;
        int second = 4;
        exampleTest.findMax(first, second);

        Random random = new Random();
        int num1 = random.nextInt(9) + 1;
        int num2 = random.nextInt(9) + 1;
        exampleTest.randomMathQuiz(num1, num2);

    }

}
