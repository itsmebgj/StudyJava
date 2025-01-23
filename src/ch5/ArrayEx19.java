package ch5;

public class ArrayEx19 {
    public static void main(String[] args) {
         int[][] score = {
							{ 100, 100, 100}
							, { 20, 20, 20}
							, { 30, 30, 30}
							, { 40, 40, 40}
							, { 50, 50, 50}
						};
		// 과목별 총점
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;

	    System.out.println("번호 국어 영어 수학 총점 평균 ");
	    System.out.println("=============================");

		for(int i=0;i < score.length;i++) {
			int   sum = 0;       // 개인별 총점
			float avg = 0.0f;   // 개인별 평균

			korTotal  += score[i][0]; // 첫번째 요소 : 국어점수
			engTotal  += score[i][1]; // 두번째 요소 : 영어점수
			mathTotal += score[i][2]; // 세번째 요소 : 수학점수
			System.out.printf("%3d", i+1); // 번호 출력

			for(int j=0;j < score[i].length;j++) { // 각 행 별로 합산 점수
				sum += score[i][j]; 
				System.out.printf("%5d", score[i][j]); //각 요소 별로 점수 출력, 5칸씩 띄워서 출력
			}

			avg = sum/(float)score[i].length;  // 평균계산
			System.out.printf("%5d %5.1f%n", sum, avg); // 각 행 별로 총점, 평균 출력
		}

	    System.out.println("=============================");
	    System.out.printf("총점:%3d %4d %4d%n", korTotal, engTotal, mathTotal);
    }
}

/*
가변배열
int[][] score = new int [5][];
score[0] = new int[4];
score[1] = new int[3];
score[2] = new int[2];
score[3] = new int[2];
score[4] = new int[3];

score.length : 5
score[0].length : 4
score[1].length : 3으로 서로 다름
 */