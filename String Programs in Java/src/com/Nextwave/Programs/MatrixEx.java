package com.Nextwave.Programs;

public class MatrixEx {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[][] b = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = i * 3 + j + 1;
		System.out.println(b[i][j]); 	
			}
		}
	}
}
