package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 // Navigate to a website
		ChromeDriver driver=new ChromeDriver();

	/*	driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement userId=driver.findElement(By.id("email"));
		userId.sendKeys("swati");
		Thread.sleep(3000);
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("swati");
		Thread.sleep(3000);
		WebElement click=driver.findElement(By.name("login"));
		click.click();
		Thread.sleep(3000);
*/
        //driver.get("https://www.example.com");

        // Now, we use navigate() for more actions

        // Navigate to another website
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);
        
        Thread.sleep(3000);
		WebElement userId=driver.findElement(By.id("email"));
		userId.sendKeys("swati");
		Thread.sleep(3000);
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("swati");
		Thread.sleep(3000);
		WebElement click=driver.findElement(By.name("login"));
		//click.click();
		Thread.sleep(3000);

        // Go back to the previous page
        driver.navigate().back();
        Thread.sleep(5000);

        // Go forward to the next page (if available)
        driver.navigate().forward();
        Thread.sleep(5000);

        // Refresh the current page
        driver.navigate().refresh();
        Thread.sleep(5000);

        // Close the browser after usage
        driver.quit();
    }

	}

