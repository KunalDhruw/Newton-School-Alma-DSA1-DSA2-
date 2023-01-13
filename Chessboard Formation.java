/*
Chessboard Formation
hard

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
An N x N board contains only 0s and 1s. In each move, you can swap any 2 rows with each other, or any 2 columns with each other.

What is the minimum number of moves to transform the board into a "chessboard" - a board where no 0s and no 1s are 4-directionally adjacent? If the task is impossible, return -1.
Input
The input line contains T, denoting the number of test cases. Each test case contains two lines. First-line contains N, size of the matrix. Second-line contains N*N elements of binary matrix.

Constraints:
1 <= T <= 100
2 <= N <= 50
0 <= mat[i][j] <= 1
Output
For each testcase you need to print the minimum number of swaps required.
Example
Input:
2
4
0 1 1 0
0 1 1 0
1 0 0 1
1 0 0 1
3
0 1 0
1 0 1
1 1 0

Output:
2
-1

Explanation:
One potential sequence of moves is shown below, from left to right:

0110 1010 1010
0110 --> 1010 --> 0101
1001 0101 1010
1001 0101 0101

The first move swaps the first and second columns.
The second move swaps the second and third row.
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     static int movesToChessboard(int[][] board) {
		int N = board.length, colToMove = 0, rowToMove = 0, rowOneCnt = 0, colOneCnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (((board[0][0] ^ board[i][0]) ^ (board[i][j] ^ board[0][j])) == 1) {
					return -1;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			rowOneCnt += board[0][i];
			colOneCnt += board[i][0];
			if (board[i][0] == i % 2) {
				rowToMove++;
			}
			if (board[0][i] == i % 2) {
				colToMove++;
			}
		}
		if (rowOneCnt < N / 2 || rowOneCnt > (N + 1) / 2) {
			return -1;
		}
		if (colOneCnt < N / 2 || colOneCnt > (N + 1) / 2) {
			return -1;
		}
		if (N % 2 == 1) {
			if (colToMove % 2 == 1) {
				colToMove = N - colToMove;
			}
			if (rowToMove % 2 == 1) {
				rowToMove = N - rowToMove;
			}
		} else {
			colToMove = Math.min(colToMove, N - colToMove);
			rowToMove = Math.min(rowToMove, N - rowToMove);
		}
		return (colToMove + rowToMove) / 2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m, n, i, j, t;
		t = sc.nextInt();
		while (t > 0) {

			m = sc.nextInt();
			n = m;
			int M[][] = new int[m][n];
			for (i = 0; i < m; i++) {
				for (j = 0; j < n; j++) {
					M[i][j] = sc.nextInt();
				}
			}

			System.out.println(movesToChessboard(M));
			t--;
		}
	}
}
