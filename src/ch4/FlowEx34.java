package ch4;

import java.util.Scanner;

public class FlowEx34 {
    public static void main(String[] args) {
        int menu = 0;
		int num  = 0;

		Scanner sc = new Scanner(System.in);

		outer: // while문에 outer라는 이름을 붙인다.
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");

            menu = sc.nextInt(); // 화면을 통해 입력받은 내용을 menu에 저장
            /*
			String tmp = sc.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp);    // 입력받은 문자열(tmp)을 숫자로 변환
            */
			if(menu==0) {  
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1<= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;		
			}

			for(;;) { // 무한 반복문
		    System.out.print("계산할 값을 입력하세요.(계산 종료:0, 전체 종료:99)>");
                num = sc.nextInt(); // 화면을 통해 입력받은 내용을 num에 저장
            /*
				tmp = sc.nextLine();   // 화면에서 입력받은 내용을 tmp에 저장
				num = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환
             */
				if(num==0)  
					break;        // 계산 종료. for문을 벗어난다.
				if(num==99) 
					break outer;  // 전체 종료. for문과 while문을 모두 벗어난다.

				switch(menu) {
					case 1: 
						System.out.println("result="+ num*num);		
						break;
					case 2: 
						System.out.println("result="+ Math.sqrt(num)); 
						break;
					case 3: 
						System.out.println("result="+ Math.log(num));  
						break;
				} 
			} // for(;;)
		} // while의 끝
        sc.close();
    }
}

/*
제곱, 제곱근(루트), 로그를 계산하는 프로그램
Ex32를 발전시킨 것으로 메뉴를 선택하면 해당 연산을 반복적으로 수행할 수 있게 for문을 추가하였다.
while문은 메뉴를 반복해서 선택할 수 있게 해주고, for문은 선택된 메뉴의 작업을 반복해서 할 수 있게 해준다.

Math.sqrt(double a):
주어진 숫자 a의 제곱근을 반환합니다.
예를 들어, Math.sqrt(9)는 3.0을 반환합니다.
음수 값을 입력하면 NaN(Not-a-Number)을 반환합니다.

Math.log(double a):
주어진 숫자 a의 자연 로그(밑이 e인 로그)를 반환합니다.
예를 들어, Math.log(Math.E)는 1.0을 반환합니다. 여기서 Math.E는 자연 로그의 밑인 e(약 2.718)를 나타냅니다.
0 이하의 값을 입력하면 NaN을 반환합니다.
 */