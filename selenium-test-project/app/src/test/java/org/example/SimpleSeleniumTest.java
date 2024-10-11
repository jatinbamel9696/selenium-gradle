package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleSeleniumTest {

    @Test
    void testGoogleHomePageTitle() {
        // Set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run in headless mode

        WebDriver driver = new ChromeDriver(options);

        try {
            // Navigate to Google
            driver.get("https://www.google.com");

            // Validate the page title
            String pageTitle = driver.getTitle();
            assertEquals("Google", pageTitle, "Title should be 'Google'");
        } finally {
            // Quit the driver to release resources
            driver.quit();
        }
    }
}
