package Utility;

import java.net.PasswordAuthentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew 
{   WebDriver driver;
	
	public LoginPageNew (WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(id="user_login")WebElement username;	
	
	@FindBy(how=How.ID,using="user_pass")WebElement passwprd;

	@FindBy(how=How.XPATH,using=".//*[@id='wp=submit']")WebElement submit_button;
	
	@FindBy(how=How.LINK_TEXT,using="Lost your passwrd?")WebElement forgot_password_link;

	private WebElement password;
	
	public void login_wordpress(String uid,String pass)
	
	{
	  username.sendKeys(uid);
	  password.sendKeys(pass);		
	 submit_button.click();
		
	}
	
	
	
	
	
	
	
	
	
	
}
