package modulethree;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign_3 {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Deepak\\Desktop\\Sadhana_Folders\\Selenium Dependencies\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://netbanking.hdfcbank.com/netbanking/");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			String title=driver.getTitle();
			System.out.println(title);
			driver.switchTo().frame(0);
			driver.findElement(By.linkText("Know More")).click();
			ArrayList<String> win=new ArrayList<String>(driver.getWindowHandles());
			System.out.println(win);
			Thread.sleep(5000);
			driver.switchTo().window(win.get(1));
			String title1=driver.getTitle();
			System.out.println(title1);
			driver.switchTo().window(win.get(0));
			String title2=driver.getTitle();
			System.out.println(title2);
			driver.quit();

	}

}
