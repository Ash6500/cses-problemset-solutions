// Problem: Missing Number (CSES Problem Set)
// Link: https://cses.fi/problemset/task/1083
// Author: Ashutosh Rout
// Language: Java
// Time Complexity: O(n)
// Space Complexity: O(1)

package Introductory_Problems;

import java.util.Scanner;

public class missing_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		long n = sc.nextLong();
		
        // Calculate the expected sum of first n natural numbers
		long originalSum = (n*(n+1))/2;
		long newSum = 0;
		
        // Read n-1 numbers and compute their sum
		for(int i = 0; i < n-1; i++){
			newSum += sc.nextLong();
		}
		
        // // The missing number is the difference between expected and actual sum
		System.out.print(originalSum - newSum);
        sc.close();
    }
}
