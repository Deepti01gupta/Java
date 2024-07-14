// public class Main
// {
// 	public static void main(String[] args) {
// 		System.out.println("Hello World");
// 	}
// }

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.close();
		int sum1=num1+num2;
		System.out.println("sum of "+num1+" and "+num2+" is "+sum1);
	}
}