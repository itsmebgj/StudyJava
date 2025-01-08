package ch2;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x:" + x + " y:" + y);

        tmp = x;
        x = y;
        y = tmp;
        // x와 y 값 교환위해 tmp 생성 후 교환
        System.out.println("x:" + x + " y:" + y);
        
        /*
        System.out.println("x:" + 10 + " y:" + 20);
        System.out.println("x:10" + " y:" + 20);
        System.out.println("x:10 y:" + 20);
        System.out.println("x:10 y:20");
        */ 
    }
}


/*
변수의 타입
기본형: 논리형[boolean(1B)], 문자형[char(2B)], 정수형[byte(1B),short(2B),int(4b),long(8B)], 실수형[float(4B),double(8B)]
참조형: 나머지

참조형 변수 선언
클래스이름 변수이름;
Date today = new Date(); // Date객체 생성해서 today에 저장

상수는 변수처럼 값을 저장할 수 있는 공간 but, 한번 저장후 변경 불가 (변경 불가한 마지막 값이라는 의미로 선언시 변수의 타입앞에 final)
상수는 모두 대문자로 명명, 선언과 동시에 초기화 해야함
final int MAX_SPEED = 10;

프로그래밍에서의 숫자(1,2,3~)는 상수가 아니라 리터럴
*/