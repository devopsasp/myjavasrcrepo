package calculatorapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class CandidateTest {

	@Test(expected=LengthException.class)
	public void test() throws LengthException {
		Candidate obj=new Candidate();
		obj.getDetails("Sam");
	}

}
