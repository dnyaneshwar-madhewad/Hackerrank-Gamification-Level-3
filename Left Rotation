
Left Rotation
Problem

A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. Given an integer, , rotate the array that many steps left and return the result.

Example


After  rotations, .

Function Description

Complete the rotateLeft function in the editor below.

rotateLeft has the following parameters:

int d: the amount to rotate by
int arr[n]: the array to rotate
Returns

int[n]: the rotated array
Input Format

The first line contains two space-separated integers that denote , the number of integers, and , the number of left rotations to perform.
The second line contains  space-separated integers that describe .

Constraints

Sample Input
5 4
1 2 3 4 5


Sample Output
5 1 2 3 4



Program:

---------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int n = scan.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; ++i) {
            A[i] = scan.nextInt();
        }
        for (int i=0; i<n; ++i) {
            rotateArray(A);
        }
        for (int a : A) {
            System.out.print(a+" ");
        }
        System.out.println("");
    }
    
    private static void rotateArray(int[] A) {
        int t = A[0];
        for (int i=0; i<A.length-1; ++i) {
            A[i] = A[i+1];
        }
        A[A.length-1] = t;
    }
}

----------------------------------------------------------------------------------------

OUTPUT:

Congratulations, you passed the sample test case.
Click the Submit Code button to run your code against all the test cases.

Input (stdin)
5 4
1 2 3 4 5

Your Output (stdout)
5 1 2 3 4 

Expected Output
5 1 2 3 4
