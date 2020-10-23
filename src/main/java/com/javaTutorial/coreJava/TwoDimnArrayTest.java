package com.javaTutorial.coreJava;

public class TwoDimnArrayTest {

	public static void main(String[] args) {

		// 3 X 3 Matrix\
		//							0,  1,  2 // Elements
		//							c0, c1, c2
		int[][] numberMatrix = {	
									{9, 1, 2}, //  Row 0  	// element 0
									{2, 76, 1}, // Row 1	// element 1
									{1, 98, 3456} // Row 2	// element 2
							    };
		
		double[][] doubleMatrix = { // 2 X 3  dimentional array
									{2, 75, 1},
									{43, 87,0}
									};
		
		System.out.println(numberMatrix[1][1]);
		
		// 2 X 3
		int[][] matrix4X4 = new int[2][3];
		
		for(int i=0; i<2; i++) { // Rows
			// First loop i=0;
			// fourth loop i=1;
			for (int j=0; j<3; j++) { // Columns
				// first Loop j=0;
				// second loop i=0; j=1;
				// third loop 	i=0; j=2
				matrix4X4[i][j] = i + j + 9; // first loop matrix4X4[0][0]
											// second loop matrix4X4[0][1]
											// third loop  matrix4X4[0][2]
											// fourth matrix4X4[1][0]
											// 5th matrix4X4[1][1]
											// 6th matrix4X4[1][2]  // i=1; j=2								
			}			
		}
		
		
		for(int i=0; i<2; i++) { // Rows
			for (int j=0; j<3; j++) { // Columns
				System.out.print(matrix4X4[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
