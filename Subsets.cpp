/*
Subsets
hard

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of integers that might contain duplicates, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
The subsets must be sorted lexicographically.
Input
First line of input contains number of testcases T. For each testcase, there will be two line of input, first of which contains N and next contains N space seperated integers. Every test case has two lines. First line is N, size of array.

Constraints:
1 <= T <= 500
1 <= N <= 12
1 <= x <= 9
Output
One line per test case, every subset enclosed in () and in every set intergers should be space seperated.(See example)
Example
Sample Input:
2
3
1 2 2
4
1 2 3 3

Sample Output:
()(1)(1 2)(1 2 2)(2)(2 2)
()(1)(1 2)(1 2 3)(1 2 3 3)(1 3)(1 3 3)(2)(2 3)(2 3 3)(3)(3 3)

Explanation:
Testcase 1: Subsets are
[
[],
[1],
[1,2],
[1,2,2],
[2],
[2, 2]
]
*/


#include <bits/stdc++.h> // header file includes every Standard library

#include<set>
#include<iterator>
#include<algorithm>
#include<cstring>
#include<climits>
#include<cstdlib>
#include<cstdio>
#include <iostream>
#include <unordered_set>
 #include <vector>

using namespace std;
int n;

void getSets(int a[],int i,int index,set<vector<int> > &s,vector<int> &v)
{
    if(i>=n)
        return;
    v[index]=a[i];
    vector<int> sets;
    for(int j=0;j<=index;j++)
    {
        sets.push_back(v[j]);
    }
    s.insert(sets);
    getSets(a,i+1,index+1,s,v);
    getSets(a,i+1,index,s,v);
}

int main() {
     int t;
        cin>>t;
        while(t--)
        {
            int a[13];
            cin>>n;
            for(int i=0;i<n;i++)
                cin>>a[i];
            set<vector<int> > s;
            sort(a,a+n);
            vector<int> v(n);
            getSets(a,0,0,s,v);
            cout<<"()";
            for(auto it=s.begin();it!=s.end();it++)
            {
                cout<<"(";
                int size=(*it).size();
                for(int i=0;i<size;i++)
                {
                    cout<<(*it)[i];
                    if(i<size-1)
                        cout<<" ";
                }
                cout<<")";
            }
            cout<<endl;
        }

	// Your code here
    return 0;
}
