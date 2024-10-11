import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {
    public static void main(String[] args) {
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

        // Quit the driver
        driver.quit();
    }
}
