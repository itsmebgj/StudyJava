package ch3;

public class OperatorEX8 {
    public static void main(String[] args) {
        int a = 1000000;    // 1,000,000   1¹é¸¸ 
		int b = 2000000;    // 2,000,000   2¹é¸¸ 

		long c = a * b;     // a * b = 2,000,000,000,000 ?
        //int * int = int 이기때문에 a또는 b타입을 long으로 형변환 해야함

		System.out.println(c);
    }
}