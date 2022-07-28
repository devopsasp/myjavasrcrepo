package calculatorapp;

public class Candidate {

	String candidateName;
	public String getDetails(String name) throws LengthException
	{
		if(name.length()<4)
		{
			throw new LengthException(4);
		}
		else
		{
			this.candidateName=name;
				
		}
		return "Name validated";
	}

}
