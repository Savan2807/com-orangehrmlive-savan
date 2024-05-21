package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * BaseUrl = https://opensource-demo.orangehrmlive.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Forgot your password?’ link.
 * 7. Print the current url.
 * 8. Navigate back to the login page.
 * 9. Refresh the page.
 * 10. Enter the email to email field.
 * 11. Enter the password to password field.
 * 12. Click on Login Button.
 * 13. Close the browser.
 */


public class ChromeBrowser {
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";                          //Base Url

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();                                        //Launch chrome browser
        driver.get(baseUrl);                                                          //Open the url into browseer
        driver.manage().window().maximize();                                          //Maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));            //Implict wait
        System.out.println("Title of the page is : " + driver.getTitle());            //Print title
        System.out.println("Current Url is : " + driver.getCurrentUrl());             //Print current Url
        System.out.println("Page source is : " + driver.getPageSource());             //Print page source
        driver.findElement(By.className("orangehrm-login-forgot")).click();           //Click on forgot password link
        System.out.println("Current Url is : " + driver.getCurrentUrl());             //Print current Url
        driver.navigate().back();                                                     //Navigate back to login page
        driver.navigate().refresh();                                                  //Refresh
        driver.findElement(By.name("username")).sendKeys("Admin");         //Write email
        driver.findElement(By.name("password")).sendKeys("admin123");      //Write password
        driver.findElement(By.tagName("button")).click();                             //Click login button
        driver.quit();                                                                //Exit browser

    }
}

