package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardMouse {
	public static void main(String[] args) {
		// Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
		
        driver.get("https://formy-project.herokuapp.com/keypress");
        
        //Find text box and enter text
        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        searchBox.click();
        searchBox.sendKeys("Test Input");
        
        //Find button and click
        WebElement button = driver.findElement(By.xpath("//*[@id=\"button\"]"));
        button.click();
        
        driver.quit();
		
	}       
}
