package ch3;

public class OperatorEX13 {
    public static void main(String[] args) {
        char c1 = 'a';

//			char c2 =  c1+1;           // 라인 5 : 컴파일 에러발생!!!, 수식에 변수가 들어가있으면 컴파일러가 미리 계산불가
//          char c2 =  (char)(c1+1); 
			char c2 = 'a'+1;           // 라인 6 : 컴파일 에러없음, 리터럴간의 연산이기때문에

            System.out.println(c2); 
    }
}
