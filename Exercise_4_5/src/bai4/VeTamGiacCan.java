package bai4;

import java.util.Scanner;

public class VeTamGiacCan {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào n: ");
		n = input.nextInt();
//		int mang[][] = new int[n][n];
		input.close();
		for(int i=0; i<n; i++)
		{
			for(int j=i; j<n; j++)
			{
				System.out.print("*   ");
			}
			System.out.println("\n");
		}
	}

}
