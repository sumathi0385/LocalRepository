package carRental;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import testBase.TestBase;
import testData.TestData;

public class A_Verify_CarCount extends TestBase {
	
	@BeforeSuite
	public void launch_browser() throws IOException{
		initialize();
		launchbrowser();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get(OR.getProperty("App_Url"));
	}
	
	@Test(dataProvider = "testdata1", dataProviderClass = TestData.class)
	public void searchCar(String pickup_place, String pickup_date, String pickup_time, String dropoff_time, String Age) throws InterruptedException, IOException{
		
		
		
		//driver.get("http://www.expedia.co.in");
		//Thread.sleep(3000);
		//System.out.println(OR.getProperty("menu_carRental_xpath"));
		driver.findElement(By.xpath(OR.getProperty("menu_carRental_xpath"))).click();
		driver.findElement(By.xpath(OR.getProperty("textbox_pickingup_xpath"))).sendKeys(pickup_place);
		Thread.sleep(3000);
		//driver.findElement(By.xpath(OR.getProperty("pickup_firstption_xpath"))).click();
		
		driver.findElement(By.xpath(OR.getProperty("textbox_pickupdate_xpath"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("textbox_pickupdate_xpath"))).sendKeys(pickup_date);
		//driver.findElement(By.xpath(OR.getProperty("pickup_date"))).click();
		driver.findElement(By.xpath(OR.getProperty("textbox_pickupdate_xpath"))).sendKeys(Keys.TAB);
		driver.findElement(By.xpath(OR.getProperty("dropdown_pickuptime_xpath"))).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("dropdown_pickuptime_xpath"))).sendKeys(pickup_time);
		driver.findElement(By.xpath(OR.getProperty("dropdown_dropofftime_xpath"))).click();
		driver.findElement(By.xpath(OR.getProperty("dropdown_dropofftime_xpath"))).sendKeys(dropoff_time);
		driver.findElement(By.xpath(OR.getProperty("dropdown_dropofftime_xpath"))).sendKeys(Keys.TAB);
		driver.findElement(By.xpath(OR.getProperty("dropdown_age_xpath"))).click();
		driver.findElement(By.xpath(OR.getProperty("dropdown_age_xpath"))).sendKeys(Age);
		//driver.findElement(By.xpath(OR.getProperty("calendar_droppoffdate_xpath"))).click();
		//driver.findElement(By.xpath(OR.getProperty("dropoff_date"))).click();
		driver.findElement(By.xpath(OR.getProperty("button_search_xpath"))).click();
		System.out.println(driver.getTitle());
		String S1 = driver.findElement(By.xpath("//*[@id='ct_cars_legend']/span")).getText();
		int car_count = Integer.valueOf(S1);
		System.out.println(car_count);
		
		WebElement box = driver.findElement(By.xpath("//*[@id='ct_cars']/div/div[2]"));
	
		List<WebElement> selectbtn = box.findElements(By.tagName("button"));
		int button_count = selectbtn.size();
		System.out.println(button_count);
		if(car_count==button_count){
			System.out.println("car count is matching");
			screenshot();
		}else{
			System.out.println("car count is not matching");
		}
	}
	
	@AfterSuite
	public void quit(){
		driver.quit();
	}

}
