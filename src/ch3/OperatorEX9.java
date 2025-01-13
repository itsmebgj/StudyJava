package ch3;

public class OperatorEX9 {
    public static void main(String[] args) {
        long a = 1000000 * 1000000; //int * int = int (예상 결과값 X)
		long b = 1000000 * 1000000L; //int * long = long

		System.out.println("a="+a);
		System.out.println("b="+b);
    }
}
