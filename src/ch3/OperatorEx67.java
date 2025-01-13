package ch3;

public class OperatorEx67 {
    public static void main(String[] args) {
        byte a = 10; 
        byte b = 20; 
        //byte c = a + b;  컴파일에러 발생 > int보다 작은값이기때문에 명시적 형변환 필요
        byte c = (byte)(a + b);
        System.out.println(c); 
    }
}
