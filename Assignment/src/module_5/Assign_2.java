package module_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Desktop\\Sadhana_Folders\\Selenium Dependencies\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Pass");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		Thread.sleep(5000);
		driver.close();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Deepak\\Desktop\\Sadhana_Folders\\Selenium Dependencies\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		Thread.sleep(5000);
		driver1.get("https://en-gb.facebook.com/");
		Thread.sleep(5000);
		driver1.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@id='passContainer']")).sendKeys("Pass");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//button[@id='loginbutton']")).click();
		Thread.sleep(5000);
		driver1.close();
		
	}

}
