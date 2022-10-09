# week2assignement
package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		//2.(a) Enter value to UserName field "username = "demosalesManager""
		WebElement userNameTextBox = driver.findElement(By.id("username"));
		userNameTextBox.sendKeys("demosalesManager");
		//Thread.sleep(3000);

		//2. (b) Enter value to PassWord field "password = "crmsfa""
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		passwordTextBox.sendKeys("crmsfa");
		//Thread.sleep(3000);

		//3. Click on loginButton
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		//Thread.sleep(3000);

		//4. Click on CRM/SFA link
		WebElement linkText = driver.findElement(By.linkText("CRM/SFA"));
		linkText.click();
		//Thread.sleep(3000);

		//5. Click on leadsButton		
		WebElement leadsButton = driver.findElement(By.linkText("Leads"));
		leadsButton.click();
		//Thread.sleep(3000);

		//6. Click on Create Lead link
		WebElement createLeadLink = driver.findElement(By.linkText("Create Lead"));
		createLeadLink.click();

		//7. Enter CompanyName Field Using id Locator
		WebElement companyNameField = driver.findElement(By.id("createLeadForm_companyName"));
		companyNameField.sendKeys("Testleaf");
		//Thread.sleep(3000);

		//8. Enter FirstName Field Using id Locator
		WebElement firstNameField = driver.findElement(By.id("createLeadForm_firstName"));
		firstNameField.sendKeys("Saranya");
		//Thread.sleep(3000);

		//9. Enter LastName Field Using id Locator
		WebElement lastNameField = driver.findElement(By.id("createLeadForm_lastName"));
		lastNameField.sendKeys("K");
		//Thread.sleep(3000);

		//10. Enter FirstName(Local) Field Using id Locator
		WebElement firstNameLocalField = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocalField.sendKeys("Saranya");
		//Thread.sleep(3000);

		//11. Enter Department Field Using any Locator of Your Choice
		WebElement departmentField = driver.findElement(By.name("departmentName"));
		departmentField.sendKeys("Software Testing");
		//Thread.sleep(3000);

		//12. Enter Description Field Using any Locator of your choice 
		WebElement descriptionField = driver.findElement(By.id("createLeadForm_description"));
		descriptionField.sendKeys("Selenium Automation Testing Practice");
		//Thread.sleep(3000);

		//13. Enter your email in the E-mail address Field using the locator of your choice
		WebElement emailIdField = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailIdField.sendKeys("Saranya.ceg@gmail.com");
		//Thread.sleep(3000);

		//14. Click on Create Button
		WebElement clickCreateLeadButton = driver.findElement(By.name("submitButton"));
		clickCreateLeadButton.click();
		//Thread.sleep(3000);

		//15. Get the Title of Resulting Page.
		String title = driver.getTitle();
		System.out.println("Title of the webpage is "+title);


	}

}
