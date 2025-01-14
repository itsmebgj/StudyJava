package ch4;

import java.util.Scanner;

public class FlowEX2 {
    public static void main(String[] args) {
        
		System.out.print("숫자를 하나 입력하세요.>");

		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
        sc.close();
		int input = Integer.parseInt(tmp);   // 입력받은 문자열(tmp)을 숫자로 변환

		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");	
		}/*
        else{
            System.out.println("입력하신 숫자는 0이 아닙니다.");		
			System.out.println("입력하신 숫자는 "+ input +"입니다.");
        } 
        */

		if(input!=0)
			System.out.println("입력하신 숫자는 0이 아닙니다.");		
			System.out.println("입력하신 숫자는 "+ input +"입니다.");
    }
}
/*
Integer.parseInt(String s): 문자열을 정수로 변환
 */