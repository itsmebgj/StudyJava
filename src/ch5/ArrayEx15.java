package ch5;

public class ArrayEx15 {
    public static void main(String[] args) {
        String source = "SOSHELP";
		String[] morse = {".-", "-...", "-.-.","-..", "."
						,"..-.", "--.", "....","..",".---"
						, "-.-", ".-..", "--", "-.", "---"
						, ".--.", "--.-",".-.","...","-"
						, "..-", "...-", ".--", "-..-","-.--"
						, "--.." };

		String result="";

		for (int i=0; i < source.length() ; i++ ) {
			result+=morse[source.charAt(i)-'A']; //유니코드 사용
		}
		System.out.println("source:"+ source);
		System.out.println("morse:"+result);
    }
}

/*
문자열을 모스부호로 변환하는 예제
EX13의 16진수를 2진수로 변환하는 예제와 같지만, char배열대신 String사용
 */