package com.Utils.Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GW_Base {

	public static SimpleDateFormat sdf_ddMMMMyyyy = new SimpleDateFormat("ddMMMMyyyy");
	public static SimpleDateFormat sdf_ddMMMMyyyyHHmmss = new SimpleDateFormat("ddMMMMyyyy HHmmss");

	public static String strCurrentDate_ddMMMMyyyy = sdf_ddMMMMyyyy.format(new Date());
	public static String strCurrentDate_ddMMMMyyyyHHmmss = sdf_ddMMMMyyyyHHmmss.format(new Date());

	public static WebDriver driver;
	public static EventFiringWebDriver efDriver;
	public static JavascriptExecutor oJavascriptExecutor;
	public static WebDriverWait oWebDriverWait;

	public static ExtentHtmlReporter oExtentHtmlReporter;
	public static ExtentSparkReporter oExtentSparkReporter;
	public static ExtentReports oExtentReports;
	public static ExtentTest oExtentTest;

	public static Properties oProperties;
	public static File oFile;
	public static FileInputStream oFileInputStream;
	public static FileOutputStream oFileOutputStream;
	public static XSSFWorkbook oXSSFWorkbook;

	public static String pUserdir = System.getProperty("user.dir");
	public static String gstrHostname = System.getProperty("hostname");
	public static String gstrUsername = System.getProperty("user.name");
	public static String gstrOSname = System.getProperty("os.name");
	public static String pConfigproperties = pUserdir + "/src/main/resources/Config.Properties";

	public static String pScreenshots;
	public static String pExtentReport_TodayFile;
	public static String pExtentReport_indexFile;
	public static String pTestDataFilePath;
	public static String pFile_TestBreakTracker = pUserdir + "\\testdata\\TestBreakTracker.xlsx";

	public static String strPolicyNumber = strCurrentDate_ddMMMMyyyyHHmmss;
	public static String strAccountNumber = strCurrentDate_ddMMMMyyyy;
	public static String strAccountName;
	public static String strAmount;

	public static String url;
	public static String StrBrowser;
	public static String strGW_Application;

}
