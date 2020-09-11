import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUsingSelenium {
 
    @Test
    public void login() {
        // TODO Auto-generated method stub
        
        System.setProperty("webdriver.chrome.driver", "path of driver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(d, timeOutSeconds);
        wait.until(nextpage());
        driver.get("https://www.sampleinvest.com/login");
        Thread.sleep(2000);
	    WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']"));
        login.click();
        wait_for_page_load(browser):
	    WebElement phone_number=driver.findElement(By.id("phone_number"));	
    	phone_number.sendKeys("9876543210");
    	WebElement continue=driver.findElement(By.xpath("//button[text()='Continue']"));
    	login.click();
    	Thread.sleep(1000);

    	public void sendSMS() throws Exception
        {
        OutboundNotification outboundNotification = new OutboundNotification();
        SerialModemGateway gateway = new SerialModemGateway("modem.com5", "COM5", 9600, "ZTE", "COM5");
        gateway.setInbound(true);
        gateway.setOutbound(true);
        gateway.setSmscNumber("9876543210"); // 10-digit Mobile Number
        Service.getInstance().setOutboundMessageNotification(outboundNotification);
        Service.getInstance().addGateway(gateway);
        Service.getInstance().startService();
        OutboundMessage msg = new OutboundMessage(ExcelConnect.strSMSTo, ExcelConnect.strSMSText);
        Service.getInstance().sendMessage(msg);
        System.out.println(msg);
        System.out.println(ExcelConnect.strSMSTo + "-" + ExcelConnect.strSMSText);
        Service.getInstance().stopService();
        Service.getInstance().removeGateway(gateway);
        }
        
        phone_number.sendKeys(msg);
        WebElement continue=driver.findElement(By.xpath("//button[text()='Continue']"));
    	login.click();
    	Thread.sleep(2000);
    	WebElement option1=driver.findElement(By.xpath("//button[text()='Option1']"));
    	option1.click();
        WebElement continue=driver.findElement(By.xpath("//button[text()='Continue']"));
    	login.click();
        wait.until(nextpage());
        WebElement PAN=driver.findElement(By.xpath("//button[text()='PAN']"));
    	PAN.click();
        WebElement START=driver.findElement(By.xpath("//button[text()='START']"));
    	login.click();
        wait.until(nextpage());
        
        WebElement pannumber=driver.findElement(By.id("PANnumber"));
        WebElement dateofbirth=driver.findElement(By.id("DateOFBirth"));
        pannumber.sendKeys("FHSN807GHH");
        dateofbirth.sendKeys("27-10-1994");
        login.click();
        WebElement continue=driver.findElement(By.xpath("//button[text()='Continue']"));
    	login.click();
        Thread.sleep(2000);
        wait.until(nextpage());
        WebElement IFSC=driver.findElement(By.id("IFSC"));
        WebElement AccountNumber=driver.findElement(By.id("AccountNumber"));
        WebElement ReenterAccountNumber=driver.findElement(By.id("AccountNumber"));
        WebElement AccountType=driver.findElement(By.id("AccountType"));
        IFSC.sendKeys("HDFC######");
        Thread.sleep(2000);
        AccountNumber.sendKeys("43444144413");
        Thread.sleep(2000);
        ReenterAccountNumber.sendKeys("43444144413");
        Thread.sleep(2000);
        AccountType.sendKeys("Savings");
        Thread.sleep(2000);
        WebElement continue=driver.findElement(By.xpath("//button[text()='Continue']"));
    	login.click();
        wait.until(nextpage());
        
        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\newhtml.html");
        Thread.sleep(2000);
        WebElement continue=driver.findElement(By.xpath("//button[text()='Continue']"));
    	login.click();
        wait.until(nextpage());
        WebElement notnow=driver.findElement(By.xpath("//button[text()='notnow']"));
    	login.click();
        
        String actualString = driver.findElement(By.xpath("xpath")).getText();
        assertTrue(actualString.contains("Congratulations"));
        
        
    }
 
}