package com.ohgiraffers.section05.logical;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 논리연산자의 우선순위에 대해 이해하고 이를 활용할 수 있다. */

        /* 필기.
        * 논리 연산자의 우선순위와 활용
        * 논리 & 연산자와 논리 | 연산자의 우선순위
        * && : 11순위
        * || : 12순위
        * 논리 && 연산자의 우선순위가 논리 || 연산자 우선순위 보다 높다.
         */

        /* 목차. 1. 1부터 100 사이의 값인지 확인 */

        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 : " + (num1 >= 1 && num1 <= 100));

        int num2 = 166;

        System.out.println("1부터 100 사인인지 확인 : " + (num2 >=1 && num2 <= 100));

        /* 목차. 3. 대소문자 상관 없이 영문자 y 인 지 확인 */
        char ch3 = 'Y';
        System.out.println("영문자 y 인지 확인 : " + (ch3 == 'y' || ch3 == 'Y'));

        /* 목차. 4. 영문자인지 확인 */
        char ch5 = 'f';
        System.out.println("영문자인지 확인 : " + ((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z')));

       char Ch6 = 'F';


           /* 수업목표. 논리연결연산자의 진리표에 대해 이해할 수 있다. */
          /* 필기.
          * AND 연산과 QR 연산의 특징
          * 논리식 && 논리식 : 앞의 결과가 false 이면 뒤를 실행 안 함.
          * 논리식 || 논리식 : 앞ㅍ의 결과가 true 이면 뒤를 실행 안 함.

           */
           /* 목차. 1. 논리식 && 논리식 : 앞의 결과가 false 이면 뒤를 실행 안 함. */
        /* 필기.
        * 필기.
        *  조건식 두 개가 모두 만족해야 true를 반환하지만, 앞에서 미리 false가 나오면
        * 뒤의 조건을 확인할 필요가 없이 false를 반환한다.
        * 따라서 연산 횟수를 줄이기 위해서는 && 연산의 경우 앞에 false가 나올 가능성이 높
        * 편을 작성하는 것이 좋다.
        *

         */




        int Num1 = 10;
        int result1 = (false && ++num1 > 0)? num1 : num1;

        System.out.println("&& 실행 확인 : " + result1);

        int Num2 = 10;
        int result2 = (false || ++num2 > 0)? num2 : num2;



    }
}
