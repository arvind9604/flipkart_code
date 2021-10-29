package seleniumwebdriverproject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class aaaaaa {

	
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver","\\D:\\chromedriver_win32 (3)\\chromedriver.exe\\");
		
		WebDriver driver= new ChromeDriver();
		
		//Got to Flipkart site 
		driver.get("https://www.flipkart.com");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9604142220");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("signzy9604");
		
		
		
		driver.findElement(By.xpath("//button[@type='submit']//span[contains(text(),'Login')]")).click();
		
		//Search "watches"
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Watches");
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		
		//Apply filter for the range "Rs 2001
		WebElement min_price= driver.findElement(By.xpath("//div[@class='_1YAKP4']//select[@class='_2YxCDZ']"));
		Select dropdown1 =new Select(min_price);
		dropdown1.selectByVisibleText("₹2000");
		Thread.sleep(5000);
		
		
		//Apply filter for the range "Rs 3000
		WebElement max_price= driver.findElement(By.xpath("//div[@class='_3uDYxP']//select[@class='_2YxCDZ']"));
		Select dropdown2 =new Select(max_price);
		dropdown2.selectByVisibleText("₹3000");
		Thread.sleep(3000);
		
	
		
		//Apply filter Type as digital	
		driver.findElement(By.xpath("//div[contains(text(),'Type')]")).click();

		//Selecting the checkbox containing text as "Digital"
		driver.findElement(By.xpath("//div[@class='_3879cV'][normalize-space()='Digital']")).click();
		
		//Extract the price of the first watch.
		String price=driver.findElement(By.xpath("//div[@data-id='WATDJ5YXHRHZJFRY']//div[@class='_30jeq3']")).getText();
		System.out.println("watch_price is : "+price);
		
		//Extract the brand name of the first watch.
		String brand_name=driver.findElement(By.xpath("//div[@data-id='WATDJ5YXHRHZJFRY']//div[@class='_2WkVRV']")).getText();
		System.out.println("brand name is : "+  brand_name);
		}
	}
 