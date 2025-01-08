package ch2;

public class CastingEx1 {
    public static void main(String[] args) {
        double d  = 85.4;
		int score = (int)d;

		System.out.println("score="+score);
		System.out.println("d="+d);
    }
}

/*
형변환(casting): 변수, 상수의 타입을 다른 타입으로 변환하는 것
기본형에서 boolean을 제외한 나머지 타입들끼리 가능(기본형과 참조형간은 불가능)

(타입)피연산자
double d = 85.4;
int score = (int)d; // double타입의 변수 d를 int타입으로 캐스팅
 */