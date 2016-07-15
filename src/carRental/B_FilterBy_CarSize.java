package carRental;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.TestBase;

public class B_FilterBy_CarSize extends TestBase {
	
	@Test
	public void carsize() throws InterruptedException, IOException {
				
		initialize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> box = driver.findElements(By.tagName("li"));
		box.get(1).findElement(By.xpath(OR.getProperty("checkbox_carsizeFilter_xpath"))).click();
		String carsize_FilterCount = box.get(1).findElement(By.xpath(OR.getProperty("carsize_FilterCount_xpath"))).getText();
		System.out.println("carsize_FilterCount is: "+carsize_FilterCount);
		Thread.sleep(3000);
		String carsize_Large_ResultCount = driver.findElement(By.xpath(OR.getProperty("carsize_resultcount_xpath"))).getText();
		String split_text = split(carsize_Large_ResultCount);
		if(carsize_FilterCount.contains(split_text)){
			System.out.println("car size filter is matching");
		}else{
			System.out.println("car size filter is not matching");
		}
		
	}

}
