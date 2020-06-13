/*
5) Define 3 classes A , B and C
in all these classes create static and nonstatic variables as well as methods.
	Now Define a class "Demo" ,in which define "main" function. From this main function try to access all the members of A ,B  and C.
*/

class A
{
	private static int staticA = 10;
	private int nonStaticA;
	public static int getStaticA()
	{
		return staticA;
	}
	public void setNonStaticA(int nonStaticA)
	{
		this.nonStaticA = nonStaticA;
	}
	public int getNonStaticA()
	{
		return nonStaticA;
	}
}

class B
{
	private static int staticB = 30;
	private int nonStaticB;
	public static int getStaticB()
	{
		return staticB;
	}
	public void setNonStaticB(int nonStaticB)
	{
		this.nonStaticB = nonStaticB;
	}
	public int getNonStaticB()
	{
		return nonStaticB;
	}
}

class C
{
	private static int staticC = 50;
	private int nonStaticC;
	public static int getStaticC()
	{
		return staticC;
	}
	public void setNonStaticC(int nonStaticC)
	{
		this.nonStaticC = nonStaticC;
	}
	public int getNonStaticC()
	{
		return nonStaticC;
	}
}

public class Demo
{
	public static void main(String[] args)
	{
		A aObj =  new A();
		aObj.setNonStaticA(20);
		System.out.println("staticA = " + A.getStaticA() + ", nonStaticA = " + aObj.getNonStaticA());
		
		B bObj =  new B();
		bObj.setNonStaticB(40);
		System.out.println("staticB = " + B.getStaticB() + ", nonStaticB = " + bObj.getNonStaticB());
		
		C cObj =  new C();
		cObj.setNonStaticC(60);
		System.out.println("staticC = " + C.getStaticC() + ", nonStaticC = " + cObj.getNonStaticC());
	};
}