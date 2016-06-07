package bai3;

import java.util.Scanner;

public class TinhTongBac2 {

	public static void main(String[] args) {
		
		int n, i;
		long s = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào số N: ");
		n = input.nextInt();
		input.close();
		
		for(i=0; i<=n; i++)
		{
			s += Math.pow(i, 2);
		}
		
		System.out.println("S = " + s);
	}

}
