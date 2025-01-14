package ch4;

public class FlowEx16 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=10; j++) {
                System.out.print("*");
            } //* 10번 출력
            System.out.println(); //줄바꿈
        }// 5번 반복
    }
}

/*
바깥쪽 for문 5번, 안쪽 10번 해서 총 50번 반복
*을 10번 출력하고 줄바꿈 5번 반복

**********
**********
**********
**********
**********
 */