package ch4;

public class FlowEx33 {
    public static void main(String[] args) {
        // for문에 Loop1이라는 이름을 붙였다.
		Loop1 : for(int i=2;i <=9;i++) {	
                    for(int j=1;j <=9;j++) {
                        if(j==5)
                            break Loop1; // end of Loop1 아래로
        //					break; //System.out.println();으로
        //					continue Loop1; // end of Loop1으로
        //					continue; // end of for i로
                        System.out.println(i+"*"+ j +"="+ i*j);
                    } // end of for i
                    System.out.println();
        } // end of Loop1
    }
}

/*
구구단 예제
제일 바깥 for문에 Loop1이라는 이름을 붙였다.
j가 5일때 break문 수행
반복문의 이름이 지정되지 않은 break문은 자신이 속한 하나의 반복문만 벗어날 수 있지만,
Loop1처럼 이름을 붙이고 break문에 반복문 이름을 지정해주면 하나 이상의 반복문을 벗어날 수 있다.
 */