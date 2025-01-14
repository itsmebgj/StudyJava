package ch4;

public class FlowEx23 {
    public static void main(String[] args) {
        int i = 5;
        while(i--!=0) { // i가 5부터 1씩 감소하며 0이 될때까지 반복, 후위형이라 4부터 시작
            System.out.println(i + " - I can do it.");
        }
    }
}

/*
while (조건식){
    조건식의 연산결과가 true일때 반복될 문장
}

for문과 while문의 비교
for문과 while문은 항상 서로 변환이 가능하지만 초기화나 증감식이 필요하지 않은 경우 while문이 적합하다.

초기화, 조건식, 증감식
for(int i=1; i<=10; i++) {
    System.out.println(i);
}

int i=1; //초기화
while(i<=10) { //조건식
    System.out.println(i);
    i++; //증감식
}

while문의 조건식은 생략 불가
항상 참인경우
while(true) {
    System.out.println("무한반복");
}

for(;;) {
    System.out.println("무한반복");
}
무한반복문은 반드시 블럭 안에 조건문을 넣어서 탈출할 수 있도록 해야한다.
 */