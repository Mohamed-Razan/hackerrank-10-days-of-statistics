// Question: https://www.hackerrank.com/challenges/s10-quartiles/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int n, i, j, temp, p, q, r;
        double q1t, q2t, q3t, q1, q2, q3;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int a[] = new int[n];
        for(i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        for(i = 0; i < n-1; i++){
            for(j = i+1; j < n; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        q1t = (double) (n+1)/4;
        q2t = (double) (n+1)/2;
        q3t = (double) (3*(n+1))/4;

        p = (int) q1t;
        q = (int) q2t;
        r = (int) q3t;

        q1 = (double) (a[p-1] + (a[p] - a[p-1])*(q1t - p));
        q2 = (double) (a[q-1] + (a[q] - a[q-1])*(q2t - q));
        q3 = (double) (a[r-1] + (a[r] - a[r-1])*(q3t - r));

        if((q1 - (int)q1) < 0.5)
            q1 = q1;
        else
            q1 = q1 + 1;

        System.out.println((int)q1);
        System.out.println((int)q2);
        System.out.println((int)q3);
    }
}
