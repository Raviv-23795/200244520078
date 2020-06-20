
public class Child extends Parent1 implements Parent2 {
	public Child() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside constructor of Child.");
	}
	public void Parent2Disp() {
		System.out.println("Inside Parent2Disp of Child.");
	}
	int numChild;
	public int getNumChild() {
		return numChild;
	}
	public void setNumChild(int numChild) {
		this.numChild = numChild;
	}
	
}
