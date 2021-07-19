package fibanocci;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		int t1=0;
		int t2=1;
		int sum=0;
		System.out.println("enter the number");
		Scanner scr=new Scanner(System.in);
		int n=scr.nextInt();
		for(int i=1;i<=n;i++)
		{
			
			sum=t1+t2;
			t1=t2;
			t2=sum;
			
		System.out.print(" "+sum);		
		}

	}

}
