package bai8;

import java.util.ArrayList;
import java.util.Scanner;

public class NhapThongTin {
	
	
	public static void inThongtin(ArrayList<SinhVien> dssv) {
		
		
		for(int i = 0; i <= dssv.size(); i++)
		{
//			String[] str;
			String str = "nguyễn";
			String hoten= dssv.get(i).getHoten();
//			str = hoten.split(" ");
//			for(int j = 0; j < str.length; j++)
			{
//				if(str[j] == "nguyễn")
				
				if(hoten.contains(str) == true)
				{
					System.out.println("Danh sách sinh viên có họ 'Nguyễn': ");
					
					System.out.println("Mã số sinh viên: " + dssv.get(i).getMaSV());
				
					System.out.println("Họ tên sinh viên: " + dssv.get(i).getHoten());
					
					System.out.println("Quê quán: " + dssv.get(i).getQuequan());
					
					System.out.println("Điểm trung bình: " + dssv.get(i).getDiemTB());
				
					System.out.println("Ngày sinh: " + dssv.get(i).getNgaysinh());
					
					System.out.println("Email: " + dssv.get(i).getEmail());
					
				}
				else
				{
					System.out.println("Không tìm thấy sinh viên nào có họ 'Nguyễn'!");
				}
			}
		}
		
	}
	

	public static void main(String[] args) {

		ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();
		SinhVien x = new SinhVien();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhập thông tin sinh viên:");
		System.out.println("Mã số sinh viên: ");
		x.setMaSV(input.nextLine());
		
		System.out.println("Họ tên sinh viên: ");
		x.setHoten(input.nextLine());
		
		System.out.println("Quê quán: ");
		x.setQuequan(input.nextLine());
		
		System.out.println("Điểm trung bình: ");
		x.setDiemTB(input.nextDouble());
		
		System.out.println("Ngày sinh: ");
		x.setNgaysinh(input.nextLine());
		
		System.out.println("Email: ");
		x.setEmail(input.nextLine());
		
		dssv.add(x);

		input.close();
	}

}
