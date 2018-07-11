package com.arc.BaseClass
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.TestObject
public class BaseClass{
	public static String filePath= RunConfiguration.getProjectDir()+"\\ArcTest.xlsx"
	public static XlsReader data = new XlsReader(filePath)
	public static String screenShot = System.getProperty("user.dir")+"\\ScreenShot\\screenshot_"
	public static String UploadArcDataTemplete = System.getProperty("user.dir") +"\\ARCDataTemplete\\Arc_Data_Template.xlsm"
	public static TestObject myTestObject = new TestObject("customObject")
	public static Date date = new Date(System.currentTimeMillis())
}
