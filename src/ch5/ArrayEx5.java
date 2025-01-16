package ch5;

public class ArrayEx5 {
        public static void main(String[] args) {
        int sum =0;				// 총점을 저장하기 위한 변수
		float average = 0f;		// 평균을 저장하기 위한 변수

		int[] score = {100, 88, 100, 100, 90};

		for (int i=0; i < score.length ; i++ ) {
			sum += score[i]; // for문을 이용해 배열에 저장되어 있는 값들을 모두 더함
		}

		average = sum / (float)score.length ; // 계산결과를 float로 얻기 위함.

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
        }
}

/*
총합과 평균
배열에 저장된 값을 모두 더한 결과를 배열의 개수로 나우어 평균을 구한다.
 */