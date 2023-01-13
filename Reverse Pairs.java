/*
Reverse Pairs
medium


Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Print the number of reverse pairs in the array given an integer array nums.

A reverse pair is a pair (i, j) where 0 <= i < j < nums.length and nums[i] > 2 * nums[j].
Input
The first line of input will be n, which represents the array's length, followed by the n array items in the second line.

Constraints:
0<= n <=10000
1 <= nums[i] <= 10000
Output
Print the number of reverse pairs in the array.
Example
Sample Input 1:
4
1 3 4 5
Output 1:
0

Sample Input 2:
6
6 5 4 3 2 1
Output 2:
6
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
    private static int mergeSort(int[] nums, int l, int r) {
        if (l >= r) return 0;
        int count = 0;
        int mid = l + (r - l) / 2;
        count += mergeSort(nums, l, mid);
        count += mergeSort(nums, mid + 1, r);
        count += merge(nums, l, mid, r);
        return count;
    }
    private static int merge(int[] nums, int l, int mid, int r) {
        int count = 0, l1 = l, l2 = mid + 1, idx = 0;
        while (l1 <= mid && l2 <= r) {
            if ((long) nums[l1] > (long) 2 * nums[l2]) {
                count += mid - l1 + 1;
                l2++;
            } else l1++;
        }
        l1 = l;
        l2 = mid + 1;
        int[] copy = new int[r - l + 1];
        while (l1 <= mid && l2 <= r) {
            if (nums[l1] > nums[l2]) copy[idx++] = nums[l2++];
            else copy[idx++] = nums[l1++];
        }
        while (l1 <= mid) copy[idx++] = nums[l1++];
        while (l2 <= r) copy[idx++] = nums[l2++];
        System.arraycopy(copy, 0, nums, l, r - l + 1);
        return count;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(reversePairs(arr));
    }
}
