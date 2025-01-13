package ch3;

public class OperatorEX26 {
    public static void main(String[] args) {
        int a = 5;
		int b = 0;

		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0); //앞이 참이라서 뒤는 평가 하지않아서 증감X(어차피 True)
		System.out.printf("a=%d, b=%d\n", a, b);
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0); //앞이 거짓이라서 뒤는 평가 하지않아서 증감X(어차피 False)
		System.out.printf("a=%d, b=%d%n", a, b);
    }
}

/*
||(OR)은 어느한쪽만 참이어도 참
&&(AND)는 어느한쪽만 거짓이어도 거짓
좌측 피연산자 평가후 논리연산자의 결과가 나온다면 우측 피연산자는 평가하지 않는다
*/