package ch3;

public class OperatorEX30 {
    public static void main(String[] args) {
        int dec = 8;

		System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));

		System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
		System.out.println();

		dec = -8;
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));

		System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
		System.out.println();

		dec = 8;
		System.out.printf("%d >> %2d = %4d \t%s%n", dec, 0,  dec >> 0,  toBinaryString(dec << 2));
		System.out.printf("%d >> %2d = %4d \t%s%n", dec, 32, dec >> 32, toBinaryString(dec << 2));
	} // main의 끝

	// 10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);

		return tmp.substring(tmp.length()-32);
    }
}

/*
쉬프트연산자(<<,>>): 피연산자의 각 자리(2진수로 표현했을 때)를 오른쪾(>>), 왼쪽(<<)으로 이동한다
8<<2는 왼쪽 피연산자인 8의 2진수를 왼쪽으로 2자리 이동한다.
00001000 -> 00100000 (자리이동으로 저장범위를 벗어난 값은 버려지고 빈자리는 0으로 채워짐)
따라서 8<<2의 결과로 32가 됨

공식
x<<n은 x*2ⁿ
x>>n은 x/2ⁿ
*/