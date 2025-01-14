package ch4;

public class FlowEx22 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
		int sum = 0;
	
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();		

		for(int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp; // sum = sum + tmp;
		}
		System.out.println();

		System.out.println("sum="+sum);
    }
}

/*
향상된 for문
for(타입 변수명: 배열 또는 컬렉션){
    반복할 문장
}
배열 또는 컬렉션에 저장된 값이 매 반복마다 하나씩 순서대로 읽혀서 변수에 저장됨

tmp: temporary variable(임시변수)
 */