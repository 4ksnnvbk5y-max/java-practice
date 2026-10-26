package com.ohgiraffers.section01.level01.example;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ExampleTest exam = new ExampleTest();
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();
        exam.evenOdd(num);

        System.out.print("첫번째 숫자 : ");
        int a = sc.nextInt();
        System.out.print("두번째 숫자 : ");
        int b = sc.nextInt();
        exam.findMax(a,b);

        int random1 = (int)(Math.random()*10)+1;
        int random2 = (int)(Math.random()*10)+1;
        System.out.println(random1+" + "+random2+" = ?");
        exam.randomMathQuiz(random1, random2);

    }
}
