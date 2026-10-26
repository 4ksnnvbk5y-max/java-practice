package com.ohgiraffers.section01.level01.example;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        ExampleTest exam = new ExampleTest();
        int num1 = 8;
        int num2 = 9;
        exam.evenOdd(num1);

        exam.findMax(num1,num2);

        Scanner sc = new Scanner(System.in);
        System.out.print("num1 + num2 = ? : ");
        int num3 = sc.nextInt();
        int randomNum1 = (int)(Math.random()*10)+1;
        int randomNum2 = (int)(Math.random()*10)+1;
        int num4 = randomNum1+randomNum2;
        exam.randomMathQuiz(num3,num4);


    }
   }
