//2)	using switch ….case   display whether character is vowel or not.
public class vowel
{
	public static void main(String[] args)
	{
		char c = 'b';
		switch(c)
		{
		case 'a': System.out.println(c + " is a vowel.");
				  break;
		case 'e': System.out.println(c + " is a vowel.");
				  break;
		case 'i': System.out.println(c + " is a vowel.");
				  break;
		case 'o': System.out.println(c + " is a vowel.");
				  break;
		case 'u': System.out.println(c + " is a vowel.");
				  break;
		case 'A': System.out.println(c + " is a vowel.");
				  break;
		case 'E': System.out.println(c + " is a vowel.");
				  break;
		case 'I': System.out.println(c + " is a vowel.");
				  break;
		case 'O': System.out.println(c + " is a vowel.");
				  break;
		case 'U': System.out.println(c + " is a vowel.");
				  break;
		default: System.out.println(c + " is not a vowel.");
		}
	}
}