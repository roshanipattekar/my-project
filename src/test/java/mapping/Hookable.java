package mapping;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hookable 
{

	
	@Before
	public void before(Scenario Scenario)
	{
	System.out.println("---------------------Scenario Start--------------------------");
		
	}
	
	@After
	public void after(Scenario Scenario)
	{
		System.out.println("---------------------Scenario finish---------------------");
		
		
	}
	
	
}
