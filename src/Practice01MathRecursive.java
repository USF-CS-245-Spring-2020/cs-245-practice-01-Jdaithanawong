
public class Practice01MathRecursive implements Practice01Math {

	public int fib(int n) throws Exception{
		if (n < 0) 
		{
			throw new Exception("Number is not positive");
		}
		if(n == 0)
		{
			return 0;
		}
		if(n == 1)
		{
			return 1;
		}
		if(n == 2)
		{
			return 1;
		}
		return fib(n-2) + fib(n-1);
	}
	
	public int fact(int n) throws Exception{
		if (n < 0) 
		{
			throw new Exception("Number is not positive");
		}
		if (n == 0)  
		{
		    return 1;  
		}
		else   
		{
		    return(n * fact(n-1));
		}
	}
}
