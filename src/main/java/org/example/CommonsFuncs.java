package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;

public class CommonsFuncs {
    public WebDriver driver;
    public WebDriverWait wait;

    public Properties p;

    public void loadProperties() throws IOException {
        p = new Properties();
        Properties p2 = new Properties();
        Properties p3 = new Properties();
        Properties p4 = new Properties();
        Properties p5 = new Properties();
        Properties p6 = new Properties();
        FileInputStream fi = new FileInputStream("C:\\Users\\pooja.saini\\IdeaProjects\\TestNG_CSI2\\src\\PropertyFiles\\Config.properties");
        FileInputStream fi1 = new FileInputStream("C:\\Users\\pooja.saini\\IdeaProjects\\TestNG_CSI2\\src\\PropertyFiles\\GlobalSearch.properties");
        FileInputStream fi2 = new FileInputStream("C:\\Users\\pooja.saini\\IdeaProjects\\TestNG_CSI2\\src\\PropertyFiles\\CreateInv.properties");
        FileInputStream fi3 = new FileInputStream("C:\\Users\\pooja.saini\\IdeaProjects\\TestNG_CSI2\\src\\PropertyFiles\\SwiftMsg.properties");
        FileInputStream fi4 = new FileInputStream("C:\\Users\\pooja.saini\\IdeaProjects\\TestNG_CSI2\\src\\PropertyFiles\\swiftRepair.properties");
        FileInputStream fi5 = new FileInputStream("C:\\Users\\pooja.saini\\IdeaProjects\\TestNG_CSI2\\src\\PropertyFiles\\Xpay_IR.properties");
        p.load(fi);
        p2.load(fi1);
        p.putAll(p2);
        p.load(fi);
        p3.load(fi2);
        p.putAll(p3);
        p4.load(fi3);
        p.putAll(p4);
        p5.load(fi4);
        p.putAll(p5);
        p6.load(fi5);
        p.putAll(p6);


    }

    public void signin() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooja.saini\\Downloads\\chromedriver-win32_116\\chromedriver-win32\\chromedriver.exe");
        System.out.println("Test Start");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--incognito");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(cap);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofMinutes(3));
        driver.get(p.getProperty("url"));
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        waitAndSendKeys(p.getProperty("username_xpath"), p.getProperty("username"));
        waitandclick(p.getProperty("submit_xpath"));
        //sendKeys password
        waitAndSendKeys(p.getProperty("password_xpath"), p.getProperty("password"));
        waitandclick(p.getProperty("submit_xpath"));
        //sendKeys answer question
        waitAndSendKeys(p.getProperty("answerQues_xpath"), p.getProperty("answerQues_value"));
        waitandclick(p.getProperty("submit_xpath"));
        Thread.sleep(2000);
    }

    public void signinSwiftRepair() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooja.saini\\Downloads\\chromedriver-win32_116\\chromedriver-win32\\chromedriver.exe");
        System.out.println("Test Start");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--incognito");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(cap);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
//        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofMinutes(3));
    }

    public void Xpay_signin() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooja.saini\\Downloads\\chromedriver-win32_116\\chromedriver-win32\\chromedriver.exe");
        System.out.println("Test Start");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--incognito");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(cap);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
//        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofMinutes(3));
    }

    public void waitandclick(String xpathExpression) throws InterruptedException {
        By item = By.xpath(xpathExpression);
        wait.until(ExpectedConditions.presenceOfElementLocated(item));
        driver.findElement(item).click();
        Thread.sleep(3000);
    }


    public void waitAndSendKeys(String xpathExpression, String value) throws InterruptedException {
        By item = By.xpath(xpathExpression);
        wait.until(ExpectedConditions.presenceOfElementLocated(item));
        driver.findElement(item).sendKeys(value);
        Thread.sleep(3000);
    }

    public void launchURL() throws InterruptedException {
        driver.get("https://csi.uat.corp.stonex.com/#/admin/investigation/dashboard");
    }

    public ArrayList<String> extract_col_values(int Col_index) {
        int rowcount = driver.findElements(By.xpath("(//table[@role='presentation'])[2]//tr")).size();
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 1; i <= rowcount; i++) {
            String text = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + Col_index + "]")).getText();
            array.add(text);
        }
        System.out.println("rowcount is = " + rowcount);
        return array;
    }

    public void take_screenshot(String fileName) throws IOException {
        //take ss and store it as a file format
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dstFile = new File(fileName);
        FileUtils.copyFile(srcFile, dstFile);
        //copy ss to desired  location
    }

    public Date stringToDate(String dateStr, String formatstr) throws ParseException {
        DateFormat format = new SimpleDateFormat(formatstr, Locale.ENGLISH);
        return format.parse(dateStr);
    }
}
