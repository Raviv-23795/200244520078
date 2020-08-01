import java.util.*;
public class MyCalcApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		Calculator c = new Calculator();
		try{
			System.out.println("Double of " + num + " is: " + c.caldouble(num));
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}