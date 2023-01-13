/*
Chess Board
medium


Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Tom loves Chess boards. He admires its symmetry and how the black and white colours are placed adjacently along both the axis.

More formally, a chessboard like coloring implies that no two adjacent cells have the same color and all the cells are painted either white or black.

On his birthday, Tom has been gifted a board which is in the form of a N*N grid. Every cell is painted either black or white. Since Tom loves the placement of colours in a chessboard, he will try to convert the board that has been gifted to him, identical to a chessboard. He has both black and white colours available to him. Help him find out the minimum number of the cell he will have to recolour to paint his board similar to chessboard.
Input
First line contains an integer N, denoting the size of the board
Each of the next N lines contains N space separated integers and each integer being either '0' or '1'
'1' represent black cell
'0' represents white cell

Constraints
1 <= N <= 1000
Output
A single integer that is the minimum number of cells that Tom will have to re-color in his board to convert the given board to a chess board like coloring.
Example
Input:
3
1 1 1
1 1 1
1 1 1

Output:
4

Explanation:
Convert to
1 0 1
0 1 0
1 0 1
Thus we will have to colour 4 cells.

Input:
3
0 1 0
1 0 1
0 1 0

Output:
0
It already has a chess board like coloring.
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException {
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(sc.readLine());
		int [][] c=new int [n][n];
		int [][] chess1=new int[n][n];
		int [][] chess2=new int[n][n];
		int count1=0;
		int count2=0;
		
		for(int i=0;i<n;i++){
			String inputs[] = sc.readLine().split(" ");
			for(int j=0;j<n;j++){
				c[i][j]=Integer.parseInt(inputs[j]);
				if((i%2 == 0) == (j%2 == 0)){
						chess1[i][j]=0;
				}
				else{
					chess1[i][j]=1;
				}
				if((i%2 == 0) == (j%2 == 0)){
						chess2[i][j]=1;
				}
				else{
					chess2[i][j]=0;
				}
				count1+=Math.abs(c[i][j]-chess1[i][j]);
				count2+=Math.abs(c[i][j]-chess2[i][j]);
			}
		}
	
		if(count1 > count2){
			System.out.print(count2);
		}
		else
		System.out.print(count1);
	}
}
