package ch4;

public class FlowEx30 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while(true) {
            if(sum > 100)
                break;
            ++i;//break문을 만나면 이 문장을 실행하지 않고 while문을 빠져나간다.
            sum += i;//break문을 만나면 이 문장을 실행하지 않고 while문을 빠져나간다.
            // sum += ++i;
        }

        System.out.println("i=" + i);
        System.out.println("sum=" + sum);
    }
}

/*
break문: 반복문을 벗어나는 역할 (무한루프에 필수)
숫자를 1부터 계속 더해나가다가 몇까지 더했을때 누적합계가 100을 넘는지
 */