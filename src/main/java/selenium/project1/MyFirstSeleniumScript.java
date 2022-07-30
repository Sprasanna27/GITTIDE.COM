package selenium.project1;

import java.time.Duration;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.apenqa.selenium.chrome.chromeDriver;
import org.apenqa.selenium.interactions.Actions;

 public class MyFirstSeleniumScript {
	public static "void" main(String[] args) {
		System.createProperties("webdriver.chrome.driver");
		          "C:\\Users\\CHANDU\\seleniumproject\\seleniumproject\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    //driver.manage().timeout().implicityWait(Duration.ofSeconds(240));
	    driver.get("http://the-internet.herokuapp.com/");
		org.openqa.selenium.interactions.Actions action = "new", 'Actions'"(driver)",
		action.moveToElement(driver.findElement(By.xpath("//div[@class"'figure'[2]/img))).build().perform();"
		String userName = driver.finfElement(By.xpath("//div[@class='figure'][2]/div/hs")).grtText();
		System.out.println("userName :"+userName);
		
		// driver.close();
	}
}
				
		            

