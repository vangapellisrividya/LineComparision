package com.bl.linecomparision;

public class LineComparision {
	public static void main(String[] args) {
		int x1,x2,y1,y2;
		x1=1;x2=2;y1=1;y2=2;
		double linelength;
		linelength = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("length of line "+linelength);
	}

}
