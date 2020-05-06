/*
A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array , then the array would become .

Given an array of  integers and a number, , perform  left rotations on the array. Then print the updated array as a single line of space-separated integers.

Input Format

The first line contains two space-separated integers denoting the respective values of  (the number of integers) and  (the number of left rotations you must perform). 
The second line contains  space-separated integers describing the respective elements of the array's initial state.

Constraints

Output Format

Print a single line of  space-separated integers denoting the final state of the array after performing  left rotations.

Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4
Explanation

When we perform  left rotations, the array undergoes the following sequence of changes:

Thus, we print the array's final state as a single line of space-separated values, which is 5 1 2 3 4.*/



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) 
    {

       Scanner sc=new Scanner(System.in);
       int size= sc.nextInt();
       int rot=sc.nextInt();

       int a[]=new int[size];
       for(int i=0;i<size;i++)
       {
         a[i]=sc.nextInt(); 
       }
       
       int temp=a[0],j=0;
       for(int i=0;i<rot;i++)
       {
         temp=a[0];
         for(j=0;j<size-1;j++)
           a[j]=a[j+1];
        a[j]=temp;
         
       }
       
       for(int i=0;i<size;i++)
       {
       System.out.print(a[i]+" ");
       }
    }
}
