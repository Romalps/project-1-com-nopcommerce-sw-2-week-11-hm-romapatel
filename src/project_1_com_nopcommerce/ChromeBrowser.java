package project_1_com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
Project-1 - Project Name: com-nopcommerce
        BaseUrl =
        https://demo.nopcommerce.com/login?returnUrl=%2F
1. Setup Chrome browser
2. Open URL
3. Print the title of the page
4. Print the current url
5. Print the page source
6. Enter the email to email field
7. Enter the password to password field
8. Close the browser
 */
public class ChromeBrowser {

    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        // launch the Chrome Browser
        WebDriver driver = new ChromeDriver();// create the reference variable
        driver.get(baseUrl);// Open the URL into the browser

        driver.manage().window().maximize();// maximize the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// give implicit wait to driver
        // Get and Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // Get and Print the current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());
        // Get page source
        System.out.println("Page source : " + driver.getPageSource());
        // Find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("prime123@gmail.com");
        // find the password field element
        driver.findElement(By.id("Password")).sendKeys("Prime123");

        // close the browser
        driver.close();


    }
}
