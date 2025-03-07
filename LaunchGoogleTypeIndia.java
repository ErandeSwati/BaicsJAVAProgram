package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchGoogleTypeIndia {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("India");
		WebElement clickSearch=driver.findElement(By.name("btnK"));
		clickSearch.click();
		Thread.sleep(2000);
		driver.close();
	}
	

}
