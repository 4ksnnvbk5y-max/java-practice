package com.ohgiraffers.section01.level01.example;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ExampleTest exam = new ExampleTest();
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int first = sc.nextInt();

        exam.evenOdd(first);

        System.out.print("첫번째 숫자: ");
        int firstNumber = sc.nextInt();
        System.out.print("두번째 숫자: ");
        int secondNumber = sc.nextInt();
        exam.findMAx(firstNumber,secondNumber);

    }
}
