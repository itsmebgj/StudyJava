package ch3;

public class OperatorEx4 {
    public static void main(String[] args) {
        int i = -10;
		i = +i;
		System.out.println(i);

		i=-10;
		i = -i;
		System.out.println(i);
    }
}

/*
부호연산자 - 는 피연산자의 부호를 반대로 변경한 결과 반환(+는 그대로)
boolean형, char형을 제외한 기본형에만 사용가능
 */