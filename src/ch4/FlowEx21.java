package ch4;

public class FlowEx21 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) { 
			for(int j=1;j<=5;j++) {
				if(i==j) {
					System.out.printf("[%d,%d]", i, j);	// i와 j가 같을 때 출력
				} else {
					System.out.printf("%5c", ' '); // 나머지는 공백으로 채움	
				}
			}
			System.out.println();
		}

    }
}
/*
i와 j를 1부터 5까지 증가시키면서 i와 j의 값을 쌍으로 출력하는데 if-else문 추가
 */