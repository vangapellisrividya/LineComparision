package com.bl.linecomparision;

public class LineComparision {
	public static void main(String[] args) {
		int x1, x2, y1, y2;
		
		int x3 = 1, x4 = 2, y3 = 1, y4 = 2;
		x1 = 1;
		x2 = 4;
		y1 = 1;
		y2 = 2;
		Integer linelength1,linelength2;
		linelength2 =(int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("length of line2: " +linelength2);
		linelength1 =(int) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		System.out.println("length of line1: " +linelength1);
		
			System.out.println(linelength1.compareTo(linelength2));
		
	}
}





