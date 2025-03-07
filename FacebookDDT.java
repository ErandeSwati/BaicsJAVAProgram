package practice;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;




public class FacebookDDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
 {
//step1 :get File location
		FileInputStream s=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumAdvanced\\DDT\\swati.xlsx");

//step2 : open sheet

Workbook w=WorkbookFactory.create(s);

//step3 : go to perticular sheet

//Sheet sh=w.getSheet("login");


	ChromeDriver driver=new ChromeDriver();
	driver.get("https:\\www.facebook.com\\");
	driver.manage().window().maximize();
	WebElement uname=driver.findElement(By.id("email"));
	String un=w.getSheet("login").getRow(0).getCell(0).getStringCellValue();
	uname.sendKeys(un);
	WebElement pass=driver.findElement(By.id("pass"));
	String ps=w.getSheet("login").getRow(0).getCell(1).getStringCellValue();
	pass.sendKeys(ps);
	WebElement login=driver.findElement(By.name("login"));
	login.click();
	try
	{
	Thread.sleep(5000);
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	driver.close();
}
}
