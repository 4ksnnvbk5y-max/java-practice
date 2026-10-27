package com.ohgiraffers.section01.level01.example;

import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

    ExampleTest example = new ExampleTest();
    Scanner sc = new Scanner(System.in);

    System.out.print("정수를 입력하세요: ");
    int value = sc.nextInt();
    example.evenOdd(value);


    System.out.print("첫 번째 수를 입력하세요: ");
    int first = sc.nextInt();
    System.out.print("두 번째 수를 입력하세요: ");
    int second = sc.nextInt();
    example.findMax(first, second);


    int randomNum1 = (int)(Math.random() * 10) + 1;
    int randomNum2 = (int)(Math.random() * 10) + 1;
    example.randomMathQuiz(randomNum1, randomNum2);
    }
}
