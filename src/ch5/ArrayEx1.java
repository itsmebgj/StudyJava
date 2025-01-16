package ch5;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] score = new int[5]; //길이가 5인 배열 생성
		int k = 1;

		score[0] = 50; 
		score[1] = 60;
		score[k+1] = 70;   // score[2] = 70
		score[3] = 80;
		score[4] = 90;

    //  int[] score = new int[]{50, 60, 70, 80, 90}; // 배열의 생성과 초기화를 동시에 할 수 있다.
    //  int[] score = {50, 60, 70, 80, 90}; // 위 경우엔 new 타입[] 생략 가능

		int tmp = score[k+2] + score[4];  // int tmp = score[3] + score[4]

	    // for문으로 배열의 모든 요소를 출력한다.
		for(int i=0; i < 5; i++) {
			System.out.printf("score[%d]:%d%n",i, score[i]);		
		}

		System.out.printf("tmp:%d%n", tmp);
		System.out.printf("score[%d]:%d%n",7,score[7]); //index의 범위를 벗어난 값
    }
}

/*
배열(Array): 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
int score1, score2, score3, score4, score5; 
    -> int[] score = new int[5]; // 5개의 int값을 저장할 수 있는 배열 생성 (index: 0 ~ 4)

배열의 선언과 생성
타입[] 변수이름; // 배열을 선언 (배열을 다루기 위한 참조변수 선언)
변수이름 = new 타입[길이]; // 배열을 생성 (실제 저장공간 생성)
    -> 타입[] 변수이름 = new 타입[길이]; // 배열을 선언과 생성을 동시에 할 수 있다.

길이가 0인 배열또한 가능하다.

배열이름.length
    -> 배열의 길이를 알려주는 final 변수(상수, 변경불가)
    -> 배열의 길이를 변경하기 위해선 더 큰 배열을 새로 생성해서 기존의 배열을 복사한다.

아래는 모두 길이가 0인 배열
int[] score = new int[0];
int[] score = new int[]{};
int[] score = {};

배열의 길이가 큰 경우 초기화할 때, 저장된 값을 확인할 때 for문을 이용

Arrays.toString(배열이름)
    -> 배열의 모든 요소를 문자열로 변환하여 반환
    -> import java.util.Arrays; 필요
 */