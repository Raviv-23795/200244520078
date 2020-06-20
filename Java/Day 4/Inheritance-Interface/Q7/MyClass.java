/*
7) Define class "Parent1" with some data.
Define interface "Parent2" with some data.
Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.
 */
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child1 = new Child();
		child1.setNumChild(10);
		child1.setParent1Num(20);
		System.out.println("NumChild = " + child1.getNumChild() + ", ParentNum = " + child1.getParent1Num());
		child1.Parent2Disp();
	}

}
