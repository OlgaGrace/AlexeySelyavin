import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstClass  {
  private EventFiringWebDriver driver;

  public static class MyListener extends AbstractWebDriverEventListener{

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
      super.beforeFindBy(by, element, driver);
      System.out.println(by);
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
      super.afterFindBy(by, element, driver);
        System.out.println(by +  " found");
    }

      @Override
      public void onException(Throwable throwable, WebDriver driver) {
          System.out.println(throwable);
      }
  }



  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new EventFiringWebDriver(new ChromeDriver())  ;
    driver.register(new MyListener());

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void searchWebDriverInChrome() throws Exception {
    driver.get("https://www.google.com/");
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("webd");
    driver.findElement(By.id("lst-ib")).sendKeys(Keys.DOWN);
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib_1000")).sendKeys("webdriver torso");
    driver.findElement(By.id("lst-ib")).sendKeys(Keys.DOWN);
    driver.findElement(By.id("lst-ib")).sendKeys(Keys.DOWN);
    driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
