/*
Implementing Merge Sort
easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an unsorted array, your task is to sort the array using merge sort.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function implementMergeSort() that takes 3 arguments.
arr: input array
start: starting index which is 0
end: ending index of array

Constraints
1 <= T <= 100
1 <= N <= 10^4
1 <= Arr[i] <= 10^5

Sum of 'N' over all test cases does not exceed 10^6
Output
You need to return the sorted array. The driver code will print the array in sorted form.
Example
Sample Input:
2
3
3 1 2
3
4 5 6

Sample Output:
1 2 3
4 5 6
*/


public static int[] implementMergeSort(int arr[], int si, int ei)
    {
       if(si >= ei){
         return arr;
       }
       int mid = si + (ei - si)/2;
       implementMergeSort(arr,si,mid);
       implementMergeSort(arr,mid+1,ei);
       return conquer(arr,si,mid,ei); // Your code here
       // You can have your own function where you will use 
      // start and end position for divide purpose  
    }
    static int []conquer(int []arr, int si, int mid, int ei){
        int []merged = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid +1;
        int x = 0;
        while(idx1 <= mid && idx2 <= ei){
          if(arr[idx1] <= arr[idx2]){
            merged[x++] = arr[idx1++];
          }else{
            merged[x++] = arr[idx2++];
          }
        }
        while(idx1 <= mid){
          merged[x++] = arr[idx1++];
        }
        while(idx2 <= ei){
          merged[x++] = arr[idx2++];
        }
        for(int i=0,j=si; i<merged.length; i++,j++){
          arr[j] = merged[i];
        }
        return arr;
    }
