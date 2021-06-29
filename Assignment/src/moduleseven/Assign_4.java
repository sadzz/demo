package moduleseven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign_4 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Deepak\\Desktop\\Sadhana_Folders\\Selenium Dependencies\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		String str=driver.findElement(By.xpath("//th[text()='Language']/following::*[19]")).getText();
		System.out.println(str);
		Thread.sleep(5000);
		String str1=driver.findElement(By.xpath("//th[text()='Language']/following::*[30]")).getText();
		System.out.println(str1);
		Thread.sleep(5000);
		/*Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(12000);*/
		driver.close();
	}

}
