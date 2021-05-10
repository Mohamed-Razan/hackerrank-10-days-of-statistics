// Question: https://www.hackerrank.com/challenges/s10-binomial-distribution-1/problem


import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x, y, a, b, sum = 0, prob;
        int i;
        x = scan.nextDouble();
        y = scan.nextDouble();

        a = x/(x+y);
        b=  y/(x+y);
        
        Solution s1 = new Solution();
        
        for(i = 3; i <= 6; i++) {
            prob = (double)(s1.fact(6)/(s1.fact(i)*s1.fact(6-i))) * Math.pow(a, i) * Math.pow(b, 6-i);
            sum = sum + prob;
        }
        DecimalFormat f = new DecimalFormat("0.000");
        System.out.println(f.format(sum));
    }
    int fact(int a){
        int i, res = 1;
        for(i = 1; i <= a; i++) {
            res = res*i;
        }
        return res;
    }
}
