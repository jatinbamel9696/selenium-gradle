import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {  // Class names should start with an uppercase letter
    public static void main(String[] args) {
        // Set Chrome options for headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");

        // Initialize WebDriver with ChromeDriver
        WebDriver driver = new ChromeDriver(options);

        // Navigate to Google
        driver.get("https://google.com");  // Corrected the string formatting
        System.out.println(driver.getTitle());  // Print the title of the page
        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());  // Output the title


        // Quit the driver
        driver.quit();
    }
}
