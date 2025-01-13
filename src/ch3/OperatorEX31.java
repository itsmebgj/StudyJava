package ch3;

public class OperatorEX31 {
    public static void main(String[] args) {
        int dec  = 1234; 
		int hex  = 0xABCD;
		int mask = 0xF;

		System.out.printf("hex=%X%n", hex);
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
    }
}

//쉬프트 연산자, 비트AND연산자를 이용해서 16진수를 끝에서부터 한자리씩 뽑아내는 예제