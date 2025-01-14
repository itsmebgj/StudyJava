package ch4;

public class FlowEx19 {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++) {
            for(int j=1; j<=3; j++) {
                for(int k=1; k<=3; k++) {
                    System.out.println(""+i+j+k);
                }
            }
        }
    }
}

/*
각 반복문이 3번씩 반복되므로 총 27번 반복
i, j, k가 각각 1, 2, 3일 때 식 ""+i+j+k는 "123"이 된다.
""+i+j+k -> ""+1+2+3 -> "1"+2+3 -> "12"+3 -> "123"
 */