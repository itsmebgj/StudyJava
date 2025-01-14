package ch4;

public class FlowEx12 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            System.out.println(i);
        }

        for(int i=1; i<=5; i++) {
            System.out.print(i); //가로로 출력
        }

        System.out.println();
    }
}

/*
for문

for(초기화; 조건식; 증감식){
    조건식이 참일때 수행될 문장
}
 */