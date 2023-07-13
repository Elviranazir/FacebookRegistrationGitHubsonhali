package TestCases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static TestCases.BaseDriver.driver;

public class yaren {
    @Test
    public void test1() {
        driver.get("https://www.facebook.com/");

        WebElement button1 = driver.findElement(By.cssSelector("a[id^='u_0_0_']"));
        button1.click();

        WebElement name = driver.findElement(By.cssSelector("input[id^='u_'][name='firstname']"));
        name.sendKeys("Yaren");

        WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
        lastName.sendKeys("Sanli");

        WebElement eMail = driver.findElement(By.cssSelector("input[name='reg_email__']"));
        eMail.sendKeys("yarensalmann@gmail.com");

        WebElement eMailConfirm = driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
        eMailConfirm.sendKeys("yarensalmann@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("input[autocomplete='new-password']"));
        password.sendKeys("Yaren123.");

        WebElement date = driver.findElement(By.cssSelector("select[aria-label='Month']>option[value='5']"));
        date.click();

        WebElement day = driver.findElement(By.cssSelector("select[aria-label='Day']>option[value='9']"));
        day.click();

        WebElement year = driver.findElement(By.cssSelector("select[id='year']>option[value='2023']"));
        year.click();

        WebElement sex = driver.findElement(By.cssSelector("input[type='radio'][value='1']"));
        sex.click();

        WebElement RegisterButton = driver.findElement(By.cssSelector("button[type='submit'][name='websubmit']"));
    }
}
