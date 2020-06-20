/*
6) Define interface "A" with "disp1()" method.
Derive from "A", interface "B" with "disp2" method.
Derive class "C" , from "B".
Instantiate class "C" and call its members as well as derived from parent interfaces.
 */
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C();
		c1.disp1();
		c1.disp2();
		c1.disp3();
	}

}
