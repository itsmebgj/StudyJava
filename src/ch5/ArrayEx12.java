package ch5;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};

		for(int i=0; i < names.length;i++) {
			System.out.println("names["+i+"]:"+names[i]);
		}

		String tmp = names[2]; // 배열 names의 세 번째요소를 tmp에 저장
		System.out.println("tmp:"+tmp);

		names[0] = "Yu"; // 배열 names의 첫 번째 요소를 "Yu"로 변경

		for(String str : names)   // 향상된 for문
			System.out.println(str);
    }
}

/*
String 배열의 선언과 생성
String[] name = new String[3]; //3개의 문자열을 담을 수 있는 배열을 생성한다.
3개의 String 타입의 참조변수가 생성되고, 각각 null로 초기화된다.(String은 참조변수이므로 null로 초기화, null은 어떠한 객체도 가리키고 있지 않다는 뜻)

String 배열의 초기화
String[] names = new String[]{"Kim", "Park", "Yi"}; //3개의 문자열을 담을 수 있는 배열을 생성하고, 각 요소에 "Kim", "Park", "Yi"를 저장한다.
String[] names = {"Kim", "Park", "Yi"}; //new String[]를 생략할 수 있다.

기본형 배열이 아닌 경우, 즉, 참조형 배열(객체 배열)의 경우 배열에 저장되는 것은 객체의 주소이다.
 */