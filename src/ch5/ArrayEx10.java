package ch5;

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10]; //numArr[]의 길이를 10으로 지정

		for (int i=0; i < numArr.length ; i++ ) {
			System.out.print(numArr[i] = (int)(Math.random() * 10));
		} // numArr[]에 0~9의 임의의 값을 저장하고 출력
		System.out.println();

		for (int i=0; i < numArr.length-1 ; i++ ) { //배열의 전체길이에서 1을 뺀 횟수만큼 반복, 마지막 요소는 자동으로 정렬되기 때문
			boolean changed = false;	// 자리바꿈이 발생했는지를 체크한다.

			for (int j=0; j < numArr.length-1-i ;j++) { //비교작업을 반복할수록 비교해야하는 범위는 하나씩 줄어듬, 또한 매 반복마다 비교횟수가 1씩 줄어들기 때문에 -i를 해줌
				if(numArr[j] > numArr[j+1]) { // 옆의 값이 작으면 서로 바꾼다.
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;	// 자리바꿈이 발생했으니 changed를 true로.
				}
			} // end for j

			if (!changed) break;	// 자리바꿈이 없으면 반복문을 벗어난다.

			for(int k=0; k<numArr.length;k++)
				System.out.print(numArr[k]); // 정렬된 결과를 출력한다.
			System.out.println();
		} // end for i
    }
}

/*
정렬하기(sort)
길이가 10인 배열에 0과 9사이의 임의의 값으로 채운다음, 버블정렬 알고리즘을 통해 크기순으로 정렬
배열의 길이: n
배열의 첫 번째부터 n-1번째까지의 요소에 대해, 근접한 값가 크기를 비교하여 자리바꿈을 반복
 */