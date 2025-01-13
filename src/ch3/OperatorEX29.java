package ch3;

public class OperatorEX29 {
    public static void main(String[] args) {
        byte p =  10;
		byte n = -10;

		System.out.printf(" p  =%d \t%s%n",  p,   toBinaryString(p));
		System.out.printf("~p  =%d \t%s%n", ~p,   toBinaryString(~p));
		System.out.printf("~p+1=%d \t%s%n", ~p+1, toBinaryString(~p+1));
		System.out.printf("~~p =%d \t%s%n", ~~p,  toBinaryString(~~p));
		System.out.println();
		System.out.printf(" n  =%d%n",  n);	
		System.out.printf("~(n-1)=%d%n", ~(n-1));
	} // main의 끝

	// 10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);

		return tmp.substring(tmp.length()-32);
    }
}

/*
비트 전환 연산자 (~): 피연산자를 2진수로 표현했을 때, 0은 1로, 1은 0으로 바꿈(!와 유사)
~에 의해 비트 전환 되고나면 부호있는 타입의 피 연산자는 부호가 반대로 바뀌며 1의 보수를 얻을수있다
따라서 1의보수 연산자라고도 함

어떤 양의 정수 p에 대한 음의 정수를 얻으려면 ~p+1을 하면되고 (p=10 > ~p=-11, ~p+1=-10)
어떤 음의 정수 n에 대한 양의 정수를 얻으려면 ~(n-1)을 하면 된다. (n=-10 > ~(-11), ~(n-1)= 10)
 */