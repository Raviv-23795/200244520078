/*
 * 4)	Show the example of single level inheritance with constructor invocation.
 */
public class Single_level_Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 = new Child();
		c1.setChildnum(10);
		System.out.println("Inside Base, num = " + c1.getBasenum() + ". Inside Child, num = " + c1.getChildnum());
	}

}
