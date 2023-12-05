package Module1_Login_Test;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LiblaryFiles.BaseClass;
import LiblaryFiles.UtilityClass;
import Module1_Login.SwagLabHomePage;
import Module1_Login.SwagLabLoginPage;
import Module1_Login.SwagLabMenuPage;



public class SwagLabTestPage extends BaseClass
{
	private static final String TCID = null;
	SwagLabLoginPage Login;
	SwagLabHomePage Home;
	SwagLabMenuPage Menu;
	Sheet Sh;
	
	
//	WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		initializeBrowser();

		
//		FileInputStream file=new FileInputStream("C:\\Users\\HP\\Desktop\\ROHIT\\Automation_Testfile.xlsx");
//	     Sh = WorkbookFactory.create(file).getSheet("Sheet1");
	    
//	    driver=new ChromeDriver();
//	    driver.manage().window().maximize();
//	    
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	   
//	    driver.get("https://www.saucedemo.com/v1/");
//	    
	     initializeBrowser();
	     
		 Login=new SwagLabLoginPage(driver); 
		 Home=new SwagLabHomePage(driver);
	     Menu=new SwagLabMenuPage(driver);
	     
	}
	

	@BeforeMethod
	public void LoginToApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Login.inpSwagLabLoginPageUN(UtilityClass.getDatafromPF("UN"));
		Login.inpSwagLabLoginPageUN(Sh.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		Login.inpSwagLabLoginPagePWD(UtilityClass.getDatafromPF("PWD"));
		Login.inpSwagLabLoginPagePWD(Sh.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		Login.clickSwagLabLoginPageLoginBtn();
		Thread.sleep(3000);
	}
	
	
	
	@Test
	public void VerifyTital() throws EncryptedDocumentException, IOException
	{	
		
		String actTital=Home.getSwagLabHomePageTital();
	    String expTital=UtilityClass.getTD(0, 2);
	 Assert.assertEquals(actTital, expTital, "Failed: both result fail");
	    
		//Home.verifySwagLabHomePageTital(Sh.getRow(0).getCell(2).getStringCellValue());
	}
	
	
	@AfterMethod
	public void LogOutFromApp(ITestResult s1) throws InterruptedException
	{
		if(s1.getStatus()== ITestResult.FAILURE)
		{
			//Code to capture SS
			UtilityClass.captureSS(driver, TCID);
		}
		
		Home.clickSwagLabHomePageMenuBtn();
		Thread.sleep(3000);
		Menu.clickSwagLabMenuPageLogout();
		Thread.sleep(3000);	
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

		        
			    
			    



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
