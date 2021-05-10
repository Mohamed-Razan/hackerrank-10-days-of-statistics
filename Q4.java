// Question: https://www.hackerrank.com/challenges/s10-interquartile-range/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int n, i, j, temp, p, q, r, z = 0, sum = 0;
        double q1t, q2t, q3t, q1, q2, q3;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int b[] = new int[n];
        int f[] = new int[n];
        int a[] = new int[1000];
        int x[] = new int[1000];
        int y[] = new int[1000];

        for(i = 0; i < n; i++){
            b[i] = scan.nextInt();
        }
        for(i = 0; i < n; i++){
            f[i] = scan.nextInt();
            sum = sum + f[i];
        }

        for(i = 0; i < n; i++){
            for(j = 0; j < f[i]; j++){
                a[z] = b[i];
                z++;
            }
        }
        for(i = 0; i < sum-1; i++){
            for(j = i+1; j < sum; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(i = 0; i < sum/2; i++){
            x[i] = a[i];
        }
        if(sum%2 == 0){
            for(i = sum/2, j = 0; i < sum; i++, j++){
                y[j] = a[i];
            }
        }
        else{
            for(i = sum/2+1, j = 0; i < sum; i++, j++){
                y[j] = a[i];
            }
        }
        q2t = (double) (sum/2+1)/2;
        q = (int) q2t;
        q1 = (double) (x[q-1] + (x[q] - x[q-1])*(q2t - q));
        q3 = (double) (y[q-1] + (y[q] - y[q-1])*(q2t - q));
        System.out.println(q3-q1);
    }
}
