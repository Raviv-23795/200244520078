/*
8) Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". This class should have following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned constructors.
*/

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub1 s1 = new sub1(10);
		s1.setSub1Num1(20);
		s1.setSub1Num2(30);
		System.out.println("Inside s1: base1Num = " + s1.getBase1Num() + ", sub1Num1 = " + s1.getSub1Num1() + ", sub1Num2 = " + s1.getSub1Num2());
		
		sub1 s2 = new sub1(40, 50);
		s2.setSub1Num2(60);
		System.out.println("Inside s2: base1Num = " + s2.getBase1Num() + ", sub1Num1 = " + s2.getSub1Num1() + ", sub1Num2 = " + s2.getSub1Num2());
		
		sub1 s3 = new sub1(70, 80, 90);
		System.out.println("Inside s3: base1Num = " + s3.getBase1Num() + ", sub1Num1 = " + s3.getSub1Num1() + ", sub1Num2 = " + s3.getSub1Num2());
	}

}
