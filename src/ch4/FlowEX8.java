package ch4;

import java.util.Scanner;

public class FlowEX8 {
    public static void main(String[] args) {
    //    char gender;
	//	String regNo = "";

		System.out.print("당신의 주민번호를 입력하세요.(012345-1111222)>");

		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		char gender = regNo.charAt(7); // 입력받은 번호의 8번째(index는 0부터) 문자를 gender에 저장
        sc.close();

		switch(gender) {
			case '1':
			case '3':
				System.out.println("당신은 남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("당신은 여자입니다.");
				break;
			default:
				System.out.println("유효하지 않은 주민등록번호입니다.");;
        }
    }
}

/*
주민번호 뒷자리 첫번째 숫자에 따라 남자와 여자를 구분
 */