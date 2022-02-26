package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DuplicateLead {
    public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		elementLoginButton.click();
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		 WebElement elementLead = driver.findElement(By.linkText("Leads"));
		 elementLead.click();
		 WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		 elementCreateLead.click();
		 WebElement elementcompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		 elementcompanyName.sendKeys("innovative solution");
		 WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		 elementFirstName.sendKeys("Dhivya");
		 WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		 elementLastName.sendKeys("Saravanan");
		 WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		 elementFirstNameLocal.sendKeys("Diya");
		 WebElement elementDepartment = driver.findElement(By.name("departmentName"));
		 elementDepartment.sendKeys("AR");
		 WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		 elementDescription.sendKeys("AR PROCESS");
		 WebElement elementEMailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
		 elementEMailAddress.sendKeys("diyadivz96@gmail.com");
		 WebElement testDropDown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown=new Select(testDropDown);
		dropdown.selectByVisibleText("New York");
        WebElement elementCreateButton = driver.findElement(By.name("submitButton"));
		elementCreateButton.click();
		//GET TITLE
		System.out.println("The titlt is:"+ driver.getTitle());
		if(driver.getTitle().contains("Testleaf"))
		{
		System.out.println("I confirm the Title has testleaf");}
		else
			System.out.println("The title does not have the testleaf");
		
     driver.findElement(By.linkText("Duplicate Lead")).click();

    driver.findElement(By.id("createLeadForm_companyName")).clear();
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Little Flower Matric School");
	   driver.findElement(By.id("createLeadForm_firstName")).clear();
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("shri");
		     driver.findElement(By.linkText("Create Lead")).click();
		     System.out.println("The titlt is:"+ driver.getTitle());
				if(driver.getTitle().contains("Testleaf"))
				{
				System.out.println("I confirm the Title has testleaf");}
				else
					System.out.println("The title does not have the testleaf");

    }

	}


