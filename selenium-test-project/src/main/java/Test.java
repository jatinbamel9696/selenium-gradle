import org.junit.jupiter.api.Test;  // Use JUnit 5's Test
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;  // Optional: For assertions

public class Test {
    @Test  // JUnit 5 annotation
    public void seleniumTest() {
        // Set Chrome options for headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        // Initialize WebDriver with ChromeDriver
        WebDriver driver = new ChromeDriver(options);

        // Navigate to Google
        driver.get("https://google.com");

        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Optional: Validate the title
        assertEquals("Google", driver.getTitle());  // Example assertion

        // Quit the driver
        driver.quit();
    }
}
