package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest
{
    String baseUrl="https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp()
    {
        openBrowser(baseUrl);
    }
    @Test
    public void verifyUserShouldLoginSuccessfullyWithValidCredentials()
    {
        // Enter Username in Username field
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        // Enter the password in password field
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
        //Click on Login Button
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        // Verify the 'Dashboard' text is display
        String expectedText="Dashboard";
        String actualText=driver.findElement(By.xpath("//h6")).getText();
        Assert.assertEquals(expectedText,actualText);

    }
}
