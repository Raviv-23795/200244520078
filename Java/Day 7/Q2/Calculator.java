public class Calculator{
	public int caldouble(int num) throws Exception{
		if (num > 0)
			return num*2;
		else
		{
			if(num  == 0)
				throw new MyArithException("Zero not allowed");
			else
				throw new MyArithException("Negative not allowed");
		}
	}
}