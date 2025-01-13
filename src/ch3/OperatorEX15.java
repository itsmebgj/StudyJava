package ch3;

public class OperatorEX15 {
    public static void main(String[] args) {
        char lowerCase = 'a'; 
        char upperCase = (char)(lowerCase - 32);  // 소문자 > 대문자

/*
대문자 > 소문자
        char upperCase = 'A'; 
        char lowerCase = (char)(upperCase + 32); 

 */

        System.out.println(upperCase); 
    }
}