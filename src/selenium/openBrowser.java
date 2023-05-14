package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.time.Duration;

import org.openqa.selenium.By;

public class openBrowser  {
    public static void main(String[] args) {

        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Load Google
        driver.get("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Search and submit 
        element.sendKeys("Search");
        element.submit();
        
        
        //Close the browser
        driver.quit();
    }
}


