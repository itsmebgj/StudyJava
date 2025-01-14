package ch4;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        int menu = 0;
	//	int num  = 0;

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");
            /*
			String tmp = sc.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp);    // 입력받은 문자열(tmp)을 숫자로 변환
             */
            menu = sc.nextInt(); // 화면을 통해 입력받은 내용을 menu에 저장
            

			if(menu==0) { // menu가 0인 경우
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) { // menu가 1보다 크거나 같고 3보다 작거나 같지 않은 경우
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;		
			}
			
			System.out.println("선택하신 메뉴는 "+ menu +"번입니다.");
		}
        sc.close();
    }
}

/*
메뉴를 보여주고 선택하는 예제
메뉴를 잘못 선택한 경우에는 다시 선택하도록 하고, 종료를 선택하면 프로그램을 종료한다.
 */