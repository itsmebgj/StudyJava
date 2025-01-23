package ch5;

import java.util.Scanner;

public class MultiArrEx4 {
    public static void main(String[] args) {
        String[][] words = {
			{"chair","의자"},			// words[0][0], words[0][1]
			{"computer","컴퓨터"},	// words[1][0], words[1][1]
			{"integer","정수"}		// words[2][0], words[2][1]
		};

		Scanner scanner = new Scanner(System.in);

		for(int i=0;i<words.length;i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);

			String tmp = scanner.nextLine();

			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
			} else {
			   System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",words[i][1]);
			}
		} // for
        scanner.close();
    }
}

/*
단어 맞추기
영단어를 보여주고 단어의 뜻을 맞추는 예제
words[i][0]에는 문제, words[i][1]에는 답이 저장
words[i][0]을 화면에 보여주고 입력받은 답은 tmp에 저장한다
equals()로 tmp와 words[i][1]을 비교해 정답인지 확인
 */