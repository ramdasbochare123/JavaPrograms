package module1;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayprint1 
{
	public static void main(String[] args) 
	{
				Scanner s1=new Scanner(System.in);
		System.out.println("Please enter size of array");
				int size = s1.nextInt();
				String []a=new String [size]; //array declaration
				System.out.println("Please enter elements of array");
				for(int i=0; i<size;i++)
				{
					a[i]=s1.next();
				}
				s1.close();
				System.out.println("Array a= "+Arrays.toString(a));
	}
}
