package module_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Desktop\\Sadhana_Folders\\Selenium Dependencies\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Click here to show confirm alert')]")).click();
		String str=driver.switchTo().alert().getText();
		System.out.println(str);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		String str1=driver.switchTo().alert().getText();
		System.out.println(str1);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	
		
	}

}
