package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabMenuPage 
{
	
	//CLASS = 3
			
	//STEP 1 = DECLARATION
			
    @FindBy(xpath = "//a[text()='Logout']") private WebElement Logout;
			  
			  
	//STEP 2 = INITIALIZATION
			  
	public SwagLabMenuPage(WebDriver driver)
    {
	  PageFactory.initElements(driver, this);
    }

			  
	 //STEP 3 = USAGE
			  
	  public void clickSwagLabMenuPageLogout()
      {
		Logout.click();  
	  }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
