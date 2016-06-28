package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by junxu6 on 2016/6/28.
 */
public class Selenuim2Example {

    public static final String url = "https://www.baidu.com";

    public void simpleTest() {
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        WebElement element = driver.findElement(By.className("q"));
        element.sendKeys("nike");
        element.submit();
        System.out.println("Page title is:" + driver.getTitle());
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("nike");
            }
        });

        System.out.println("Page title is:" + driver.getTitle());
        driver.close();
    }
}
