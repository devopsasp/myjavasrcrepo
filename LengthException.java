package calculatorapp;

public class LengthException extends Exception{
	int length;
	public LengthException(int length)
	{
		
		super("length "+length +" less then required ");
	  this.length=length;
	}
	public String toString()
	{
		return "Length "+length +" less then required ";
				
	}

}
