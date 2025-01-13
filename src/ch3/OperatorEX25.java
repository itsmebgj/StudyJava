package ch3;
import java.util.Scanner;

public class OperatorEX25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		char ch = ' ';

		System.out.printf("문자를 하나 입력하세요.>");

		String input = sc.nextLine(); //스캐너로 입력받은 문자를 input에 저장
		ch = input.charAt(0); //input의 0번째 인덱스를 ch에 저장

		if('0'<= ch && ch <= '9') { //0~9
			System.out.printf("입력하신 문자는 숫자입니다.\n");
		}

		if(('a'<= ch && ch <= 'z') || ('A'<= ch && ch <= 'Z')) { //a~z, A~Z
			System.out.printf("입력하신 문자는 영문자입니다.\n");
		}
        sc.close();
    }
}

//charAt(0): 0번째 인덱스에 위치한 문자 반환