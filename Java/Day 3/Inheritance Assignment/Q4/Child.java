
public class Child extends Base{
	int childnum;

	public int getChildnum() {
		return childnum;
	}

	public void setChildnum(int childnum) {
		this.childnum = childnum;
	}

	public Child() {
		super(20);
		System.out.println("Inside non-parameterised constructor of Child class.");
	}
	
}
