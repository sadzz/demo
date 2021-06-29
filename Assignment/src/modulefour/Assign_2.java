package modulefour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Desktop\\Sadhana_Folders\\Selenium Dependencies\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("Pass");
		Thread.sleep(5000);
		driver.findElement(By.name("retypePassword")).sendKeys("Pass");
		Thread.sleep(5000);
		driver.findElement(By.name("firstName")).sendKeys("abc");
		Thread.sleep(5000);
		driver.findElement(By.name("lastName")).sendKeys("efg");
		Thread.sleep(5000);
		driver.findElement(By.name("jobTitle")).sendKeys("SE");
		Thread.sleep(5000);
		driver.findElement(By.name("workPhone")).sendKeys("87654679");
		Thread.sleep(5000);
		driver.findElement(By.name("companyName")).sendKeys("acetech");
		Thread.sleep(5000);
		driver.findElement(By.name("address1")).sendKeys("main street");
		Thread.sleep(5000);
		driver.findElement(By.name("city")).sendKeys("chennai");
		Thread.sleep(5000);
		driver.findElement(By.name("postalCode")).sendKeys("890868");
		Thread.sleep(5000);
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Deepak\\Desktop\\Sadhana_Folders\\Selenium Dependencies\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		Thread.sleep(5000);
		Select cn=new Select(driver1.findElement(By.name("country")));
		cn.selectByVisibleText("India");
		Select st=new Select(driver1.findElement(By.name("state")));
		st.selectByVisibleText("Assam");
		driver.close();
	}

}
