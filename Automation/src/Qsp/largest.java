package Qsp;

import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("enter the numbers");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int c=s1.nextInt();
		int big=a;
		if(b>big)
			big=b;
		if(c>big)
			big=c;
			System.out.println(big);
			 

	}

}
