package testsuite;


import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl="https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp()
    {
        openBrowser(baseUrl);
    }
    @Test
    public void verifyUserShouldNavigateToForgotPasswordPageSuccessfully()
    {
        // Click on 'Forgot your password' link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        //Verify the text 'Reset Password'
        WebElement getMessage=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']"));
        String expectedMessage="Reset Password";
        String actualMessage=getMessage.getText();
        Assert.assertEquals("Reset password Message fail to Display",expectedMessage,actualMessage);
    }
    public void tearDown()
    {
        // Close the browser
        driver.quit();
    }
}

