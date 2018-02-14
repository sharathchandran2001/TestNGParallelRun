package com.Testcases;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.PageFactory.appeleOne;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//package com.parallel;
import org.testng.annotations.Test;

public class TcParallel1 {
	
@Test (priority = 1)
public void tcCase1() {


System.out.println("TC 1 in " + getClass().getSimpleName() + " with Thread Id is " + Thread.currentThread().getId());

System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.navigate().to("https://shalimatech.com/");

}
@Test (priority = 2)
public void testCase2() {


System.out.println("TC 2 in " + getClass().getSimpleName() + " with Thread Id is  " + Thread.currentThread().getId());


}
}
	
