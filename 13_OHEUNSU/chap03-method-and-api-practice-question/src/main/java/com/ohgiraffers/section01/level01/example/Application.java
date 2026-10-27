package com.ohgiraffers.section01.level01.example;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 적어주세요.");
        int value = sc.nextInt();

        ExampleTest.evenOdd(value);

        System.out.print("첫 번째 숫자 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int second = sc.nextInt();
        ExampleTest.findMax(first, second);

        Random random = new Random();
        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;
        ExampleTest.randomMathQuiz(num1, num2);

    }
}
