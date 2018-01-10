import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

import java.lang.reflect.Field;
import java.sql.Driver;

/**
 * Created by VD on 12/28/2017.
 */
public class test {

   public static void main(String[] args) {
       // Create webDriver reference
       //WebDriver driver;

       // Launch ChromeDriver
       ChromeDriver driver = new ChromeDriver();
       boolean result;

       // Open the web page
       driver.get("http://www.practiceselenium.com/practice-form.html");
       System.out.println("Successfully opened the website www.practiceselenium.com");
       driver.manage().window().maximize();
       driver.findElement(By.name("firstname")).sendKeys("ahsan");
       driver.findElement(By.name("lastname")).sendKeys("khan");
       //driver.findElement(By.id("sex-0")).isSelected();
       WebElement Sex= driver.findElement(By.id("sex-0"));
       Sex.click();
       WebElement Chai= driver.findElement(By.id("exp-1"));
       Chai.click();
       WebElement checkbox1=driver.findElement(By.id("tea1"));
       checkbox1.click();
       WebElement checkbox2=driver.findElement(By.id("tool-1"));
       checkbox2.click();
       Select continents= new Select(driver.findElement(By.id("continents")));
       continents.selectByIndex(2);
       Select work= new Select(driver.findElement(By.id("selenium_commands")));
       work.selectByIndex(4);
       driver.findElement(By.id("submit")).submit();
       //result= CompareUrl.assertURL(driver, "http://www.practiceselenium.com/welcome.html?firstname=ahsan&lastname=khan&sex=Male&exp=2&BlackTea=Black+Tea&tool=Harmless+Addiction&continents=Asia&selenium_commands=WebElement+Commands");
       //Assert.assertTrue(result);

       //or
       Assert.assertEquals(driver.getCurrentUrl(),"http://www.practiceselenium.com/welcome.html?firstname=ahsan&lastname=khan&sex=Male&exp=2&BlackTea=Black+Tea&tool=Harmless+Addiction&continents=Asia&selenium_commands=WebElement+Commands");






   }
}
