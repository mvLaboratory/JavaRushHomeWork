package com.hackerrank.algorithms.sorting;

import java.util.Scanner;

/**
 * Created by admin on 02.11.2015.
 */
public class InsertionSorting1 {
    public static void insertIntoSorted(int[] ar) {
        int v = ar[ar.length - 1];
        for (int i = ar.length -1; i >= 0; i--) {
            if (i == 0) ar[i] = v;
            else if (v < ar[i - 1])
                ar[i] = ar[i - 1];
            else {
                ar[i] = v;
                printArray(ar);
                break;
            }
            printArray(ar);
        }
    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
