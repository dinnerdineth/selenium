package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
	public static void main(String[] args) {
		// Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
		
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        
        //Get Address box and start typing
        WebElement addressBox = driver.findElement(By.id("autocomplete"));
        
        addressBox.sendKeys("");
        
        //Google autocomplete not working
        
        
	}

}
