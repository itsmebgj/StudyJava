package ch4;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
    //   int num = 0;

		System.out.print("*을 출력할 라인의 수를 입력하세요.>");

		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  // 화면을 통해 입력받은 내용을 num에 저장
        /*
		String tmp = sc.nextLine();  // 화면을 통해 입력받은 내용을 tmp에 저장
		num = Integer.parseInt(tmp);      // 입력받은 문자열(tmp)을 숫자로 변환
        */
        sc.close();

		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		} //입력받은 num만큼 *을 반복
    }
}

/*
삼각형모양 별 출력
입력받은 숫자만큼 *을 출력하는데, 줄마다 1개씩 늘어남
*
**
***
****
*****
******
*******
 */