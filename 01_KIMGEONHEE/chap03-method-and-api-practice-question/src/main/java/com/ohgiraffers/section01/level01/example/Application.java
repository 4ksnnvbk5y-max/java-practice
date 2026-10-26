package com.ohgiraffers.section01.level01.example;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExampleTest exam = new ExampleTest();
        int num1 = sc.nextInt();
        exam.evenOdd(num1);


        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        exam.findMax(num2,num3);


        System.out.print("num1 + num2 = ? : ");
        int num4 = sc.nextInt();
        int randomNum1 = (int)(Math.random()*10)+1;
        int randomNum2 = (int)(Math.random()*10)+1;
        int sum = randomNum1+randomNum2;
        exam.randomMathQuiz(num4,sum);


    }
   }
