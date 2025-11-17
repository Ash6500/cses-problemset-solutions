package Introductory_Problems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class permutations {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        if (n==2 || n==3) {
            System.out.println("NO SOLUTION");
            return;
        }
        
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));


        for (int i = 2; i <= n; i+=2) {
            out.print(i);
            out.print(" ");
        }

        for (int i = 1; i <= n; i+=2) {
            out.print(i);
            out.print(" ");
        }

        out.println();
        out.flush();
    }
}
