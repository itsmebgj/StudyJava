package ch4;

public class FlowEx24 {
    public static void main(String[] args) {
        int i =11;
        System.out.println("카운트 다운을 시작합니다.");
        while(i--!=0) {
            System.out.println(i);
            for(int j=0; j<2_000_000_000; j++) {
                ; // 아무런 내용도 없는 빈 문장, 매 출력마다 약간의 시간 지연(시간끌기)
            }
        }
        System.out.println("GAME OVER");
    }
}
