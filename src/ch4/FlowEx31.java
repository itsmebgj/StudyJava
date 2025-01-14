package ch4;

public class FlowEx31 {
    public static void main(String[] args) {
        for(int i=0; i <= 10; i++) {
            if(i%3==0)
                continue;//조건식이 참이 되어 continue문이 수행되면 블럭의 끝으로 이동, break문과 달리 반복문을 벗어나지 않음
            System.out.println(i);
        }//1부터 10까지 출력하고 3의 배수는 출력하지 않음
    }
}

/*
continue문: 반복문 내에서만 사용 가능, 반복 중 continue문을 만났을때 반복문의 끝으로 이동하여 다음 반복을 수행
 */