package spider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class spiderdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{
		      WebDriver driver = new FirefoxDriver();
		    //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
		      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		      //Launch website
		      driver.navigate().to("http://www.shophive.com/apple/mac?p=1");
		      //Maximize the browser
		      driver.manage().window().maximize();
		       driver.findElement(By.xpath(" html/body/div[1]/div/section/div/article/article/div[1]/div/div[2]/div[2]/span")).click();
		       driver.close();

	}

	}

	


