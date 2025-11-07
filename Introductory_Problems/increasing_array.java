package Introductory_Problems;

import java.util.Scanner;

public class increasing_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] nums = new long[size];

        for(int i = 0; i < size; i++){
            nums[i] = sc.nextLong();
        }

        long count = 0;

        for (int j = 1; j < size; j++) {
            
            if(nums[j-1] > nums[j]){
                count += (nums[j-1] - nums[j]);
                nums[j] = nums[j-1];
            }
        }

        System.out.println(count);
        sc.close();
    }
}
