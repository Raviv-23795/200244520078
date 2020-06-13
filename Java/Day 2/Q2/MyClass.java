/*
2) Define a class "MyClass" and make sure clients can instantiate it , 
a) without any argument
b) with one int argument
c) with two int arguments
*/

public class MyClass
{
	private int a, b;
	public MyClass()
	{
		System.out.println("Inside default constructor of MyClass");
	}
	public MyClass(int a)
	{
		this.a = a;
		System.out.println("Inside parameterised constructor of MyClass with 1 argument");
	}
	public MyClass(int a, int b)
	{
		this.a = a;
		this.b = b;
		System.out.println("Inside parameterised constructor of MyClass with 2 arguments");
	}
	void setA(int a)
	{
		this.a = a;
	}
	void setB(int b)
	{
		this.b = b;
	}
	int getA()
	{
		return a;
	}
	int getB()
	{
		return b;
	}
	
	public static void main(String[] args)
	{
		MyClass obj1 = new MyClass();
		obj1.a = 10;
		obj1.b = 20;
		System.out.println("First instance, a = " + obj1.getA() + " and b = " + obj1.getB());
		MyClass obj2 = new MyClass(30);
		obj2.b = 40;
		System.out.println("Second instance, a = " + obj2.getA() + " and b = " + obj2.getB());
		MyClass obj3 = new MyClass(50,60);
		System.out.println("Third instance, a = " + obj3.getA() + " and b = " + obj3.getB());
	}
}