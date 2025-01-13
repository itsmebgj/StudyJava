package ch3;

public class OperatorEX20 {
    public static void main(String[] args) {
            System.out.println(-10%8); //-2
            System.out.println(10%-8);  //2
            System.out.println(-10%-8); //-2
    }
}

/*
음수도 허용 but 부호는 무시
tip) 부호 전부 무시하고 계산 후, 나머지 연산 결과에 왼쪽 피연산자의 부호를 붙이면 됨
 */