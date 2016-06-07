package bai7;

import java.util.Scanner;

public class Bai7b {

	public static void main(String[] args) {
		String n,chuoi;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào 1 đoạn văn: ");
		n = input.nextLine();
		
		System.out.println("Nhập vào từ cần tìm: ");
		chuoi = input.nextLine(); 
		input.close();
		
		int dem = 0;
		String[] str;
		str = n.split(" ");
		int sotu = str.length;
		for(int i=0; i<str.length; i++)
		{
			if(chuoi.compareTo(str[i]) == 0)
			{
				dem++;
			}
		}
		
		System.out.println("Đoạn văn có "+sotu+" từ.");
		
		if(dem == 0 )
		{
			System.out.println("Đoạn văn không có từ '"+chuoi+"'.");
		}
		else
			{
			System.out.println("Đoạn văn có "+dem+" từ '"+chuoi+"'.");
			}
	}

}
