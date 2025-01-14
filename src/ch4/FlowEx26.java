package ch4;

public class FlowEx26 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        //i를 1씩 증가시키면서 sum에 더해나간다.
        while((sum += ++i) <= 100) {
            System.out.printf("%d - %d%n", i, sum);
        }
    }
}

/*
1부터 몇까지 더했을때 누적합계가 100을 넘지 않는 제일 큰 수인지 확인하는 예제
1부터 시작해서 1씩 증가시키면서 sum에 더해나가다가 sum이 100보다 커지는 순간 while문을 빠져나간다.
 */