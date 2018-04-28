package TRG;




import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;





public class TargetWebPage {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("Webdriver.firefox.marionette", "D:\\FirefoxDriver\\Geckodriver.exe");
		ChromeDriver driver= new ChromeDriver();			
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.target.com/");
		
		driver.manage().window().maximize();
		WebElement id = driver.findElementById("search");
		id.sendKeys("Laptops");
		id.submit();
		
		
	
		
		
		
		
		

	}

	private static void submit() {
		// TODO Auto-generated method stub
		
	}

	private static void click() {
		// TODO Auto-generated method stub
		
	}

}
