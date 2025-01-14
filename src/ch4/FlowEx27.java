package ch4;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
    //    int num;
		int sum = 0;
		boolean flag = true;   // while문의 조건식으로 사용될 변수

		System.out.println("합계를 구할 숫자를 입력하세요.(끌내려면 0을 입력)");

		while(flag) {    // flag의 값이 true이므로 조건식은 참이 된다.
			System.out.print(">>");

			Scanner sc = new Scanner(System.in);
            int num = sc.nextInt(); // 화면을 통해 입력받은 내용을 num에 저장
            /*
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);  
            */
            sc.close();

			if(num!=0) {  
				sum += num; // num이 0이 아니면, sum에 더한다.
			} else {
				flag = false;   // num이 0이면, flag의 값을 false로 변경. (while문을 벗어남, 무한 반복문에 반드시 필요)
			}
		} // while문의 끝

		System.out.println("합계:"+ sum);
    }
}
