package practice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LuanchAZTypeShoe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazonindia.com/");
		driver.manage().window().maximize();
		WebElement type=driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(3000);
		type.sendKeys("shoe");
		Thread.sleep(3000);

		type.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		driver.close();
	}
}
