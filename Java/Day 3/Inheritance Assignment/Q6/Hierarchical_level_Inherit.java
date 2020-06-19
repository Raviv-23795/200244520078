/*
 * 6)	Show the example of hierarchical inheritance with constructor invocation.
 */
public class Hierarchical_level_Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1 = new Child1();
		c1.setChild1num(20);
		System.out.println("For c1, basenum = " + c1.getBasenum() + ", Child1num = " + c1.getChild1num());
		
		Child2 c2 = new Child2(30);
		System.out.println("For c2, basenum = " + c2.getBasenum() + ", Child2num = " + c2.getChild2Num());
	}

}
