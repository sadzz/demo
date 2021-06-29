package modulefour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Desktop\\Sadhana_Folders\\Selenium Dependencies\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);;
		driver.findElement(By.name("firstname")).sendKeys("sadhana");
		Thread.sleep(2000);
driver.findElement(By.name("firstname")).clear();
Thread.sleep(2000);;
driver.findElement(By.name("firstname")).sendKeys("deepak");
Thread.sleep(2000);
String str=driver.findElement(By.name("firstname")).getAttribute("value");
//String str=driver.findElement(By.name("firstname")).getText();
System.out.println(str);
driver.close();

	}

}
