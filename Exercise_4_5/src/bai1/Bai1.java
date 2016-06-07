package bai1;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {

		int n, i;
		double a = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào chỉ số n: ");
		n = input.nextInt();
		input.close();
		
		for(i=1; i<=n; i++)
		{
			a += Math.cos(i);
		}
		
		System.out.println("Giá trị A = " + a);
	}

}
