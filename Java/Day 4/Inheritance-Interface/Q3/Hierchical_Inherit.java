/*
 * 3) Go for Hierarchical inheritance, create instances of child class and observe constructor invocation.
 */
public class Hierchical_Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1 = new Child1(10, 20);
		System.out.println("Inside c1's Parent, num = " + c1.getParentNum() + " and Child's num = " + c1.getChild1Num());
		
		Child2 c2 = new Child2(30, 40);
		System.out.println("Inside c1's Parent, num = " + c2.getParentNum() + " and Child's num = " + c2.getChild2Num());
	}

}
