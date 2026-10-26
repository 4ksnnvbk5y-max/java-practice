package com.ohgiraffers.section01.level01.example;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ExampleTest exam = new ExampleTest();
        Scanner sc = new Scanner(System.in);

        System.out.println("============ 홀 짝 구분하기 ============");
        System.out.print("숫자를 입력해주세요 : ");
        int num =sc.nextInt();
        sc.nextLine();
        exam.evenOdd(num);

        System.out.println("============ 두 수중 더 큰수 찾기 ============");
        System.out.print("첫번째 숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("두번째 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        sc.nextLine();
        exam.findMax(num1, num2);

        System.out.println("============ 랜덤 숫자 퀴즈 ============");
        Random rand = new Random();
        int quizNum1 = rand.nextInt(10) + 1;
        int quizNum2 = rand.nextInt(10) + 1;
        exam.randomMathQuiz(quizNum1,quizNum2);
    }
}
