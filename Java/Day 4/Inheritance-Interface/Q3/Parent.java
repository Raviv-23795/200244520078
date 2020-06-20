
public class Parent {
	int parentNum;

	public int getParentNum() {
		return parentNum;
	}

	public void setParentNum(int parentNum) {
		this.parentNum = parentNum;
	}

	public Parent(int parentNum) {
		System.out.println("Inside parameterised constructor of Parent.");
		this.parentNum = parentNum;
	}
	
}
