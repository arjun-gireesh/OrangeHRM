package BasePckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import PagePckg.Login;

public class Base {
		
		public static WebDriver driver;
		
		public static Login loginobj;
		
		@BeforeTest
		public void setup()
		{
			
			driver = new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
		}
		
		@BeforeMethod
		public void objectmethod()
		{
			loginobj = new Login(driver);
		}
		
}



