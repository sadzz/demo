package modulefour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Desktop\\Sadhana_Folders\\Selenium Dependencies\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Pass");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);;
		driver.findElement(By.name("firstname")).sendKeys("sadhana");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("deepak");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Pass");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		Thread.sleep(5000);
		driver.close();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Deepak\\Desktop\\Sadhana_Folders\\Selenium Dependencies\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		Thread.sleep(5000);
		driver1.get("https://en-gb.facebook.com/");
		Thread.sleep(5000);
		driver1.findElement(By.linkText("Create New Account")).click();
		Select day=new Select(driver1.findElement(By.id("day")));
		day.selectByIndex(15);
		Select month=new Select(driver1.findElement(By.id("month")));
		month.selectByValue("Jun");;
		Select yr=new Select(driver1.findElement(By.id("year")));
		yr.selectByVisibleText("2019");
		driver1.close();
		
	}

}
