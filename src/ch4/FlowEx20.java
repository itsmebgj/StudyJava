package ch4;

public class FlowEx20 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                System.out.printf("[%d, %d]", i, j);
            }
            System.out.println();
        }
    }
}

/*
[1, 1][1, 2][1, 3][1, 4][1, 5]
i가 1증가할때마다 j를 1부터 5까지 증가시키고 반복하여 i와 j의 값을 쌍으로 출력. 
 */