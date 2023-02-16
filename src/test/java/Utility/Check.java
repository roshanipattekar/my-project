package Utility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Check
{
	
	@When("user click on branches")
	public void user_click_on_branches() 
	{
		  Object[]input6=new Object[1];    
	      input6[0]="(//*[@height='24'])[1]";
	      SeleniumOperations. clickOnElement(input6);
	}

	@When("user select \"INDIA\"as country")
	public void user_select_INDIA_as_country( String value) 
	{
		Object[]input4=new Object[2];
	    input7[0]="";	
	    input7[1]=value;	
	    SeleniumOperations.sendText(input7);
	}

	@When("user select \"MAHARASHTRA\"as state")
	public void user_select_MAHARASHTRA_as_state()
	{
	   
	}

	@When("user select \"MUMBAI\"as city")
	public void user_select_MUMBAI_as_city() 
	{
	  
	}

	@When("user click on submit")
	public void user_click_on_submit() 
	{
	   
	}

	@Then("application shows list of branches for mumbai city")
	public void application_shows_list_of_branches_for_mumbai_city() 
	{
	    
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
