package ch2;

public class OversFlowEX {
    public static void main(String[] args) {
        short sMin = -32768;
		short sMax = 32767;
		char  cMin = 0;
		char  cMax = 65535;

		System.out.println("sMin  = " + sMin);
		System.out.println("sMin-1= " + (short)(sMin-1));
		System.out.println("sMax  = " + sMax);
		System.out.println("sMax+1= " + (short)(sMax+1));
		System.out.println("cMin  = " + (int)cMin);
		System.out.println("cMin-1= " + (int)--cMin);
		System.out.println("cMax  = " + (int)cMax);
		System.out.println("cMax+1= " + (int)++cMax);
    }
}

/*
정수형
Overflow(오버플로우): 해당 타입이 표현할 수 있는 값의 범위를 넘어서는 것
오버플로우 자체는 에러가 아니지만 예상 결과를 얻지 못한다.

실수형
실수형에도 오버플로우가 있으나 발생시 변수의 값은 무한대가 되고, 
언더플로우가 존재하는데 언더 플로우 발생시 변수의 값은 0이 된다.
 */