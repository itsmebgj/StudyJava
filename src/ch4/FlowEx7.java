package ch4;

import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args) {
            int user, com;

            System.out.print("가위(1),바위(2), 보(3) 중 하나를 입력하세요.>");

            Scanner sc = new Scanner(System.in);
            user = sc.nextInt(); // 화면을 통해 입력받은 내용을 user에 저장
            /*
            String tmp = sc.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
            user = Integer.parseInt(tmp);    // 입력받은 문자열(tmp)를 숫자로 변환
            */
            sc.close();
            com = (int)(Math.random() * 3) + 1;  // 1,2,3중 하나가 com에 저장됨, Math.random()이 double값이기 때문에 int로 캐스팅

            System.out.println("당신은 "+ user +"입니다.");
            System.out.println("컴은  "+ com +"입니다.");

            switch(user-com) {
                case 2: case -1:
                    System.out.println("당신이 졌습니다.");
                    break;
                case 1: case -2:
                    System.out.println("당신이 이겼습니다.");
                    break;
                case 0:
                    System.out.println("비겼습니다.");
        //			break;		// 마지막 문장이므로 break를 사용할 필요가 없다. 
        }
    }
}

/*
Math.random(): 0.0이상 1.0미만의 실수(double값)를 반환

메커니즘
user\com|  가위(1)    바위(2)    보(3)
--------|---------------------------
가위(1)  |  0(무)    -1(컴승)   -2(유저승)
바위(2)  |  1(유저승)  0(무)    -1(컴승)
보(3)    |  2(컴승)   1(유저승)  0(무)

user-com의 값이 2 또는 -1이면 컴승
user-com의 값이 1 또는 -2이면 유저승
user-com의 값이 0이면 Draw
 */