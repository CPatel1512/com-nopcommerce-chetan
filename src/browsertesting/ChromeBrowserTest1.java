package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest1 {
    //base url
   static String baseUrl = "https://demo.nopcommerce.com/";

    public static void main(String[] args) {

        //1.Setup chrome browser.
        WebDriver driver = new ChromeDriver();
        //2.Open Url in the browser
        //Maximise the browser window
        driver.manage().window().maximize();
        driver.get(baseUrl);
        //3.Get the Title of the page and print the title
        System.out.println(driver.getTitle());
        //4.Print current Url
        System.out.println(driver.getCurrentUrl());
        //5.Print the page source
        System.out.println(driver.getPageSource());
        //6.Navigate to Url
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);
        //7.Print current Url
        System.out.println(driver.getCurrentUrl());
        //8. Navigate back to home page
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        //9.Navigate to login page
        driver.navigate().to(loginUrl);
        //10.Print the current url
        System.out.println(driver.getCurrentUrl());
        //11.Refresh the page
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        //12.Enter Email to Email field
        WebElement emailIdField = driver.findElement(By.id("Email"));
        WebElement emailIdFieldWithName = driver.findElement(By.name("Email"));
        //Action on the element
        emailIdFieldWithName.sendKeys("chetan123@gmail.com");
        // enter Password to password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        WebElement passwordFieldWithName = driver.findElement(By.name("Password"));
        //Action on the Element
        passwordField.sendKeys("Chetan123");
        //Navigate to login button
        WebElement loginButton = driver.findElement(By.linkText("Log in"));
        //Action on the login Button
        loginButton.click();
        //close the browser
       // driver.close();


    }
}
