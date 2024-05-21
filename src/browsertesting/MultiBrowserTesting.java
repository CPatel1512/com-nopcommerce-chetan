package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTesting {

    static String browser = "Chrome";
    static String baseUrl = "https://demo.nopcommerce.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        //Browser setup

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }
        // Open Url
        driver.get(baseUrl);
        driver.manage().window().maximize();
        //print title of the page
        System.out.println(driver.getTitle());
        //print current page url
        System.out.println(driver.getCurrentUrl());
        //print the page source
        System.out.println(driver.getPageSource());
        //Navigate to url
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);
        //print the current url
        System.out.println(driver.getCurrentUrl());
        //navigate back to home page
        driver.navigate().back();
        //navigate to login page
        driver.navigate().to(loginUrl);
        //print the current url
        System.out.println(driver.getCurrentUrl());
        //Refresh the page
        driver.navigate().refresh();
        //Enter the emailid by id attributes field
        WebElement emailIdField = driver.findElement(By.id("Email"));
        //Enter emailid by name attributes
        WebElement emailIdFieldWithName = driver.findElement(By.name("Email"));
        //Action on the element
        emailIdFieldWithName.sendKeys("chetan123@gmail.com");
        // Enter  filed by Id and Name attributes
        WebElement passwordWithId = driver.findElement(By.id("Password"));
        WebElement passwordWithName = driver.findElement(By.name("Password"));
        //Action on the element
        passwordWithId.sendKeys("Chetan123");
        //Navigate to login button
        WebElement clickLoginButton = driver.findElement(By.linkText("Log in"));
        //Action on the element
        clickLoginButton.click();
        //close the browser
        driver.close();



    }
}
