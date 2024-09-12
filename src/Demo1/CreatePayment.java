package Demo1;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreatePayment {
	WebDriver driver = null;
	Objects objects = null;
	
	    CreatePayment() {	  
		System.setProperty("webdriver.driver.chrome", "Lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		this.driver =driver;	
		this.objects = new Objects(driver);
	}	
 public void waitTime(int value , WebElement element) {
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(value));
	 wait.until(ExpectedConditions.visibilityOf(element));
}
  public void login(WebDriver driver , Objects objects) throws InterruptedException {
	  driver.get("https://santandereecert.olbanking.com/gateway/auth");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  objects.Company.sendKeys("VEGANCO");
	  objects.UserName.sendKeys("helpuser7");
	  Thread.sleep(1000);
	  objects.Password.sendKeys("Password@007");	 
	  objects.SignIn.click();
	
	  waitTime(10, objects.TreasuryLink);
	  objects.TreasuryLink.click();
	  Thread.sleep(7000);
	 
	  Object[] windowHandles=driver.getWindowHandles().toArray();
	  driver.switchTo().window((String) windowHandles[1]);
	   
	  waitTime(15, objects.Dashboard);
}
  
	
	public static void main(String[] args) {
		try {
			CreatePayment start = new CreatePayment();		
			start.login(start.driver,start.objects);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
