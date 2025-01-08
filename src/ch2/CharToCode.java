package ch2;

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int)ch; //미리 캐스팅해서 저장

        System.out.printf("%c=%d(%#X)%n", ch, code, code);

        char hch = '가';
        System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
    }
}

/*
기본형에 대해서
논리형: boolean > true, false(default값)
boolean power = true;

문자형: char > 'A' 같이 단하나의 문자
char ch = 'A';

형 변환(casting): 어떤 문자의 유니코드 확인하는법
int code = (int)ch;
 */