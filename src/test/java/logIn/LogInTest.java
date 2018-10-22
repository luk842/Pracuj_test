package logIn;

import data.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.assertTrue;

public class LogInTest {

    private Random random;
    private WebDriver driver;

    @BeforeTest
    public void prepareTests() {
        System.setProperty(
                "webdriver.chrome.driver",
                "webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        random = new Random();
    }

    @Test
    public void logInTest() {

        //GIVEN
        String baseURL = "https://www.pracuj.pl/";
        UserData testUser = getSampleUser();
        WebDriverWait myWait = new WebDriverWait(driver, 10);

        //WHEN
        driver.get(baseURL);
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(testUser.getEmail());
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(testUser.getPassword());
//        driver.findElement(By.xpath("//input[@formcontrolname='telephoneNumber']")).sendKeys(testUser.getPhoneNumber());
//        driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys(testUser.getFirstName());
//        driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys(testUser.getLastName());
//        Select select1 = new Select(driver.findElement(By.xpath("//div/label/select[@name='title']")));
//        select1.selectByIndex(1);
//        Select select2 = new Select(driver.findElement(By.xpath("//div[@class='row']//div[2]//urs-field-with-errors[1]//div[1]//label[1]//select[@name='title']")));
//        select2.selectByIndex(2);


    }
    @AfterTest
    public void closeResources() {
        driver.close();
    }
    private String generateRandomEmail() {
        return "username" + random.nextInt(1000) + "@gmail.com";
    }
    private UserData getSampleUser() {
        return new UserData("Karol", "Kowalski", generateRandomEmail(), "Test123!@", "123456789");
    }

}