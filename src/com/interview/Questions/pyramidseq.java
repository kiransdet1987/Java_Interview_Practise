package com.interview.Questions;

/*1	2	3	4	
5	6	7	
8	9	
10	
*/
public class pyramidseq {

	public static void main(String[] args) {

		int k = 1;

		for (int i = 0; i < 4; i++) { // outer loop

			for (int j = 0; j < 4 - i; j++) { // inner loop 
				System.out.print(k);
				System.out.print("\t"); // to provide space
				k++;
			}
			System.out.println(""); // to move to next line.
		}

		System.out.println("Done");
		
		int p = 1;

		for (int m = 1; m <= 4; m++) { // outer loop

			for (int n = 0; n < m; n++) { // inner loop
				System.out.print(p);
				System.out.print("\t"); // to provide space
				p++;
			}
			System.out.println(""); // to move to next line.
		}

		/*
		 * 1 
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 */
		

		for (int y = 1; y <= 4; y++) { // outer loop
			int x = 1;
			for (int z = 0; z < y; z++) { // inner loop
				System.out.print(x);
				System.out.print("\t"); // to provide space
				x++;
			}
		
			System.out.println(""); // to move to next line.
		}
		
		/*
		 * 1 
		 * 1 2 
		 * 1 2 3 
		 * 1 2 3 4
		 */
		
		
	}

}
