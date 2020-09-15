package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sun.org.apache.bcel.internal.generic.Select;
import com.sun.tools.javac.util.Assert;

public class automate {
 
    
    public static void main(String[] args) {
        
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\j.machado\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //navigate to URL
        driver.navigate().to("https://gitlab.com/users/sign_up");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        //Register without inputing values
        driver.findElement(By.xpath("//*[@id='new_new_user']/div[11]/input")).click();
        String Validation1 = driver.findElement(By.xpath("//*[@id='new_new_user']/div[4]/p[1]")).getText();
        Assert.assertEqual(Validation1.contains("Please Create"), "All the fields are mandatory, hence “This field is required.");
        
        //Accept all the special characters
        driver.findElement(By.xpath("//*[@id='new_user_first_name']")).sendKeys("Ju$tus%");
        driver.findElement(By.xpath("//*[@id='new_user_last_name']")).sendKeys("M@chado");
        driver.findElement(By.xpath("//*[@id='new_new_user']/div[11]/input")).click();
        Boolean Display = driver.findElement(By.xpath("//*[@id='new_new_user']/div[3]/div[1]/p")).isDisplayed();
        Assert.assertFalse(Display, "First Name and Last Name fields must accept all the above characters"); 
        
        //Error on special characters with username
        driver.findElement(By.xpath("//*[@id='new_user_username']")).sendKeys("Ju$tus%");
        driver.findElement(By.xpath("//*[@id='new_new_user']/div[11]/input")).click();
        String Validation2 = driver.findElement(By.xpath("//*[@id=\"new_new_user\"]/div[4]/p[1]")).getText();
        Assert.assertEqual(Validation2.contains("only alphanumeric characters"), "The script failed");
        
        //Register without email address
        driver.findElement(By.xpath("//*[@id='new_new_user']/div[11]/input")).click();
        String Validation1 = driver.findElement(By.xpath("//*[@id='new_new_user']/div[5]/p")).getText();
        Assert.assertEqual(Validation1.contains("Please provide a valid email address."), "The script failed");
        
        //Register with invalid password
        driver.findElement(By.xpath("//*[@id=\'new_user_password\']")).sendKeys("Avenger");
        driver.findElement(By.xpath("//*[@id='new_new_user']/div[11]/input")).click();
        String Validation2 = driver.findElement(By.xpath("//*[@id=\"password-strength\"]/p[1]")).getText();
        Assert.assertEqual(Validation2.contains("Minimum length is 8 characters."), "The script failed");
        
        }
        
 }

