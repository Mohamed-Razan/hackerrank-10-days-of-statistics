// Question: https://www.hackerrank.com/challenges/s10-weighted-mean/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int n, i, j, sum = 0, ele = 0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        for(i = 0; i < n; i++){
            x[i] = scan.nextInt();
        }
        for(i = 0; i < n; i++){
            y[i] = scan.nextInt();
            ele = ele + y[i];
        }

        for(i = 0; i < n; i++){
            sum = sum + x[i]*y[i];
        }
        double res = (double) sum/ele;
        System.out.printf("%.1f",res);
    }
}
