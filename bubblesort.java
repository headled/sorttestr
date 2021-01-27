package com.example.Helloworld;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version v1.0
 * @Package com.example.Helloworld
 * @data 2021-01-14 19:19
 */
public class bubblesort {
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
    int bubble(int A[], int N) {
        boolean flag = true;
        int sw=0;
        for (int i = 0; flag; i++) {
            flag = false;
            for (int j = N - 1; j >= i + 1; j--) {
                if (A[j] < A[j - 1]) {
                    swap(A, j, j - 1);
                    flag=true;
                    sw++;
                }
            }
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
        bubblesort a1 = new bubblesort();
        int sw=a1.bubble(A, N);

        System.out.println();
        System.out.println(sw);
    }
}
