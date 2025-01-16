package ch5;

import java.util.Arrays; // Arrays.toString()을 사용하기 위해 추가

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[]{100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};

		for (int i=0; i < iArr1.length ; i++ ) {
			iArr1[i] = i + 1; // 1~10의 숫자를 순서대로 배열에 넣는다.
		}

		for (int i=0; i < iArr2.length ; i++ ) {
			iArr2[i] = (int)(Math.random()*10) + 1; // 1~10의 값을 랜덤으로 배열에 저장
		}

		// 배열에 저장된 값들을 출력한다.
		for(int i=0; i < iArr1.length;i++) {
			System.out.print(iArr1[i]+",");	 // 1,2,3,4,5,6,7,8,9,10,
		}
		System.out.println();													
		System.out.println(Arrays.toString(iArr2)); // 배열의 모든 랜덤으로 저장된 요소를 출력한다.
		System.out.println(Arrays.toString(iArr3)); // [100, 95, 80, 70, 60]
		System.out.println(Arrays.toString(chArr)); //[a, b, c, d]
		System.out.println(iArr3); // 배열의 참조변수를 출력하면 배열의 주소가 출력된다.
		System.out.println(chArr); // char는 구분자 없이 출력된다.
    }
}
