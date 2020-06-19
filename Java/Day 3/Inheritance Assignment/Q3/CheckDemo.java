
public class CheckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c1 = new Check(10,20,30,40);
		c1.disp();
		//System.out.println(c1.getNum1());		error: since num1 is private and accessible in the same class
		System.out.println(c1.getNum2());
		System.out.println(c1.getNum3());
		System.out.println(c1.getNum4());
	}

}
