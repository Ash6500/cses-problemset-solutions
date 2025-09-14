// Problem: Repetitions (CSES Problem Set)
// Link: https://cses.fi/problemset/task/1069
// Author: Ashutosh Rout
// Language: Java
// Time Complexity: O(n)
// Space Complexity: O(1)

package Introductory_Problems;

import java.util.Scanner;

public class repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // Input DNA string
        sc.close();

        int max = 1; // Tracks the longest repetition
        int currentCount = 1; // Tracks current repetition streak

        // Traverse the string and compare adjacent characters
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)){
                currentCount++;
                max = Math.max(max, currentCount); // Update max if needed
            } else{
                currentCount = 1; //Reset streak
            }
        }
        System.out.println(max); //Output the longest repetition
    }
}
