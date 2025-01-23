package ch5;

import java.util.Scanner;

public class MultiArrEx1 {
    public static void main(String[] args) {
        final int SIZE = 10;
		int x = 0, y = 0;

		char[][] board = new char[SIZE][SIZE]; // 입력한 좌표를 표시하기 위한 것
		byte[][] shipBoard = {                 // 상대방의 배의 위치를 저장
		  //  1  2  3  4  5  6  7  8  9
			{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
			{ 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
			{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
			{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
			{ 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
			{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
			{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
			{ 0, 0, 0, 0, 0, 1, 1, 1, 0 }, // 9
		};                                     // 0은 바다, 1은 배
        /*
        좌표를 쉽게 입력하기 위한 행번호와 열번호가 필요해서 행과 열의길이가 board가 shipboard보다 1큼
              1  2  3  4  5  6  7  8  9
            1 0  0  0  0  0  0  1  0  0
            2 1  1  1  1  0  0  1  0  0
            3 0  0  0  0  0  0  1  0  0
            4 0  0  0  0  0  0  1  0  0
            5 0  0  0  0  0  0  0  0  0
            6 1  1  0  1  0  0  0  0  0
            7 0  0  0  1  0  0  0  0  0
            8 0  0  0  1  0  0  0  0  0
            9 0  0  0  0  0  1  1  1  0
         */

	     // 0행에 행번호를, 0열에 열번호를 저장한다. 
		for(int i=1;i<SIZE;i++)
			board[0][i] = board[i][0] = (char)(i+'0'); // board는 char배열이므로 숫자를 문자로 변환

		Scanner scanner = new Scanner(System.in);

		while(true) {   // 무한반복문으로 좌표를 반복해서 입력받음, 입력받은 좌표 x, y에 저장된 값이 1 이면 board[x][y]에 'O'를 저장, 아니면 'X'를 저장
			System.out.printf("좌표를 입력하세요.(종료는 00)>");
			String input = scanner.nextLine(); // 화면입력받은 내용을 tmp에 저장

			if(input.length()==2) {   // 두 글자를 입력한 경우
				x = input.charAt(0) - '0';  // 문자를 숫자로 변환
				y = input.charAt(1) - '0';

				if(x==0 && y==0) // x와 y가 모두 0인 경우 종료
					break; 
			} 
			
			if(input.length()!=2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE){
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}

			// shipBoard[x-1][y-1]의 값이 1이면, 'O'을 board[x][y]에 저장한다.  
			board[x][y] = shipBoard[x-1][y-1]==1 ? 'O' : 'X';  

			// 배열 board의 내용을 화면에 출력한다.
			for(int i=0;i<SIZE;i++) {
				System.out.println(board[i]); // 2차원 char배열의 각 요소 board[i]는 1차원 배열이라서 간단히 출력 가능
			}
			System.out.println();
		}
        scanner.close();
    }
}

/*
좌표에 X표하기
둘이 마주 앉아 다양한 크기의 배를 상대방이 알지 못하게 배치한 다음, 번갈아가며 좌표를 불러서 상대방의 배의 위치를 알아내는 게임
 */