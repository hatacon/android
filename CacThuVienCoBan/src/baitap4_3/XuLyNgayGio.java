package baitap4_3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class XuLyNgayGio {

	public static void main(String[] args) {

		Date currentDate = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat(
		"dd/MM/yyyy -hh:mm:ss");
		System.out.println("Ngày hiện tại của hệ thống là: "
		+ formatter.format(currentDate));

	}

}
