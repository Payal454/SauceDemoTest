package com.sauce.qa.util;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.sauce.qa.base.TestBase;

public class TestUtil extends TestBase{

	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;
	


public static void takeScreenshotAtEndOfTest() throws IOException {
	
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("E:\\QA\\SeleniumWorkSpace\\SauceDemoTest\\screenshot\\screenshort.png"));
	
	//FileUtils.copyFile(scrFile, new File(current + "\\screenshots\\" + System.currentTimeMillis() + ".png"));
}




}