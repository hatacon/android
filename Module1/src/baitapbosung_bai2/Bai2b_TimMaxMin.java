package baitapbosung_bai2;

import java.util.Scanner;

public class Bai2b_TimMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào một dãy N chữ số:");
		System.out.print("N = ");
		n = input.nextInt();
		
		int i, max, min, num;
		System.out.print("Nhập vào số thứ 1: ");
		max = input.nextInt();
		min = max;
		for(i = 2; i <= n; i++)
		{
			System.out.print("Nhập vào số thứ " + i +": ");
			num = input.nextInt();
			if(max < num)
			{
				max = num;
			}
			if(min > num)
			{	
				min = num;
			}
		}
		
		input.close();
		
		System.out.println("Số lớn nhất trong dãy là: " + max);
		System.out.println("Số nhỏ nhất trong dãy là: " + min);
		
	}

}
