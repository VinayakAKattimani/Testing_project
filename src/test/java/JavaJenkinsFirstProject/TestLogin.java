package JavaJenkinsFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestLogin {
    WebDriver driver =new ChromeDriver();

    @BeforeClass
    public void login(){
        driver.get("https://demo.guru99.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[5]/a")).click();
    }
    @Test
    public void isLoginPageDisplayed(){
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/h2")).isDisplayed());
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
