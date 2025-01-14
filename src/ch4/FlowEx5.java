package ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
    //  int  score = 0;
		char grade = ' ';
		char op    = '0'; // 빈공간이든 0이든 상관없음

		System.out.print("점수를 입력해주세요.>");

		Scanner sc = new Scanner(System.in);
        int score = sc.nextInt(); // 화면을 통해 입력받은 내용을 score에 저장
        /*
		String tmp = sc.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		score = Integer.parseInt(tmp);   // 입력받은 문자열(tmp)을 숫자로 변환
		 */
        sc.close();
		System.out.printf("당신의 점수는 %d입니다.", score);

		if (score >= 90) {		      // score가 90점 보다 같거나 크면 A학점(grade)
			grade = 'A';
			if (score >= 98) { 	      // 90점 이상 중에서도 98점 이상은 A+
				op = '+';	
			} else if (score < 94) {  // 90점 이상 94점 미만은 A-
				op = '-';
			}
		} else if (score >= 80){	  // score가 80점 보다 같거나 크면 B학점(grade)
			grade = 'B';
			if (score >= 88) {
				op = '+';
			} else if (score < 84)	{
				op = '-';
			}
		} else {				      // 나머지는 C학점(grade)
			grade = 'C';
		}
			
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, op);
    }
}

/*
중첩 if문: if문의 블럭 내에 또 다른 if문 존재

if (조건식 1){
    if (조건식 2){
        조건식 1과 조건식 2가 모두 참일 때 수행될 문장
    }else{
        조건식 1은 참이지만 조건식 2가 거짓일 때 수행될 문장
    }
}else{
    조건식 1이 거짓일 때 수행될 문장
}
 */