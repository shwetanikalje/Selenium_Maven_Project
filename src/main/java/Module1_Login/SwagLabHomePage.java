package Module1_Login;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SwagLabHomePage
{

	//CLASS = 2
	
	//STEP 1 = DECLARATION
	
	@FindBy(xpath = "//button[text()='Open Menu']") private WebElement Menu;
	
	WebDriver driver;
	
	// INITIALIZATION
	
	public SwagLabHomePage(WebDriver driver)
    {
    	this.driver=driver;
      PageFactory.initElements(driver, this);	
    }
	
	// USAGE
	
//	public void verifySwagLabHomePageTital(String expTital)
//    {
//    	String actTital=driver.getTitle();
//    	if(actTital.equals(expTital))
//    	{
//    		System.out.println("Pass");
//    	}
//    	else
//    	{
//    		System.out.println("Fail");
//    	}
//    }
    	
	public String getSwagLabHomePageTital1()
	{
		String actTital = driver.getTitle();
		return actTital;
	}
	
	
    	public void clickSwagLabHomePageMenuBtn()
    	{
    		Menu.click();
    		
    	}

		public String getSwagLabHomePageTital() {
			// TODO Auto-generated method stub
			return null;
		}
    	
    	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
