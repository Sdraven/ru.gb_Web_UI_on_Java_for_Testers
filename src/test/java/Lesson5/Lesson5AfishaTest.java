package Lesson5;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Lesson5AfishaTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;
    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupBrowser() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        driver.get("https://www.afisha.ru/");
    }
    @Test
    void LookingShirli_Mirlitest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.afisha.ru/");
        driver.findElement(By.xpath("//input[@placeholder='Событие, актер, место']")).sendKeys("ширли мырли");
       // WebDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[.='Все развлечения Москвы']")));

        driver.findElement(By.xpath("//div[.='Ширли-мырли']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Assertions.assertEquals(driver.findElement(By.id("notification-landing-container")).isDisplayed(), true);
    }

    @AfterEach
    void quitBrowser() {
        driver.quit();
    }




}
