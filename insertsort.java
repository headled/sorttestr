package com.example.Helloworld;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version v1.0
 * @Package com.company
 * @data 2021-01-14 18:51
 */
public class insertsort {
    void trace(int A[],int N){
        int i;
        for (i = 0; i < N; i++) {
            if (i>0) System.out.print(" ");
            System.out.print(A[i]);
        }
        System.out.println();
    }

    void insert(int A[], int N) {
        int i,j,v;
        for (i = 1; i < N; i++) {
            v=A[i];
            j = i - 1;
            while (j >= 0 && A[j] > v) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = v;
            trace(A, N);
        }
    }

    public static void main(String[] args) {
        int N;
        int A[] = new int[100];
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        insertsort a1 = new insertsort();
        a1.trace(A, N);
        a1.insert(A, N);
    }
}
