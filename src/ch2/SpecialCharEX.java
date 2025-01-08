package ch2;

public class SpecialCharEX {
    public static void main(String[] args) {
        System.out.println('\'');		     //  '''처럼 할 수 없다.
		System.out.println("abc\t123\b456"); // \b에 의해 3이 지워진다.
		System.out.println('\n');		     //  개행(new line)문자 출력하고 개행
		System.out.println("\"Hello\"");	 //  큰따옴표를 출력하려면 이렇게 한다.
		System.out.println("c:\\");
    }
}

/*
특수문자 표현법

\b(backspace)
\f(form feed)
\n(new line)
\r(carriage return)
\\(역슬래쉬)
\'(작은따옴표)
\"(큰따옴표)

문자(A) > 인코딩 > 유니코드(65)
유니코드(65) > 디코딩 > 문자(A) 
encode: 암호화하다
 */