// Problem: Distinct Numbers (CSES Problem Set)
// Link: https://cses.fi/problemset/task/1621
// Author: Ashutosh Rout
// Language: Java
// Time Complexity: O(n)
// Space Complexity: O(n)

package Sorting_and_Searching;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class distinct_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();

        // Read all numbers and store unique ones in the set
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            set.add(x);
        }

        // Output the count of distinct numbers
        System.out.println(set.size());
        sc.close();
    }
}
