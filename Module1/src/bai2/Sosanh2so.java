package bai2;

import java.util.Scanner;

public class Sosanh2so {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập số a: ");
		a = input.nextInt();
		System.out.println("Nhập số b: ");
		b = input.nextInt();
		input.close();
		
		if(a<b)
		{
			System.out.println("a nhỏ hơn b.");
		}
		else if(a==b)
		{
			System.out.println("a bằng b.");
		}
		else
		{
			System.out.println("a lớn hơn b.");
		}
		
	}

}
