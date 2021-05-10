// Question: https://www.hackerrank.com/challenges/s10-poisson-distribution-1/problem


import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double l, res;
        int i, x;
        l = scan.nextDouble();
        x = scan.nextInt();

        
        Solution s2 = new Solution();
        res = (Math.pow(Math.E, -l)*Math.pow(l, x))/s2.fact(x);
        
//        sum1 = s2.prob(n, 0, a) + s2.prob(n, 1, a) + s2.prob(n, 2, a);
        DecimalFormat f = new DecimalFormat("0.000");
        System.out.println(f.format(res));
//        
//        sum2 = s2.prob(n, 0, a) + s2.prob(n, 1, a);
//        System.out.println(f.format(1-sum2));
    }
    int fact(int a){
        int i, res = 1;
        for(i = 1; i <= a; i++) {
            res = res*i;
        }
        return res;
    }
}
