package ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 자리 정수를 하나 입력하세요.>");

        String input = sc.nextLine(); // 입력받은 문자열을 input에 저장
        int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환

        System.out.println("입력내용 :" + input);
        System.out.printf("num=%d%n", num);

        sc.close(); //스캐너는 사용후 종료
    }
}
/*
입력받은 문자열을 숫자로 변환(String to int) > Integer.ParseInt()

nextInt(), nextFloat()는 변환없이 숫자로 바로 입력 받을수 있음
int num = sc.nextint(); //정수를 입력받아 변수 num에 저장 
but, 화면에서 연속적으로 값을 입력받아 사용하기 까다롭기에 모든값을 nextLine()으로 받아 적절히 변환하는게 나음
 */