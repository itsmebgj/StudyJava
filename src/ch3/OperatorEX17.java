package ch3;

public class OperatorEX17 {
    public static void main(String[] args) {
        double pi = 3.141592; 
		double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;
        /*
        (3141.592 + 0.5) / 1000.0
        (3142.092)/ 1000.0
        3142 / 1000.0
        3142.0 / 1000.0
        3.142
        */

		System.out.println(shortPi);
    }
}
