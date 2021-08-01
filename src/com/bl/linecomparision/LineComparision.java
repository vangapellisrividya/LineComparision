package com.bl.linecomparision;

public class LineComparision {
	public static void main(String[] args) {
		int x1, x2, y1, y2;
		int x3 = 1, x4 = 2, y3 = 1, y4 = 2;
		x1 = 1;
		x2 = 2;
		y1 = 1;
		y2 = 2;
		double linelength1,linelength2;
		linelength2 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("length of line " + linelength2);
		linelength1 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		System.out.println("length of line " + linelength1);
		if (linelength1 == linelength2)
		{
			System.out.println("length is equal ");
		} else 
		{
			System.out.println("length is not equal");
		}

	}
}




