// Problem: Weird Algorithm (CSES Problem Set)
// Link: https://cses.fi/problemset/task/1068
// Author: Ashutosh Rout
// Language: Java
// Time Complexity: O(log n)
// Space Complexity: O(1)

package Introductory_Problems;

import java.util.Scanner;

public class weied_algorithm {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		
		// Apply Collatz sequence until n becomes 1
		while(n != 1){
			System.out.print(n + " ");
			if(n%2==0){
				n /= 2;
			} else {
				n = (n*3)+1;
			}
		}
		System.out.print(1); //Final value
	}
}
