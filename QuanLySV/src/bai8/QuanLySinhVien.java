package bai8;

import java.util.ArrayList;

public class QuanLySinhVien {
	
	private ArrayList<SinhVien> dssv;
	
	public void ThemDSSinhVien(SinhVien sv)
	{
		dssv.add(sv);
	}
	
	public ArrayList<SinhVien> LayDSSinhVien()
	{
		return this.dssv;

	}
	
	public void TimKiemTheoHo(String ho)
	{
		int i, u = 0;
		
		for (i = 0; i < dssv.size(); i++) {
			
			if(dssv.get(i).getHoTen().indexOf(ho)==0)
			{
				System.out.println(dssv.get(i).toString());
				u++;
			}

		}
		
		if(u==0)
		{
			System.out.println("Khong tim thay ho: " + ho);
		}
		
		
	}

}
