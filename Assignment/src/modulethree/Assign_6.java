package modulethree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign_6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver", "C:\\Users\\Deepak\\Desktop\\Sadhana_Folders\\Selenium Dependencies\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(5000);
String URL=driver.getCurrentUrl();
System.out.println(URL);
driver.navigate().to("https://www.selenium.dev/");
//Thread.sleep(5000);
String URL1=driver.getCurrentUrl();
System.out.println(URL1);
driver.navigate().back();
//Thread.sleep(5000);
String URL2=driver.getCurrentUrl();
System.out.println(URL2);
driver.navigate().forward();
Thread.sleep(5000);
String URL3=driver.getCurrentUrl();
System.out.println(URL3);
driver.navigate().refresh();
Thread.sleep(5000);
String URL4=driver.getCurrentUrl();
System.out.println(URL4);
driver.close();



	
	}



}
