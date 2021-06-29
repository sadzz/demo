package module_5;

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
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sadhana");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("deepak");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Pass");
		Thread.sleep(2000);
		driver.close();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Deepak\\Desktop\\Sadhana_Folders\\Selenium Dependencies\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		Thread.sleep(5000);
		driver1.get("https://en-gb.facebook.com/");
		Thread.sleep(5000);
		driver1.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		Select day=new Select(driver1.findElement(By.xpath("//select[@id='day']")));
		day.selectByIndex(15);
		Thread.sleep(5000);
		Select month=new Select(driver1.findElement(By.xpath("//select[@id='month']")));
		month.selectByVisibleText("Jun");
		Thread.sleep(5000);
		Select yr=new Select(driver1.findElement(By.xpath("//select[@id='year']")));
		yr.selectByVisibleText("2019");
		Thread.sleep(5000);
		driver1.findElement(By.xpath("(//input[@name='sex'])[3]")).click();
		Thread.sleep(5000);
		driver1.findElement(By.xpath("Create New Account(//button[contains(text(),'Sign')])[1]")).click();
		Thread.sleep(5000);
		driver1.close();
	}

}
