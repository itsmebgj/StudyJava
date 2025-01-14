package ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input  = 0;
		int answer = 0;

		answer = (int)(Math.random() * 100) + 1; // 1~100사이의 임의의 수를 저장
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("1과 100사이의 정수를 입력하세요.>");
            input = sc.nextInt(); // 화면을 통해 입력받은 내용을 input에 저장
            /*
			String tmp = sc.nextLine();
			input = Integer.parseInt(tmp);
            */
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");	
			} else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");			
			}
		} while(input!=answer);

        sc.close();
		System.out.println("정답입니다.");
    }
}

/*
do-while문: while문의 변형으로 조건식이 참인 동안 반복실행되며, 블럭{}을 먼저 수행하고 조건식을 평가한다.
while문은 조건식의 결과에 따라 한번도 수행되지 않을 수 있지만 do-while문은 무조건 한번은 수행된다.

do{
    조건식이 참일때 수행될 문장
} while(조건식);

반복적으로 사용자의 입력을 받아 처리하는 경우 do-while문이 유용

answer = (int)(Math.random() * 100) + 1;
1. Math.random()은 0.0 이상 1.0 미만의 double 값을 반환합니다.
2. Math.random() * 100은 0.0 이상 100.0 미만의 double 값을 생성합니다.
3. (int)(Math.random() * 100)은 0부터 99까지의 정수 값을 생성합니다.
4. (int)(Math.random() * 100) + 1은 1부터 100까지의 정수 값을 생성합니다.
 */