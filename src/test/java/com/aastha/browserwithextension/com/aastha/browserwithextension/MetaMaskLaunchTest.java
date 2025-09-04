package com.aastha.browserwithextension.com.aastha.browserwithextension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MetaMaskLaunchTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Path to your Chrome user data directory
        String userDataDir = "/Users/alok/Library/Application Support/Google/Chrome";

        // Configure ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-data-dir=" + userDataDir);
        options.addArguments("--profile-directory=Profile 4"); // 👈 Your profile with MetaMask

        // Launch Chrome
        driver = new ChromeDriver(options);
    }

    @Test
    public void launchWithMetaMask() {
        // Open Chrome Extensions page to verify MetaMask
        driver.get("chrome://extensions/");
        System.out.println("✅ Chrome launched with Profile 4 (MetaMask should be visible).");

        // Optional: Pause for manual check
        try {
            Thread.sleep(10000); // wait 10s so you can visually check MetaMask 🦊
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
//            driver.quit();
        }
    }
}
