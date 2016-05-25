package class1test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class2 {
	String name,stream;
	int id;
	class2(int a, String b, String c)
	{
		id=a;
		name=b;
		stream=c;
		System.out.println("Id of student:"+id+"\nName:"+name+"\nStream:"+stream);
	}
/*	void output()
	{
		System.out.println("Id of student:"+id+"\nName:"+name+"\nStream:"+stream);
	}
*/
	public static void main(String a[]) throws IOException
{
	System.out.println("Hello! Please enter student details.");
	class2 c1 = new class2(10, "Akki", "CSE");
/*	BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	int c = Integer.parseInt(bfr.readLine());
*/	
	//String d = bfr.readLine();
	class2 c2 = new class2(20, "Pakki", "ECE");
	class2 c3 = new class2(30, "ChAkki", "ME");
/*	c1.output();
	c2.output();
	c3.output();
*/
	}
}
