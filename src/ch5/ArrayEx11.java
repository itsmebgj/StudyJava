package ch5;

public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr  = new int[10];
		int[] counter = new int[10];

		for (int i=0; i < numArr.length ; i++ ) {
			numArr[i] = (int)(Math.random() * 10); // 0~9의 임의의 수를 numArr[]에 저장
			System.out.print(numArr[i]);
		}
		System.out.println();

		for (int i=0; i < numArr.length ; i++ ) {
			counter[numArr[i]]++;
		}

		for (int i=0; i < numArr.length ; i++ ) {
			System.out.println( i +"의 개수 :"+ counter[i]);
		}
    }
}

/*
빈도수 구하기

counter[numArr[i]]++; // i가 0일때
    -> counter[numArr[0]]++; // numArr[0]의 값이 4라면
    -> counter[4]++; // counter[4]의 값이 1 증가
*/