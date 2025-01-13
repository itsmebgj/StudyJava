package ch3;

public class OperatorEX28 {
    public static void main(String[] args) {
        int x = 0xAB;
		int y = 0xF;

		System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));
		System.out.printf("y = %#X \t\t%s%n", x, toBinaryString(y));
		System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x | y));
		System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x & y, toBinaryString(x & y));
		System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x ^ y, toBinaryString(x ^ y));
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, y, x ^ y ^ y, toBinaryString(x ^ y ^ y));
	} // main의 끝

	// 10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int x) { //static > 객체생성 안하고도 클래스 이름으로 호출가능
		String zero = "00000000000000000000000000000000"; //정수 x를 2진수로 변환했을때 32자리보다 짧은 경우를 처리하기위에 앞에 0을 채우는역할
		String tmp = zero + Integer.toBinaryString(x); //매개변수로 받은 정수를 2진수 문자열로 변환

		return tmp.substring(tmp.length()-32); //substring(int beginIndex) > beginIndex부터 끝까지의 부분 문자열 반환    
    }
}

/*
비트연산자
|(OR연산자): 피연산자 중 한 쪽의 값이 1이면, 1을 결과로 얻는다. 그 외는 0
&(AND연산자): 피연산자 양 쪽의 값이 1이면, 1을 결과로 얻는다. 그 외는 0
^(XOR연산자): 피연산자의 값이 서로 다를 때만 1을 결과로 얻는다. 같을 때는 0
*/