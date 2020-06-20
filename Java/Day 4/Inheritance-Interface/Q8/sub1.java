
public class sub1 extends base1 {
	int sub1Num1, sub1Num2;

	public sub1(int base1Num) {
		super(base1Num);
		System.out.println("Inside non-parameterised constructor of sub1.");
	}

	public sub1(int base1Num, int sub1Num1) {
		super(base1Num);
		System.out.println("Inside one parameter constructor of sub1.");
		this.sub1Num1 = sub1Num1;
	}

	public sub1(int base1Num, int sub1Num1, int sub1Num2) {
		super(base1Num);
		System.out.println("Inside two parameters constructor of sub1.");
		this.sub1Num1 = sub1Num1;
		this.sub1Num2 = sub1Num2;
	}

	public int getSub1Num1() {
		return sub1Num1;
	}

	public void setSub1Num1(int sub1Num1) {
		this.sub1Num1 = sub1Num1;
	}

	public int getSub1Num2() {
		return sub1Num2;
	}

	public void setSub1Num2(int sub1Num2) {
		this.sub1Num2 = sub1Num2;
	}
	
}
