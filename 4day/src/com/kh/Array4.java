package com.kh;

public class Array4 {

	public static void main(String[] args) {
		
		String[][] names = new String[2][3];
		
		names[0][0] = "00";
		names[0][1] = "01";
		names[0][2] = "02";
		names[1][0] = "10";
		names[1][1] = "11";
		names[1][2] = "12";
		
		for (int i = 0; i < names.length; i++) {
			
			for (int j = 0; j < names[i].length; j++) {
				
				System.out.print(names[i][j] + " ");
			}
			
			System.out.println();
		}
		
		String[][] names2 = { 
				{"00", "01", "02"},
				{"10", "11", "12"}
				};
		
		for (int i = 0; i < names2.length; i++) {
			
			for (int j = 0; j < names2[i].length; j++) {
				
				System.out.print(names2[i][j] + " ");
			}
			
			System.out.println();
		}
		
	} // end of main

} // end of class
