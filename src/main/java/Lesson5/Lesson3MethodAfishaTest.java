//package Lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Lesson3MethodAfishaTest {
    public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(2));
      driver.get("https://www.afisha.ru/");
      driver.findElement(By.xpath("//input[@placeholder='Событие, актер, место']")).sendKeys("ширли мырли");
      webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[.='Все развлечения Москвы']")));

      driver.findElement(By.xpath("//div[.='Ширли-мырли']")).click();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

      driver.quit();

    }
}

