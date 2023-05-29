package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Scroll2Element {
	public static void main(String[] args) {
		
		//Load website
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/scroll");
		
		//Fill in Name
		WebElement fullName = driver.findElement(By.xpath("//*[@id=\"name\"]"));	
		Actions actions = new Actions(driver);
		actions.moveToElement(fullName);
		fullName.sendKeys("Test Name");
		
		//Fill in date
		WebElement dateBox = driver.findElement(By.xpath("//*[@id=\"date\"]"));
		actions.moveToElement(dateBox);
		dateBox.sendKeys("05/28/2023");
		
		
	}

}
