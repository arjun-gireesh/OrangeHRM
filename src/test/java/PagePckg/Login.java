package PagePckg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
		
		WebDriver driver;
		WebDriverWait wait;
		
		@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input") WebElement username;
		@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input") WebElement password;
		@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button") WebElement loginbtn;
		
		public Login(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		}
		
		public void loginmethod(String un, String pwd) 
		{
			wait.until(ExpectedConditions.visibilityOf(username));
			username.sendKeys(un);
			wait.until(ExpectedConditions.visibilityOf(password));
			password.sendKeys(pwd);
			wait.until(ExpectedConditions.visibilityOf(loginbtn));
			loginbtn.click();
		
		}
}



