/*
Grid and phrase
easy


Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an n*m grid which contains lower case English letters. How many times does the phrase "saba" appear horizontally, vertically, and diagonally in the grid?
Input
First line: Two integer n and m, where n denotes the number of rows and m denotes the number of columns in the grid
Next n lines: Each line must contain a string of length m which contains lower- case English letters only

Constraints:
1<=n, m<=100
Output
Print the number of times the word “saba” appears in the grid.

Example
Sample Input 1:
5 5
s a f e r
a m j a d
b a b o l
a a r o n
s o n g s

Sample Output 1:
2
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Main {
   public static void main(String args[] ) throws Exception {
       Scanner s = new Scanner(System.in);


                  int r = s.nextInt();
    		int c = s.nextInt();
    		char[][] array = new  char[r][c];
    
            for (int i = 0; i < r; i++) {
                for ( int j = 0; j < c; j++) {
                    array[i][j]=s.next().charAt(0);
                }
            }
             
                
       int count=0;

       for(int a=0; a<r; a++){
           for(int b=0; b<c; b++){
               if(b+3<=c-1){
                   if(array[a][b]=='s' 
                   && array[a][b+1]=='a'  
                   && array[a][b+2]=='b'  
                   && array[a][b+3]=='a'){
                       count++;
                   }
               }

               if(a+3<=r-1){
                   if(array[a][b]=='s'  
                   && array[a+1][b]=='a'  
                   && array[a+2][b]=='b'  
                   && array[a+3][b]=='a'){
                       count++;
                   }
               }

               if(a+3<=r-1 && b+3<=c-1){
                   if(array[a][b]=='s'  
                   && array[a+1][b+1]=='a'  
                   && array[a+2][b+2]=='b'  
                   && array[a+3][b+3]=='a'){
                       count++;
                   }
               }

               if(a-3>=0 && b+3<=c-1){
                   if(array[a][b]=='s'  
                   && array[a-1][b+1]=='a'  
                   && array[a-2][b+2]=='b'  
                   && array[a-3][b+3]=='a'){
                       count++;
                   }
               }
           }
       }
       System.out.print(count);
   }
}
