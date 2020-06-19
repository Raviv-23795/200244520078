/*
 * 1)	Define 2 classes “First” and “Second” with member variables, member functions and constructors of your choice. Now define a class “Two” in which define main function. In main function create various instances of First and Second and call their individual member functions.
 */
public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First f1 = new First(10);
		Second s2 = new Second(20);
		
		System.out.println("Inside First, num = "+ f1.getNum() + ". Inside Second, num = " + s2.getNum());
	}

}
