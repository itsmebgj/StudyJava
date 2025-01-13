package ch3;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i=5, j=0;

		j = i++; //5가 j로 넘어가고 ++된 값을 i에 저장 
        /*
        ++i; (증가 후에)
        j = i; (참조해 대입)
        */
		System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);

		i=5;        // 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		j=0;

		j = ++i; //j로 값이 넘어가기 전에 i에 ++된 값 저장
        /*
        j = i; (참조해 대입 후에)
        i++; (증가)
        */ 
		System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);
    }
}
