//5)	Using if…….else if….  Else,  display whether result is  fail, pass, second class , first class, Distinction etc.  
public class if_elseif_Else
{
	public static void main(String[] args)
	{
		int marks = 79;
		if (marks >= 75)
			System.out.println("Distinction");
		else if (marks >= 60 && marks < 75)
			System.out.println("First class");
		else if (marks >= 50 && marks < 60)
			System.out.println("Second class");
		else if (marks >= 40 && marks <= 50)
			System.out.println("Pass class");
		else
			System.out.println("Fail");
	}
}