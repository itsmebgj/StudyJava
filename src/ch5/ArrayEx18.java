package ch5;

public class ArrayEx18 {
    public static void main(String[] args) {
         int[][] score = {
							{ 100, 100, 100}
							, { 20, 20, 20}
							, { 30, 30, 30}
							, { 40, 40, 40}
						}; //3열 4행의 2차원 배열 생성
		int sum = 0;

		for(int i=0;i < score.length;i++) { //i는 행index
			for(int j=0;j < score[i].length;j++) { //j는 열index
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
			}
		}

		for (int[] tmp : score) { //2차원 배열 score의 각 행을 순회하는 향상된 for문, score의 각 행을 tmp에 할당
			 for (int i : tmp) {  //tmp 배열의 각 요소를 순회, i에 할당
				sum += i;
			 } 
		} 

		System.out.println("sum="+sum);
    }
}

/*
다차원배열
2차원 배열 선언법
타입[][] 변수이름; // int[][] score;
타입 변수이름[][]; // int score[][];
타입[] 변수이름[]; // int[] score[];

int[][] score = new int[4][3]; // 4행 3열의 2차원 배열생성, 각 요소엔 타입의 기본값이 자동으로 저장

행index의 범위 : 0 ~ 행의 길이 -1
열index의 범위 : 0 ~ 열의 길이 -1
배열이름[행index][열index]로 각 요소 접근가능

초기화
int[][] score = {
    {100, 100, 100},
    {20, 20, 20},
    {30, 30, 30},
    {40, 40, 40}
};
 */