package baitap5_4;

import java.util.ArrayList;

public class DSArrayList {

	public static void main(String[] args) {


		ArrayList<String> mang = new ArrayList<String>();
		mang.add("Cupcake");
		mang.add("Donut");
		mang.add("Éclair");
		mang.add("Froyo");
		mang.add("Gingerbread");
		mang.add("HoneyComb");
		mang.add("Ice Cream Sandwich");
		mang.add("Jelly Bean");
		mang.add("KitKat");
		mang.add("Marsk Mallow");
		
		mang.add(4, "Lollipop");

		if(!mang.isEmpty())
		{
			mang.remove(mang.size()-1);
		}
		
		for(int i = 0; i<mang.size(); i++)
		{
			System.out.println(mang.get(i));
		}
		
	}

}
