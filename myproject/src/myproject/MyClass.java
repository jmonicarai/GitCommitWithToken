package myproject;

import java.util.*;
class RemoveDuplicancy
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the array elements:");
int[] a = new int[10];
for(int i=0;i<a.length-1;i++)
{
a[i] =sc.nextInt();
}
int j=0;

 for(int i=0;i<a.length-1;i++)
{
if(a[i]!=a[i+1])
{
a[j]=a[i];
j++;
}
}
a[j]=a[a.length-1];

 System.out.println("The array elements:");
for(int i=0;i<j;i++)
{
System.out.println(a[i]+" ");
}
}
}