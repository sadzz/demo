package module_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Desktop\\Sadhana_Folders\\Selenium Dependencies\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
driver.manage().window().maximize();
Thread.sleep(5000);
driver.switchTo().frame(0);
Thread.sleep(5000);
String test=driver.findElement(By.xpath("//p[contains(text(),'HTML tutorial')]")).getText();
System.out.println(test);
Thread.sleep(5000);
driver.switchTo().defaultContent();
Thread.sleep(5000);
driver.switchTo().frame(1);
driver.findElement(By.xpath("//textarea[@name='browser']")).clear();
Thread.sleep(5000);
driver.findElement(By.xpath("//textarea[@name='browser']")).sendKeys("testing is a great job");
Thread.sleep(5000);
String st=driver.findElement(By.xpath("//textarea[@name='browser']")).getAttribute("value");
System.out.println(st);
Thread.sleep(5000);
driver.switchTo().defaultContent();
Thread.sleep(5000);
driver.switchTo().frame(2);
Thread.sleep(5000);
String st1=driver.findElement(By.xpath("//font[contains(text(),'certain elements')]")).getText();
System.out.println(st1);
driver.close();


	}

}
