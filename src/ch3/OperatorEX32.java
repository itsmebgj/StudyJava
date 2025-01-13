package ch3;

public class OperatorEX32 {
    public static void main(String[] args) {
        int  x, y, z;
		int  absX, absY, absZ;
		char signX, signY, signZ;

		x = 10;
		y = -5;
		z = 0;

		absX = x >= 0 ? x : -x;  // x의 값이 음수이면, 양수로 만든다 (절댓값 저장), absX == 10 
		absY = y >= 0 ? y : -y;  //absY == 5
		absZ = z >= 0 ? z : -z;  //absZ == 0

		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');  // 조건 연산자를 중첩, signX == '+'
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-');  // signY == '-'
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-');  // signZ == ' '

		System.out.printf("x=%c%d\n", signX, absX);
		System.out.printf("y=%c%d\n", signY, absY);
		System.out.printf("z=%c%d\n", signZ, absZ);
    }
}

/*
조건연산자 (?): 세 개의 피연산자를 필요로 하는 삼항 연산자
조건식 ? 식1 : 식2
        true  false
조건식 평가결과가 true이면 식1이, false이면 식2가 연산결과가 됨

result = (x > y) ? x : y;
ㅡ>   if (x>y)
        result = x; // x>y가 true일 때
      else
        result = y; // x>y가 false일 때


대입연산자 (=): 변수와 같은 저장공간에 값, 수식의 연산결과를 저장하는데 사용, 오른쪽 값을 왼쪽 피연산자에 저장
연산 진행 방향: <--

대입연산자의 왼쪽 피연산자(left value)를 lvalue, 오른쪽 피연산자(right value)를 rvalue라고 한다.
rvalue는 변수, 상수, 식 모두 가능
lvalue는 변수처럼 값이 변경가능한 것(리터널, 상수 불가)

복합 대입연산자 (op=)
대입연산자는 다른 연산자(op)와 결합하여 'op=' 형태로 사용가능
i op= 3;
->  i = i op 3;

ex) i += 3;
->  i = i + 3;

ex) i |= 3;
->  i = i | 3;
*/