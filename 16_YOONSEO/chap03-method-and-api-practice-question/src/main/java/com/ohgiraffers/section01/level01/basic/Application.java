package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.checkMethod();

        String result = calculator.sumTwoNumber(10,20);
        System.out.println(result);

        String result2 = calculator.multiTwoNumber(10,20);
        System.out.println(result2);

        int first = 10;
        int second = 20;
        int result3 = calculator.multiTwoNumber2(first, second);
        System.out.println(first+ "과" + second + "의 곱은 " + result3 + "입니다.");
    }
}
