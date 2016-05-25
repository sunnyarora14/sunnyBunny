package class1test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class1 {
	int id, name;
	Class1(int a,int b)
	{
		id=a;
		name=b;
	}
	int printName()
	{
	int sum = id+name;
	return (sum);
	}
	public static void main (String a[])throws IOException
	{
		System.out.println("Hu ha ha ha");
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number");
		int c = Integer.parseInt(bfr.readLine());
		System.out.println("Enter second number");
		int d = Integer.parseInt(bfr.readLine());
		Class1 c1=new Class1(c,d);
		int hello=c1.printName();
		System.out.println(hello);
		Class1 c2=new Class1(c+1,d+1);
		System.out.println(c2.printName());
		System.out.println(c1.printName());
		System.out.println(c2.printName());
	}
}