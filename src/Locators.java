import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		 
		String driverPath = System.getProperty("user.dir")+"\\src\\Browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		
		//launch Browser
	//	WebDriver driver = new ChromeDriver();
		//
		driver.manage().window().maximize();
		
		//Launch Application
		String expecUrl = "https://www.facebook.com/";
		driver.get("https://www.facebook.com/");
						//or
		//driver.navigate().to("https://www.facebook.com/");
		
		//implicit wait--- > Whole page
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.name("email")).sendKeys("sqabatch0701@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("testing2018");
		driver.findElement(By.id("loginbutton")).click();
		
		
		driver.findElement(By.id("userNavigationLabel")).click();
		
	    Thread.sleep(3000);//1000
		driver.findElement(By.partialLinkText("Log Out")).click();
		
		
		//Current URL of an Application
		/*String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		
		if(actualURL.equals(expecUrl)) {
			System.out.println("Valid URL");
		}else {
			System.out.println("Invalid");
		}
		 
		//Verify Title
		String expTitle = 	"Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		
		String expHeading = "Create an account";
		boolean elm= driver.findElement(By.xpath("//span[text()='Create an account']")).isDisplayed();
		if(elm) {
			String actualAccHeading = driver.findElement(By.xpath("//span[text()='Create an account']")).getText();
			if(actualAccHeading.equalsIgnoreCase(expHeading)) {
				System.out.println("Matched");
			}else {
				System.out.println("Not Matched");
			}
		}*/
		
		/*WebElement elm = driver.findElement(By.id("email"));
		elm.isDisplayed();
		elm.sendKeys("admin@gmail.com");*/
		
		/*boolean elmPresent = driver.findElement(By.id("email")).isDisplayed();
		if(elmPresent) {
			System.out.println("Element Present");
			driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
		}
		
		Thread.sleep(1000);
		  driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
		  
		  driver.findElement(By.id("email")).clear();
		  
		driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
		driver.findElement(By.className("inputtext")).sendKeys("admin@gmail.com");
		driver.findElement(By.tagName("input")).sendKeys("admin@gmail.com");
	 
		int count = driver.findElements(By.tagName("input")).size();
		
		driver.findElements(By.tagName("input")).get(1).sendKeys(arg0);
		
		System.out.println(count);
		
		driver.findElement(By.id("pass")).sendKeys("admin");
		  
		//driver.findElement(By.id("loginbutton")).click();
		
		//driver.findElement(By.id("login_form")).submit();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log In_12      ")).click();
		driver.findElement(By.partialLinkText("Log In")).click();
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		*/
		

	}

}
