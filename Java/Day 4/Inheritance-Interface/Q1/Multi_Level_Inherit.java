/*
 * 1) Create a multi-level inheritance , instantiate the child class and observe constructor invocation.
 * Also show, if needed how will u invoke parent class constructor from child class ?
 */
public class Multi_Level_Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 obj = new Child2();
		obj.setBasenum(10);
		obj.setChil1Num(20);
		obj.setChild2Num(30);
		System.out.println("Inside Base, num = " + obj.getBasenum() + ". Inside Child1, num = " + obj.getChil1Num() + ". Inside Child2, num = " + obj.getChild2Num());
	}

}
