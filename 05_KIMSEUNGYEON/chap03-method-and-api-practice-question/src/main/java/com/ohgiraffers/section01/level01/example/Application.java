package com.ohgiraffers.section01.level01.example;

import java.util.Scanner;

public class Application {

    static ExampleTest example = new ExampleTest();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. 정수 입력 후 짝수인지 홀수인지 판별");
        System.out.print("정수를 입력하세요: ");
        int value = sc.nextInt();
        example.evenOdd(value);

        System.out.println("2. 두 정수를 입력 후 큰 수를 판별");
        System.out.print("첫 번째 정수를 입력하세요: ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int second = sc.nextInt();
        example.findMax(first, second);

        System.out.println("3. 랜덤 수학 퀴즈");
        int randomNum1 = (int)(Math.random() * 10) + 1;
        int randomNum2 = (int)(Math.random() * 10) + 1;
        example.randomMathQuiz(randomNum1, randomNum2);
    }
}
