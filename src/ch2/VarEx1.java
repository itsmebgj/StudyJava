package ch2;

public class VarEx1 {
    public static void main(String[] args) {
            int year = 0, age = 14;
            
            System.out.println(year);
            System.out.println(age);

            year = age + 2000;
            age = age + 1;

            System.out.println(year);
            System.out.println(age);            
        }
    }


/*
 
변수: 단 하나의 값을 저장할 수 있는 메모리 공간
int age; //age라는 변수 선언

변수는 선언하고 '='사용해서 초기화 필요(쓰레기값 정리)
변수의 초기화: 변수를 사용하기 전에 처음으로 값을 저장
int age = 25; // age 변수 선언하고 25로 초기화

대입연산 (=)은 모든 계산 후 마지막에 실행
 */