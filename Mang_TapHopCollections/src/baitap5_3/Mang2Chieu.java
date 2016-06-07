package baitap5_3;

import java.util.Scanner;

public class Mang2Chieu {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Nhập vào số dòng(số cột): ");
		n = input.nextInt();
		int mang[][] = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("Nhập phần tử thứ "+j+" dòng "+i+": ");
				mang[i][j] = input.nextInt();
			}
		}
		input.close();
		
//		xuất mảng đã nhập
		System.out.println("\nMảng đã nhập:");
		for(int i=0;i<mang.length;i++)
		{
			for(int j=0;j<mang.length;j++)
			{
				System.out.print(mang[i][j] + " ");
			}
			System.out.print("\n");
		}
		
//		xuất các phần tử nằm trên đường chéo chính
		for(int i=0;i<mang.length;i++)
		{
			for(int j=i+1;j<mang.length;j++)
			{
				System.out.print(mang[i][j] + " ");
			}
			System.out.print("\n");
		}
		
//		tính tổng trên 1 dòng
		for(int i=0;i<mang.length;i++)
		{
			int s1 = 0; 
			for(int j=0;j<mang.length;j++)
			{
				s1 += mang[i][j];
			}
			System.out.print("\nTổng các phần tử trên dòng "+i+": "+s1);
		}
		
//		tính tổng trên 1 cột
		for(int i=0;i<mang.length;i++)
		{
			int s1 = 0; 
			for(int j=0;j<mang.length;j++)
			{
				s1 += mang[j][i];
			}
			System.out.print("\nTổng các phần tử trên cột "+i+": "+s1);
		}
		
	}

}
