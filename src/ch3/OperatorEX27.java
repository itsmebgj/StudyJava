package ch3;

public class OperatorEX27 {
    public static void main(String[] args) {
        boolean  b  = true; 
		char ch = 'C';
		
		System.out.printf("b=%b\n", b);
		System.out.printf("!b=%b\n", !b);
		System.out.printf("!!b=%b\n", !!b);
		System.out.printf("!!!b=%b\n", !!!b);
		System.out.println();

		System.out.printf("ch=%c\n", ch);
		System.out.printf("ch < 'a' || ch > 'z'=%b\n", ch < 'a' || ch > 'z');
	    System.out.printf("!('a'<=ch && ch<='z')=%b\n", !('a'<= ch && ch<='z'));
	    System.out.printf("  'a'<=ch && ch<='z' =%b\n",   'a'<=ch && ch<='z');
    }
}

/*
논리 부정 연산자 (!): 피연산자가 true 이면 false를, false이면 true를 반환
'토글 버튼'
*/