package project_1_com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {

    static String browser = "Edge";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        // get the current url
        System.out.println("Current URL : " + driver.getCurrentUrl());
        // Get the page source
        System.out.println("Page source : " + driver.getPageSource());
        // find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("prime123@gmail.com");
        // find the password field element
        driver.findElement(By.id("Password"));
        // find the password element
        driver.findElement(By.id("Password")).sendKeys("Prime123");

        // close the browser
        driver.close();

    }
}