package com.ohgiraffers.section01.level01.example;

import java.util.Random;

public class Application {
    public static void main(String[] args) {

        ExampleTest.evenOdd(4);
        ExampleTest.findMax(10, 15);

        Random random = new Random();
        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;
        ExampleTest.randomMathQuiz(num1, num2);

    }
}
