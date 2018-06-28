package com.arc.BaseClass
import com.kms.katalon.core.configuration.RunConfiguration
public class BaseClass{
	public static String filePath= RunConfiguration.getProjectDir()+"\\ArcTest.xlsx"
	public static XlsReader data = new XlsReader(filePath)
	public static String screenShot = System.getProperty("user.dir")+"\\ScreenShot\\screenshot_"
	public static String UploadArcDataTemplete = System.getProperty("user.dir") +"\\ARCDataTemplete\\Arc_Data_Template.xlsm"
}
