// Question: https://www.hackerrank.com/challenges/s10-spearman-rank-correlation-coefficient/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j, n, sum = 0;
        double temp, r;
        n = scan.nextInt();
        double x[] = new double[n];
        double y[] = new double[n];
        double a[] = new double[n];
        double b[] = new double[n];
        int c[] = new int[n];
        int d[] = new int[n];

        for(i = 0; i < n; i++){
            x[i] = scan.nextDouble();
            a[i] = x[i];
        }
        for(i = 0; i < n; i++){
            y[i] = scan.nextDouble();
            b[i] = y[i];
        }
        
        for(i = 0; i < n-1; i++) {
            for(j = i+1; j < n; j++) {
                if(a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                if(b[i] > b[j]) {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        
        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                if(x[i] == a[j]) {
                    c[i] = j+1;
                    break;
                }
            }
        }
        
        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                if(y[i] == b[j]) {
                    d[i] = j+1;
                    break;
                }
            }
        }
        for(i = 0; i < n; i++) {
            sum = sum + (c[i] - d[i])*(c[i] - d[i]);
        }
        
        r = (double) (6*sum)/(n*(n*n-1));
        System.out.println((double) 1-r);
    }
}
