package Utility;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tempt {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Automation Support 2\\chromedriver.exe");
		 //open application
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		
	// username
	
		driver.findElementByXPath("//*[@id='txtuId']").sendKeys("Admin");
		
	//password
		driver.findElementByXPath("//*[@name='txtPword']").sendKeys("Admin");
		
		
	//login 
		driver.findElementByXPath("//*[@id='login']").click();
		
		
	}

}
 