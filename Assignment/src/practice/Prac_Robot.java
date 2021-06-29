package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac_Robot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Desktop\\Sadhana_Folders\\Selenium Dependencies\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
Thread.sleep(5000);
Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_T);
r.keyRelease(KeyEvent.VK_T);
r.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(5000);
ArrayList<String> s=new ArrayList<String>(driver.getWindowHandles());
System.out.println(s);
Thread.sleep(5000);

driver.switchTo().window(s.get(1));
Thread.sleep(2000);
driver.navigate().to("https://www.facebook.com");
String title=driver.getCurrentUrl();
System.out.println(title);
System.out.println();
driver.close();
	}

}
