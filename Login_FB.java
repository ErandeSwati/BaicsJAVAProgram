package practice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Login_FB
{
public static void main(String args[])throws InterruptedException
{
ChromeDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");
//driver.navigate().to("https://www.selenium.dev");
driver.manage().window().maximize();
WebElement userId=driver.findElement(By.id("email"));
userId.sendKeys("swati");
Thread.sleep(3000);
WebElement pwd=driver.findElement(By.id("pass"));
pwd.sendKeys("swati");
Thread.sleep(3000);
WebElement click=driver.findElement(By.name("login"));
click.click();
Thread.sleep(3000);
driver.close();
}}