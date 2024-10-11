import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSelenium {
    public static void main(String[] args) {
        // Set up ChromeDriver with options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // Run in headless mode

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver(options);
        
        try {
            // Navigate to Google
            driver.get("https://google.com");
            // Print the title of the page
            System.out.println("Title: " + driver.getTitle());
        } finally {
            // Quit the driver
            driver.quit(); // Ensure driver quits to free resources
        }
    }
}
