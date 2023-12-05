package LiblaryFiles;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;


public class UtilityClass 
{
	//Author Name: Shweta
	//This method is use to get Test Data from Excel Sheet 
	//Need to pass 2 inputs: 1=rowIndex, 2=colIndex
	
	
	public static String getTD(int rowIndex,int colIndex) throws EncryptedDocumentException, IOException
	{
		//FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium\\TestData\\Automation_Sheet.xlsx");
		FileInputStream file=new FileInputStream((System.getProperty("user.dir")+"\\Automation_Sheet.xlsx"));

	    Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet1");
	    
	  
	 	String value =Sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
	
		return value;	
	}
	//To capture the ss of failed TC

	public static void captureSS(WebDriver driver, String tcid) {
		// TODO Auto-generated method stub
		
	}
	
//	public static void capturess(WebDriver driver, int TCID)
//	{
//	File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	File dest=new File("C\:\Users\\HP\\eclipse-workspace\Selenium\FailedTCID\\TestCaseID" +TCID+ ".jpg");
//	    FileHandler.copy(src, dest);
//	    
//	}
	
	public static String getDatafromPF1(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium\\PropertyFile.properties");
		Properties p=new Properties();
		p.load(file);
		
		String value = p.getProperty(key);
		
		return value;
		
	}

	public static String getDatafromPF(String key) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
