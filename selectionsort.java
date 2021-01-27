package com.example.Helloworld;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version v1.0
 * @Package com.example.Helloworld
 * @data 2021-01-14 19:57
 */
public class selectionsort {
    void swap(int A[], int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }

    void trace(int A[], int N) {
        for (int i = 0; i < N; i++) {
            if(i>0) System.out.print(" ");
            System.out.print(A[i]);
        }
        System.out.println();
    }
    int select(int A[], int N) {
        int i,j,minj;
        int sw=0;
        for (i = 0; i < N; i++) {
            minj=i;
            for (j = i; j < N; j++) {
                if(A[j]<A[minj]) minj = j;
            }
            swap(A,i,minj);
            if (i!=minj)sw++;
            trace(A,N);
        }
        return sw;
    }

    public static void main(String[] args) {
        int N;
        int A[] = new int[100];
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        selectionsort a1 = new selectionsort();
        int sw=a1.select(A, N);
        System.out.println();
        a1.trace(A,N);
        System.out.println(sw);
    }
}
