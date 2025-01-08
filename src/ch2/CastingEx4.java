package ch2;

public class CastingEx4 {
    public static void main(String[] args) {
        int   i  = 91234567;  // 8자리의 10진수
		float f  = (float)i;  // int를 float로 형변환
		int   i2 = (int)f;	  // float를 다시 int로 형변환

		double d = (double)i; // int를 double로 형변환
		int   i3 = (int)d;    // double을 다시 int로 형변환

		float f2 = 1.666f;
		int   i4 = (int)f2;

		System.out.printf("i=%d\n", i);
		System.out.printf("f=%f i2=%d\n", f, i2);
		System.out.printf("d=%f i3=%d\n", d, i3);
		System.out.printf("(int)%f=%d\n", f2, i4);
    }
}

/*
정수형 > 실수형
변환엔 무리가없으나 실수형의 정밀도 제한때문에 오차가 발생가능

실수형 > 정수형
실수형의 소수점이하 값이 버려짐

자동 형변환
서로 다른 타입간에 대입,연산을 할 때, 형변환으로 타입을 일치시켜야 하지만
float f = 1234 처럼 값의 범위가 작은 타입에서 큰 타입으로의 형변환은 생략 가능하다.
큰타입에서 작은타입으로 형변환을 할때 형변환을 생략하면 값 손실때문에 에러가 발생하지만
형변환 타입을 직접 명시해주면 의도적인거로 간주하고 값 손실시키고 에러가 발생하지않음

자동 형변환 규칙
기존의 값을 최대한 보존할 수 있는 타입으로 자동 형변환한다.

표현범위가 좁은 타입에서 넓은 타입으로 형변환하는 경우엔 값 손실이 없으므로 두 타입중에서 표현범위가 더 넓은 쪽으로 형변환된다.
byte > short, char > int > long > float > double
 */