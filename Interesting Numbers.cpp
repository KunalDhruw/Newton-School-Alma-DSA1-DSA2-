/*
Interesting Numbers
medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bobs love interesting numbers, According to him, a number is interesting if it follows the given conditions:
The number is positive
The digits of the number when considered from left to right, they form an alternate odd even sequence. A sequence is an alternate odd even sequence when the numbers present on even indices in the sequence are odd, and the numbers present on the odd indices are even, where the sequence is having 1 based indexing.

You are given the number K.

Task
Determine the Kth smallest interesting number.

Note
Answer should not contain any leading zeros.
Input
The first line of the input contains T i.e the number of testcases.
Next T lines contains the value of K

Constraints
1 <= T <= 1e5
1 <= K <= 1e5
Output
Print the required number.
Example
Sample Input 1:
1
3

Sample Output 1:
6

Explanation
The first three interesting numbers are [2, 4, 6]. So the 3rd smallest number is 6.
*/


#include <bits/stdc++.h> 
using namespace std;

int main() {

	
    int t;
    int ev []= {0,2,4,6,8};
    int od []= {1,3,5,7,9};

     cin >> t;
     while(t>0){
         int k,size;
        
         cin >> k;
         int dif=k;
         int j=1;
         if(k==1)
           cout << 2;
         else if(k==2)
           cout << 4;
         else if(k==3)
           cout << 6;
         else if(k==4)
           cout << 8;
         else{        


         while(dif>0){
             dif=dif-(4*(pow(5,j-1)));
             j++;
             //cout << j << "j" <<endl;
         }
         

         
         size=j-1;
         

        // cout << size << endl;
         int po=pow(5,size-1);
         //cout << po << endl;

         for(int i=0;i<size;i++){
             int l=po/pow(5,i);
            int check=k/l;
            if(i==0 && check==0){
                cout << 2;
            }else{
            if(i%2==0)
               cout << ev[check];
            else
               cout << od[check];   
         }
         k=k%l;

         }
         
         //cout << v1 << " " << v2 << " " << size;

         }
         t--;
         cout << endl;
     }

    return 0;
}
