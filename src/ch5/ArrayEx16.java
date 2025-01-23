package ch5;

public class ArrayEx16 {
    public static void main(String[] args) {
        System.out.println("매개변수의 개수:"+ args.length);
        for(int i=0; i < args.length; i++) {
            System.out.println("args["+i+"] = \""+args[i]+"\"");
        }
    }
}

/*
커맨드라인으로 입력받기
프로그램을 실행할 때 클래스 이름 뒤에 공백문자로 구분하여 여러 개의 문자열을 프로그램에 전달 할 수 있다.
ex) C:\Users\bgj30\workspace\StudyJava>java ArrayEx16 abc 123
    -> 매개변수의 개수:2
       args[0] = "abc"
       args[1] = "123"

커맨드라인으로 입력받은 문자열은 main메서드의 매개변수인 args배열에 저장된다.
커맨드라인에서 숫자를 입력해도 숫자가 아닌 문자열로 처리된다
커맨드라인에 매개벼수를 입력하지 않으면 크기가 0인 배열이 생성되어 args.length는 0이 된다
입력된 매개변수가 없다고 해서 배열을 생성하지 않으면 args의 값은 null이 된다 > 에러발생
but, JVM이 입력된 매개변수가 없으면 null 대신 크기가 0인 배열을 생성해서 args에 전달
 */