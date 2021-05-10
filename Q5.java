// Question: https://www.hackerrank.com/challenges/s10-standard-deviation/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int n, i, j, sum = 0;
        double mean, sd, sum1 = 0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int a[] = new int[n];
        double b[] = new double[n];
        for(i = 0; i < n; i++){
            a[i] = scan.nextInt();
            sum = sum + a[i];
        }
        mean = sum/n;
        for(i = 0; i < n; i++){
            b[i] = (mean-(double) a[i]) * (mean-(double) a[i]);
            sum1 = sum1 + b[i];
        }
        sd = (double) Math.sqrt((double) (sum1/n));
        System.out.println(sd);
    }
}
