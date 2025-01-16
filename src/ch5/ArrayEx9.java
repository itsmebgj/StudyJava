package ch5;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
            int[] code = { -4, -1, 3, 6, 11 };  // 불연속적인 값들로 구성된 배열
            int[] arr = new int[10];

            for (int i=0; i < arr.length ; i++ ) {
                int tmp = (int)(Math.random() * code.length); // 0~4 범위의 임의의 값을 tmp에 저장
                arr[i] = code[tmp]; //arr[]에 code[]의 임의의 값을 저장
            }

            System.out.println(Arrays.toString(arr));
    }
}

/*
임의의 값으로 배열 채우기
배열을 하나 더 사용
 */