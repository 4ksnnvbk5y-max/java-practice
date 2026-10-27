package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        calc.checkMethod();

        int first = 10;
        int second = 20;

        String res1 = calc.sumTwoNumber(first, second);
        System.out.println("res1 = " + res1);

        String res2 = calc.multiTwoNumber(first, second);
        System.out.println("res2 = " + res2);

        int res3 = calc.multiTwoNumber2(first, second);
        System.out.println("res3 = " + res3);

    }
}
