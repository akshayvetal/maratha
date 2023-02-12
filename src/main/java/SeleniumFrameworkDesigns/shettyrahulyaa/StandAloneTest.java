package SeleniumFrameworkDesigns.shettyrahulyaa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/client/auth/login");   //StringUrl means --""
		
	/*	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("akshayvetal591@gmail.com");
	driver.findElement(By.id("//input[@id='userPassword']")).sendKeys("AkshayVetal591@");
     driver.findElement(By.cssSelector("#login")).click();
	List<WebElement>AllProducts = driver.findElements(By.cssSelector(".btn.w-10.rounded"));
	
	//how to click particular product from all the list;
	
	for(WebElement products :AllProducts)
	{
		
		if(products.getText().equalsIgnoreCase("zara coat 3")) {
			
			products.click();
		}
	}*/
	}

}
