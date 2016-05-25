package class1test;

public class Class3 {
	int id=1;
	String name;
	void printname()
	{
		System.out.println("Id = "+id+"\nName = "+name);
	}
	void setname(String a)
	{
		name=a;
	}
	String returnname()
	{
		return(name);
	}
	public int getId() {
		id++;
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String a[])
	{
	Class3 c1 = new Class3();
	Class3 c2 = new Class3();
	System.out.println(c1.getId());
	System.out.println(c2.getId());
	
	/*String abc = c1.returnname();
	c1.setname("kuch value");
	String abc2 = c1.returnname();
	System.out.println(abc+"   "+abc2);
	*///c1.printname();
	}
}
