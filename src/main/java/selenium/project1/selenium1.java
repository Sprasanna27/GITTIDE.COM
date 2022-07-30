package selenium.project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {
	


  private Object system;
  
  public static void main(string[] args) throws InterruptedException {
	  // TOOO Auto-generated method stub
	  
	  System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.google.com/");
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://tide.com/en-us");
	  
	  driver.findElement(By.xpath("//[@id=\"site-header\"]/div[1]/div/div/div/div[1]/div/a[2]/picture/img")).click();
	  
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//[@id=\"global-navigation-header\"]/ul/li[1]/div/label1/span")).click();
	  
	  driver.get("https://tide.com/en-us");
	  
	  driver.manage().window().maximize();
	 
	  driver.findElement(By.xpath("//*[@id=\"global-navigation-header\"]/ul/li[1]/div/label/span")).click();
	  
	  driver.manage().window().maximize();
  
  }
  }
	  
	  
	  
	  
	  
	  
 
  
		            


