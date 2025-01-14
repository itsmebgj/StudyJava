package ch4;

import java.util.Scanner;

public class FlowEX6 {
    public static void main(String[] args) {
    //  int month = 0;

		System.out.print("현재 월을 입력하세요.>");

		Scanner sc = new Scanner(System.in);
        int month = sc.nextInt(); // 화면을 통해 입력받은 내용을 month에 저장
        /*
		String tmp = sc.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		month = Integer.parseInt(tmp);   // 입력받은 문자열(tmp)을 숫자로 변환
         */
        sc.close();
		switch(month) {
            //case문은 한줄에 하나씩 쓰던, 붙여서쓰던 상관없음
			case 3: 
			case 4: 
			case 5:
				System.out.println("현재의 계절은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("현재의 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재의 계절은 가을입니다.");
				break;
			default:
	//		case 12: case 1: case 2:
				System.out.println("현재의 계절은 겨울입니다.");
		}
    }
}

/*
switch문: 단 하나의 조건식으로 많은 경우의 수를 처리 가능, 간결
과정: 조건식 계산, 조건식의 결과와 일치하는 case문으로 이동, case문의 실행, break문을 만나거나 switch문의 끝을 만나면 switch문을 빠져나감

switch(조건식){
    case 값1:
        조건식과 값1이 같을 때 수행될 문장
        break;
    case 값2:
        조건식과 값2이 같을 때 수행될 문장
        break;
    case 값3:
        조건식과 값3이 같을 때 수행될 문장
        break;
    default:
        조건식과 일치하는 case문이 없을 때 수행될 문장
        break;

주의: break문이 없을경우 조건식과 일치하는 case문부터 아래의 모든 case문을 수행하게 됨

제약조건
1. 조건식의 결과는 정수 또는 문자열이어야 함
2. case문의 값은 정수 상수만 가능, 중복 불가
 */