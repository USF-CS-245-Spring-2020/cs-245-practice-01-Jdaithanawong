
public class Practice01MathIterative implements Practice01Math {
	public int fib(int n) throws Exception{
		if (n < 0) 
		{
			throw new Exception("Number is not positive");
		}
		int current = 0;
		int previous = 1;
		
		for(int i=1; i <= n; i++) 
		{
			int placeholder = current;
			current+= previous;
			previous = placeholder;
		}
		return current;

	}
	
	public int fact(int n) throws Exception{
		if (n < 0) 
		{
			throw new Exception("Number is not positive");
		}
		int result = 1;
		
		for(int i = 1; i <= n; i++)
		{
			result = result * i;
		}
		return result;
	}
}
