package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage 
{
	// CLASS=1
	
	//STEP 1= DECLARATON 
	
	@FindBy(xpath = "//input[@id='user-name']") private WebElement UN;
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement LoginBtn;
	
	//STEP 2= INITIALIZATION
	
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//STEP 3=USAGE
	
	public void inpSwagLabLoginPageUN(String UserName)
	{
		UN.sendKeys(UserName);
	}
	
	public void inpSwagLabLoginPagePWD(String Password)
	{
		PWD.sendKeys(Password);
	}
	
	public void inpSwagLabLoginPageLoginBtn()
	{
        LoginBtn.click();
	}

	public void clickSwagLabLoginPageLoginBtn() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
