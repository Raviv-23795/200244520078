/*
 * 5)	Show the example of multi-level inheritance with constructor invocation.
 */
public class Multi_level_Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c1 = new Child2();
		c1.setNum2(30);
		System.out.println("Inside Base, num = " + c1.getNum() + ". Inside Child1, num = " + c1.getNum1() + ". Inside Child2, num = " + c1.getNum2());
	}

}
