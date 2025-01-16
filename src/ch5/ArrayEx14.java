package ch5;

public class ArrayEx14 {
    public static void main(String[] args) {
        String src = "ABCDE";

		for(int i=0; i < src.length(); i++) {
			char ch = src.charAt(i); // src의 i번째 문자를 ch에 저장
			System.out.println("src.charAt("+i+"):"+ ch);
		}

		char[] chArr = src.toCharArray();  // String을 char[]로 변환

		System.out.println(chArr); // char배열(char[])을 출력, ABCDE
    }
}

/*
문자열(문자를 연이어 늘어놓은 것)을 저장할 때: String 타입의 변수 사용
문자열: 문자배열인 char배열과 같은뜻 but, String클래스가 char배열에 여러 가지 기능을 추가하여 확장한 것이기 때문에 String클래스 사용
    -> String클래스는 char배열에 기능(메서드)를 추가한 것

객체지향 언어에서는 데이터와 그에 관련된 기능(함수,메서드)을 하나의 클래스에 묶어서 다룰 수 있게 함
    -> (서로 관련된 것들끼리 데이터와 기능(함수,메서드)을 구분하지 않고 함께 묶음)

char배열과 String클래스의 차이점
String객체(문자열)은 읽을수만 있을 뿐 내용을 변경할 수 없다
String str  = "Java";
str = str + "8";         // "Java8"이라는 새로운 문자열이 str에 저장된다.
System.out.println(str); // "Java8"

String클래스의 주요 메서드
char charAt(int index) : 문자열에서 index에 해당하는 문자를 반환
int length() : 문자열의 길이를 반환
String substring(int from, int to) : 문자열에서 from부터 to전까지의 문자열을 반환(to는 포함되지 않음)
boolean equals(Object obj) : 문자열의 내용이 같은지 확인
char[] toCharArray() : 문자열을 문자배열(char[])로 변환하여 반환
*/