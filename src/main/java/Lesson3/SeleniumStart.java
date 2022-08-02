package Lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class SeleniumStart {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbitk\\OneDrive\\Рабочий стол\\Учебные материалы GEEKBRAINS\\Автоматизация тестирования WEB и UI на Java\\Проект\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}

