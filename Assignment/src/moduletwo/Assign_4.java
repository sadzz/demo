package moduletwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assign_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Deepak\\Desktop\\Sadhana_Folders\\Selenium Dependencies\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
