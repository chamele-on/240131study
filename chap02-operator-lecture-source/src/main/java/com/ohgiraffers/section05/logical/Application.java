package com.ohgiraffers.section05.logical;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 논리연산자에 대해 이해하고 활용할 수 있다. */

        /* 필기.
        * 필기.
        *  논리 연산자
        *  논리값(true or false) 를 취급하는 연산자이다.
        *
        * */

        /* 필기.
        *  논리 연산자의 종류
        * 1. 논리 연결 연산자 : 두 개의 피연산자를 가지는 이항 연산자이며, 연산자의 결합 방향은 왼쪽에서 오른쪽
        * 두 개의 논리식을 판단하여 참과 거짓을 판단한다.
        *
        *   1-1. && (논리 AND) 연산자 : 두 개의 논리식 모두 참 일 경우 참을 반환, 둘 중 하나라도 거짓이면 거짓을 반
        *   1-2. || (논리 or)  연산자 : 두 개의 논리식 중 둘 중 하나라도 참 일 경우 참을 반환, 둘 다 거짓이면 거짓을 반환
        *
        * /* 목차. 1. 논리 연산자 결과값 확인 */
        System.out.println("true 와 true의 논리 and 연산 : " + (true && true));
        System.out.println("true 와 false의 논리 and 연산 : " + (true && false));
        System.out.println("false 와 true의 논리 and 연산 : " + (false && true));
        System.out.println("false 와 false의 논리 and 연산 : " + (false && false));

        System.out.println("==============================================");
        System.out.println("true 와 true의 논리 or 연산 : " + (true || true));
        System.out.println("true 와 true의 논리 or 연산 : " + (true || false));
        System.out.println("true 와 true의 논리 or 연산 : " + (false || true));
        System.out.println("true 와 true의 논리 or 연산 : " + (false || true));
        System.out.println("true 와 true의 논리 or 연산 : " + (true || true));

        System.out.println("안녕하세요");
        System.out.println("바보입니다");
        System.out.println("천재입니다");

        System.out.print("안녕하세요");
        System.out.print("녕하세요");
        System.out.print("하세요");

        System.out.println(123 / 10);
        System.out.println(123/10);
        System.out.println("hellowold" + 123);
        System.out.println('a' + 'b');
        System.out.println('b');
        System.out.println('a');
        System.out.println(true + "a");
        System.out.println(true);
        System.out.println(true);

        System.out.println("기차" + "칙칙폭폭");
        System.out.println("기차" + 123 + 45 + "출발");
        System.out.println("기차" + 123 + 45 + "출발");
        System.out.println(123 + 45 + "기차" + "출발");

        System.out.println("a" + (2 +4));
        System.out.println("안녕하세요 올해 " + (19 + 1) + " 살이 된 김 자바 입니다");


                double pi = 3.141592653;
                int radius = 10;
                int height = 20;

        System.out.println(2 * pi * radius);
        System.out.println();





    }
}
