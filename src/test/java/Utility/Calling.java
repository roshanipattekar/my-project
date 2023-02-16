package Utility;

public class Calling 
{

	public static void main (String[]args)
	{
		//browserLaunch
		Object[]input1=new Object[5];
		        input1[0]="webdriver.chrome.driver";	
		        input1[1]="C:\\Automation Support 2\\chromedriver.exe";	
		        SeleniumOperations.browserLaunch(input1);
		    	
	
		Object[]input2=new Object[1];
		        input2[0]="http://primusbank.qedgetech.com/";	
		        SeleniumOperations.openApp (input2);
		    	 	    
	    Object[]input3=new Object[2];     
		        input1[0]= "//*[@id='txtuId']";	
	            input1[1]= "Admin";
	            SeleniumOperations.sendText(input1);
		
	    Object[]input4=new Object[2];       
	             input1[0]= "//*[@name='txtPword'] ";	
	             input1[1]= "Admin";
	             SeleniumOperations.sendText(input1);
	        
	    Object[]input5=new Object[2];    
	             input1[0]= "//*[@id='login']";
	             SeleniumOperations. clickOnElement(input1);
	    }
	
	
}
