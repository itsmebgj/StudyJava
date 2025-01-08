package ch2;

public class StringEx {
    public static void main(String[] args) {
        
    
    String name = "Ja" + "va";
    String str = name + 8.0;

    System.out.println(name); //Java
    System.out.println(str); //Java8.0
    System.out.println(7 + " "); //7 
    System.out.println(" " + 7); // 7
    System.out.println(7 + ""); //7
    System.out.println("" + 7); //7
    System.out.println("" + ""); //
    System.out.println(7 + 7 + ""); //14 
    System.out.println("" + 7 + 7); //77
    }
}




/*
문자 리터럴: 'A' (문자 반드시 하나만, 0개 불가, blank도 문자임)
char ch = 'J';

문자열 리터럴: "Java" (문자 하나만 아니면 됨)
String name = "Java";
String name = new String("Java");

덧셈 연산자는 피연산자 중 하나라도 String이면 나머지 한쪽을 먼저 String으로 변환 후 결합
7 + "7" -> "7" + "7" -> "77"
 */