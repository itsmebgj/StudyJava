package ch3;

public class OperatorEX23 {
    public static void main(String[] args) {
        String str1 = "abc"; //String은 간단히 허용
		String str2 = new String("abc"); //스트링은 클래스이므로
        
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n",    str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n",    str2=="abc"); //내용이 같지만 서로 다른 객체라서 false
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));        
    }
}

/*
문자열의 비교는 == 대신 equals() 메서드 사용
비교연산자 == 를 사용하게되면 두 문자열이 완전히 같은 것인지 비교
결과값은 boolean

대소문자를 구별하지않고 비교하고싶다면 equlsIgnoreCase()
 */