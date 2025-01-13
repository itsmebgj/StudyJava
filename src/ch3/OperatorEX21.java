package ch3;

public class OperatorEX21 {
    public static void main(String[] args) {
        System.out.printf("10 == 10.0f  \t %b\n", 10==10.0f);
		System.out.printf("'0'== 0      \t %b\n", '0'== 0);
		System.out.printf("'\\0'== 0    \t %b\n", '\0'== 0);
		System.out.printf("'A'== 65     \t %b\n", 'A'== 65);
		System.out.printf("'A' > 'B'    \t %b\n", 'A' > 'B');
		System.out.printf("'A'+1 != 'B' \t %b\n", 'A'+1 != 'B');
    }
}

/*
비교 연산자
1. 대소비교 연산자 (>, <, >=, <=)
2. 등가비교 연산자 (==, !=)
 */