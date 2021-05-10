// Question: https://www.hackerrank.com/challenges/s10-basic-statistics/problem

import java.io.*;
import java.util.Scanner;


public class Solution{
    public static void main(String[] args){
        int n, i, j, temp, x = 0, count = 0, max, z = 1, y = 0, all = 0;
        Scanner myObj = new Scanner(System.in);
       
        n = myObj.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int sum[] = new int[n];
        
        for(i = 0; i < n; i++){
            sum[i] = 1;
        }
        
        for(i = 0; i < n; i++){
            a[i] = myObj.nextInt();
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
        
        for(i = 0; i < n-1; i++){
            if(a[i] == a[i+1]){
                b[x] = a[i];
                sum[x] = sum[x] + 1;
                count = 1;
            }
            else{
                if(count == 1){
                    x = x + 1;
                }
                count = 0;
            }
        }
        max = sum[0];
        for(i = 1; i < x; i++){
            if(max > sum[i]){
                max = sum[i];
            }
        }
        for(i = 0; i < x; i++){
            if(max == sum[i]){
                y = y + 1;
            }
        }
        for(i = 0; i < n; i++){
            all = all + a[i];
        }
        System.out.println((double) all/n);
        if(n%2 == 1){
            int f = (n-1)/2;
            System.out.println(a[f]);
        }
        else{
            int g = n/2;
            int h = (n-2)/2;
            double d = (a[g] + a[h])/2;
            System.out.println((double) (a[g] + a[h])/2);
        }
        if(max == 1)
            System.out.println(a[0]);
        else if(max > 1){
            for(i = 0; i < x; i++){
                if(max == sum[i]){
                    System.out.println(b[i]);
                    break;
                }
            }
        }
    }
}
