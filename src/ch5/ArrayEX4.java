package ch5;

public class ArrayEX4 {
    public static void main(String[] args) {
        char[] abc = { 'A', 'B', 'C', 'D'};
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);

		// 배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		char[] result = new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length); // abc[]의 모든 요소를 result배열의 0 위치부터 복사
		System.arraycopy(num, 0, result, abc.length, num.length); // num[]의 모든 요소를 result배열의 abc.length 위치부터 복사
		System.out.println(result);

		// abc[0]에서 num[0]으로 abc.length개의 데이터를 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num); // ABCD456789

	     // number의 인덱스6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num); // ABCD45ABC9
    }
}

/*
배열의 복사
2. System.arraycopy() 이용
지정된 범위의 값들을 한 번에 통째로 복사가능
for문보다 빠르고 효율적

for(int i=0; i<arr.length; i++) {
    newNum[i] = num[i];
}
    -> System.arraycopy(num, 0, newNum, 0, num.length);
    ->              num[0]에서 newNum[0]으로 num.length개의 데이터를 복사 
*/