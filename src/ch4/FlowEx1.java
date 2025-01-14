package ch4;

public class FlowEx1 {
    public static void main(String[] args) {
        int x= 0;

		System.out.printf("x=%d 일때, 참인 것은%n", x);

		if(x==0) System.out.println("x==0"); //T
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)"); //T
		System.out.println();

		x = 1;
		System.out.printf("x=%d 일때, 참인 것은%n", x);

		if(x==0) System.out.println("x==0"); 
		if(x!=0) System.out.println("x!=0"); //T
		if(!(x==0)) System.out.println("!(x==0)"); //T
		if(!(x!=0)) System.out.println("!(x!=0)");
    }
}

/*
조건문- if

if(조건식){
조건식이 참일때 수행될 문장
}

{} --> 블럭(블럭내 문장이 1개일경우 블럭 생략가능)
 */