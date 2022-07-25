package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//Week2.day2 assignment

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver(); //object created for the browser driver and to open a chrome browser
			driver.manage().window().maximize();
			//1. Launch URL "http://leaftaps.com/opentaps/control/main"
			driver.get("http://leaftaps.com/opentaps/control/main");
			//2. Enter UserName and Password Using Id Locator
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
			//3. Click on Login Button using Class Locator
			driver.findElement(By.className	("decorativeSubmit")).click();
			//4. Click on CRM/SFA Link
			WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
			crm.click();
			//5. Click on Leads Button
			driver.findElement(By.linkText("Create Lead")).click();
			Thread.sleep(2000);
	
/*				 
	
	
	6	Click Leads link
	7	Click Find leads
	8	Click on Phone
	9	Enter phone number
	10	Click find leads button
	11	Capture lead ID of First Resulting lead
	12	Click First Resulting lead
	13	Click Delete
	14	Click Find leads
	15	Enter captured lead ID
	16	Click find leads button
	17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
	18	Close the browser (Do not log out)
*/

		}
	

}
