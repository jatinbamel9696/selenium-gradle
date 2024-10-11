package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testGoogleHomePageTitle() {
        // Set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");  // Running Chrome in headless mode

        WebDriver driver = new ChromeDriver(options);

        try {
            // Navigate to Google
            driver.get("https://google.com");

            // Validate the page title
            String pageTitle = driver.getTitle();
            assertEquals("Google", pageTitle, "Title should be 'Google'");
            
            // Print the page title (optional)
            System.out.println("Title: " + pageTitle);
        } finally {
            // Quit the driver to release resources
            driver.quit();
        }
    }
}
