package ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score  = 0;   // 점수를 저장하기 위한 변수
		char grade =' ';  // 학점을 저장하기 위한 변수. 공백으로 초기화한다.

		System.out.print("점수를 입력하세요.>");
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
        sc.close();
		score = Integer.parseInt(tmp);   // 입력받은 문자열(tmp)을 숫자로 변환

		if (score >= 90) {         // score가 90점 보다 같거나 크면 A학점
			 grade = 'A';             
		} else if (score >=80) {   // score가 80점 보다 같거나 크면 B학점 
			 grade = 'B'; 
		} else if (score >=70) {   // score가 70점 보다 같거나 크면 C학점 
			 grade = 'C'; 
		} else {                   // 나머지는 D학점
			 grade = 'D'; 
		}
            
		System.out.println("당신의 학점은 "+ grade +"입니다."); 
    }
}

/* 
String tmp = sc.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
score = Integer.parseInt(tmp);   // 입력받은 문자열(tmp)을 숫자로 변환
// nextLine으로 string으로 받아서 int로 변환할 필요없이 바로 nextInt로 받아도 됨
int tmp = sc.nextInt(); 

if-else if문

if(조건식 1){
조건식 1이 참일때 수행될 문장
} else if(조건식2){
조건식 2가 참일때 수행될 문장
} else if(조건식3){
조건식 3이 참일때 수행될 문장
} else{
위의 어느 조건식도 만족하지 않을때 수행될 문장
}

결과가 참인 조건식을 만나면 나머지는 평가 하지않는다
*/