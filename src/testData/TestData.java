package testData;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider
	public static Object[][] testdata1(){
		Object[][] t1 = new Object[1][5];
		t1[0][0] = "Chennai (and vicinity), India";
		t1[0][1] = "20/12/2015";
		t1[0][2] = "09:00";		
		t1[0][3] = "11:00";
		t1[0][4] = "29";
		
		/*t1[1][0] = "New Delhi - Downtown";		
		t1[1][1] = "01/11/2015";
		t1[1][2] = "01:00";
		t1[1][3] = "12:00";		
		t1[1][4] = "30";	*/	
		
		
		return t1;
		
	}
	
	/*@DataProvider
	public static Object[][] testdata2(){
		Object[][] t2 = new Object[3][4];
		t2[0][0] = "Selvi";
		t2[0][1] = "Mani";
		t2[0][2] = "selvi843@gmail.com";
		t2[0][3] = "9546743456";
		
		t2[1][0] = "Vinitha";
		t2[1][1] = "Sundar";
		t2[1][2] = "vinitha123@gmail.com";
		t2[1][3] = "9546893456";
		
		t2[2][0] = "Banu";
		t2[2][1] = "Mahesh";
		t2[2][2] = "Banu857@gmail.com";
		t2[2][3] = "9546235456";
		
		return t2;
		
	}*/

}
