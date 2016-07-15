package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static Properties OR;
	//public static FileInputStream ip=null;
	public static WebDriver driver=null;
	public static String carsize_count_top;
	
public void initialize() throws IOException{
	OR = new Properties();
	FileInputStream ip = new FileInputStream("D:\\QAG\\QAG Activities _2015\\Project\\Expedia.co.in\\src\\ObjectRepository\\OR.properties");
	OR.load(ip);
	//System.out.println(OR.getProperty("menu_carRental_xpath"));
	
	
}
public void launchbrowser(){
	driver = new FirefoxDriver();
}
public String split(String str){
	//String str;
	  String[] temp;
	 
	  /* delimiter */
	  String delimiter = " ";
	  /* given string will be split by the argument delimiter provided. */
	  temp = str.split(delimiter);
	  /* print substrings */
	  carsize_count_top = temp[1];
	  for(int i =0; i < temp.length ; i++)
	    System.out.println(temp[i]);
	
	return carsize_count_top;
}
public void screenshot() throws IOException{
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new File("result.jpeg")); 
}

}
