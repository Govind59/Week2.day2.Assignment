package week2.day2;


import java.awt.Window;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	
		
		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws Exception {
			
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(); //object created for the browser driver and to open a chrome browser
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
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
		//7. Enter CompanyName Field Using id Locator
		WebElement Cname=driver.findElement(By.id("createLeadForm_companyName"));
		Cname.sendKeys("Prophoenix");
		//8. Enter FirstName Field Using id Locator
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Govind");
		//9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KG");
		//10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Govindasamy");
		//11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		//12. Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing department");
		//13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nkgovikarur@gmail.com");
		//14. Select State/Province as NewYork Using Visible Text
		WebElement source = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(source);		
		//Thread.sleep(3000);
		state.selectByVisibleText("New York");
		//15. Click on Create Button
		WebElement createButton=driver.findElement(By.name("submitButton"));
		createButton.click();
		System.out.println("Executed1");
		//((JavascriptExecutor)driver).executeScript("document.title = 'Test [" + testName + "]'");
        //17. Click on Duplicate button
		driver.findElement(By.xpath("//a[normalize-space(.)='Duplicate Lead']")).click();
		System.out.println("Executed2");
		Thread.sleep(3000);
        //18. Clear the CompanyName Field using .clear() And Enter new CompanyName
		driver.findElement(By.name("companyName")).clear();
		Cname.sendKeys("TCS");
        //19.Clear the FirstName Field using .clear() And Enter new FirstName
		firstName.clear();
		firstName.sendKeys("Govindasamy");
        //20.Click on Create Lead Button
		//((JavascriptExecutor)driver).executeScript(
		driver.findElement(By.name("submitButton")).click();
		//driver.findElement(By.xpath("(//a[normalize-space(.)=\"Create Lead\"])")).click();
        //21. Get the Title of Resulting Page(refer the video)  using driver.getTitle()
		System.out.println(driver.getTitle());
		
	}

	}
