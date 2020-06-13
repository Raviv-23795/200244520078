/*
4) Define a class "DemoOb". 
create an instance of it.
now create a reference and assign the reference created in the above statement.
	Discuss what happens?
Now since u have 2 references, take one of the reference and assign a new instance of the class.
	Discuss what happens?
(For ur discussion, write necessary comments in the program)
*/

public class DemoOb
{
	private int a;
	public DemoOb(int a)
	{
		this.a = a;
		System.out.println("Inside the constructor of DemoOb class");
	}
	
	public static void main(String[] args)
	{
		DemoOb obj1 = new DemoOb(10);
		DemoOb obj2 = obj1;
		System.out.println("First Instance, a = " + obj1.a);
		System.out.println("Second reference, a = " + obj2.a);	//When this line is executed, a new reference "obj2" is created at another memory location in the stack which points at the same object "obj1" on heap that was created using the above statement.
		obj2 = new DemoOb(20);	//When this line is executed, the second reference "obj2" which was initially referring to "obj1" will now start referring to a new object of DemoOb that was now create on heap.
		System.out.println("First Instance after new assignment, a = " + obj1.a);
		System.out.println("First reference after new assignment, a = " + obj2.a);
	}
}