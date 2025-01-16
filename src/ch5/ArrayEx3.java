package ch5;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

		// 배열 arr에 1~5를 저장한다.
		for(int i=0; i < arr.length;i++) 
			arr[i] = i + 1;

		System.out.println("변경전 - arr.length:"+arr.length);	
		for(int i=0; i < arr.length;i++) 
			System.out.println("arr["+i+"]:"+arr[i]);	

		int[] tmp = new int[arr.length*2];

		// 배열 arr에 저장된 값들을 배열 tmp에 복사한다.
		for(int i=0; i < arr.length;i++) 
			tmp[i] = arr[i];

		arr = tmp;  // tmp에 저장된 값을 arr에 저장한다.

		System.out.println("변경후 - arr.length:"+arr.length);	
		for(int i=0; i < arr.length;i++) 
			System.out.println("arr["+i+"]:"+arr[i]);	
    }
}

/*
배열의 복사
1. for문 이용
    -> int[] arr = new int[5];
    -> int[] tmp = new int[arr.length*2];
    -> for(int i=0; i<arr.length; i++) {
            tmp[i] = arr[i];
        }
    -> arr = tmp; 참조변수 arr이 새로운 배열을 가리키게 한다
    (변수 tmp에 저장된 값을 변수 arr에 저장, 덮어씌우기, arr이 기존에 가리키던 배열은 이제 사용불가)
*/