package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class search {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	//driver.get(OR.getProperty("App_Url"));
	driver.get("http://www.expedia.co.in");
	//Thread.sleep(3000);
	//System.out.println(OR.getProperty("menu_carRental_xpath"));
	driver.findElement(By.xpath("//*[@id='primary-header-cars']")).click();
	driver.findElement(By.xpath("//*[@id='car-pickup']")).sendKeys("Chennai (and vicinity), India");
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[@id='aria-option-0']/b")).click();
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='car-pickup-date']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='home-page']/div[16]/div/div/section[2]/ul/li[30]/a")).click();
	//driver.findElement(By.xpath("//*[@id='car-pickup-date']")).sendKeys("30/08/2015");
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='car-pickup-date']")).sendKeys(Keys.TAB);
	driver.findElement(By.xpath("//*[@id='car-pickup-time']")).click();
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='car-pickup-time']")).sendKeys("09:00");
	//Select pickuptime = new Select(driver.findElement(By.xpath("//*[@id='car-pickup-time']")));
	//pickuptime.selectByValue("09:00");
	//pickuptime.selectByIndex(18);
	//driver.findElement(By.xpath("//*[@id='car-dropoff-date']")).click();
	//driver.findElement(By.xpath("//*[@id='home-page']/div[16]/div/div/section[2]/ul/li[30]/a")).click();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[@id='car-dropoff-date']")).sendKeys(Keys.TAB);
	driver.findElement(By.xpath("//*[@id='car-dropoff-time']")).click();
	driver.findElement(By.xpath("//*[@id='car-dropoff-time']")).sendKeys("11:00");
	//Select dropofftime = new Select(driver.findElement(By.xpath("//*[@id='car-dropoff-time']")));
	//dropofftime.selectByValue("12:00");
	driver.findElement(By.xpath("//*[@id='car-dropoff-time']")).sendKeys(Keys.TAB);
	driver.findElement(By.xpath("//*[@id='car-age-of-driver']")).click();
	driver.findElement(By.xpath("//*[@id='car-age-of-driver']")).sendKeys("29");
	//WebElement dropdown = driver.findElement(By.xpath("//*[@id='car-age-of-driver']"));
	
	//Select select = new Select(dropdown);
	//select.selectByVisibleText("30");
	driver.findElement(By.xpath("//*[@id='search-button']")).click();
	/*driver.findElement(By.xpath(OR.getProperty("calendar_pickupdate_xpath"))).click();
	driver.findElement(By.xpath(OR.getProperty("pickup_date"))).click();
	driver.findElement(By.xpath(OR.getProperty("calendar_droppoffdate_xpath"))).click();
	driver.findElement(By.xpath(OR.getProperty("dropoff_date"))).click();
	driver.findElement(By.xpath(OR.getProperty("button_search_xpath"))).click();*/
	System.out.println(driver.getTitle());

	}

}
