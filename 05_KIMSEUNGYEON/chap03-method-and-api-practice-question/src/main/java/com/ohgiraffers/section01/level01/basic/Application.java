package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        // 1. 메소드 호출
        calculator.checkMethod();

        int first = 10;
        int second = 20;
        // 2. 두 수의 합을 구하는 메소드 호출
        System.out.println(calculator.sumTwoNumber(first, second));

        // 3. 두 수의 곱을 구하는 메소드 호출
        System.out.println(calculator.multiTwoNumber(first, second));

        // 4. 두 수의 곱을 구하는 메소드 호출
        calculator.multiTwoNumber2(first, second);
    }
}
