// Question: https://www.hackerrank.com/challenges/s10-pearson-correlation-coefficient/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i, j;
        n = scan.nextInt();
        double x[] = new double[n];
        double y[] = new double[n];
        double xy[] = new double[n];
        double a[] = new double[n];
        double b[] = new double[n];

        double sigx = 0.0d, sigy = 0.0d, sigxy = 0.0d, siga = 0.0d, sigb = 0.0d;
        for(i = 0; i < n; i++){
            x[i] = scan.nextDouble();
            sigx = sigx + x[i];
            a[i] = x[i]*x[i];
            siga = siga + a[i];
        }
        for(i = 0; i < n; i++){
            y[i] = scan.nextDouble();
            sigy = sigy + y[i];
            xy[i] = x[i]*y[i];
            sigxy = sigxy + xy[i];
            b[i] = y[i]*y[i];
            sigb = sigb + b[i];
        }
        double res1 = (double) (n*sigxy - sigx*sigy);
        double res2 = (double) Math.sqrt((n*siga - sigx*sigx)*(n*sigb - sigy*sigy));
        System.out.printf("%.3f",res1/res2);
     }
}
