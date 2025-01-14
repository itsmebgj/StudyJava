package ch4;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
    //    int num = 0; 
		int sum = 0;

		System.out.print("숫자를 입력하세요.(예:12345)>");
        
		Scanner sc = new Scanner(System.in);
        /*
		String tmp = sc.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		num = Integer.parseInt(tmp);      // 입력받은 문자열(tmp)을 숫자로 변환
        */
        int num = sc.nextInt(); // 화면을 통해 입력받은 내용을 num에 저장
        sc.close();

		while(num!=0) {    
			// num을 10으로 나눈 나머지를 sum에 더함
			sum += num%10; 	// sum = sum + num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);

			num /= 10;  // num = num / 10;  num을 10으로 나눈 값을 다시 num에 저장
		}
		
		System.out.println("각 자리수의 합:"+ sum);
    }
}

/*
num을 10으로 나눈 나머지를 sum에 더하는 과정을 반복하면 
sum에 10을 나눈 나머지가 반복마다 계속 더해지며 각 자리수의 합을 구할 수 있음
 */