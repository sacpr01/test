package com.pratiksha;

public class SortedArrayCombo {

	public static void main(String[] args) {
		int A[] = { 10, 15, 25 };
		int B[] = { 1, 5, 20, 30 };
		int lenA = A.length;
		int lenB = B.length;
		int C[] = new int[lenA + lenB];
		printSortedCombo(A, B, C, 0, 0, 0, lenA, lenB, true);

	}

	public static void printSortedCombo(int A[], int B[], int C[], int a,
			int b, int c, int lenA, int lenB, boolean flag) {

		if (flag) {
			
			for (int k=a; k < lenA; k++) {
				if (c == 0){
					C[c] = A[k];
					printSortedCombo(A, B, C, k+1, b, c, lenA, lenB, !flag);
				}
					
				else {
					if (A[a] > C[c]){
						C[c+1] = A[k];
					   printSortedCombo(A, B, C, k+1, b, c+1, lenA, lenB, !flag);
					}
				} 
				
			}

		} else {
			for (int k=b; k < lenB; k++) {

				if (B[k] > C[c]) {
					C[c+1] = B[k];
					int i=0;
					System.out.println();
					while(i<=(c+1))
						System.out.print(C[i++]+" ");
					printSortedCombo(A, B, C, a, k+1, c+1, lenA, lenB, !flag);
				}

				
			}

		}

	}

}
