import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSelenium {
    
    @Test
    public void testGoogleHomePage() {
        System.out.println("Starting the Google homepage test...");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        WebDriver driver = new ChromeDriver(options);
        
        System.out.println("Navigating to Google homepage...");
        driver.get("https://www.google.com");

        // Print current title of the page
        System.out.println("Current page title: " + driver.getTitle());
        
        // Validate the title
        assertEquals("Google", driver.getTitle());
        System.out.println("Title verification successful!");

        driver.quit();
        System.out.println("Test completed and browser closed.");
    }
}
