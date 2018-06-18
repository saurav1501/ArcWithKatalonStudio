package com.arc.ReusableMethods

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable
import java.text.DateFormat
import java.text.SimpleDateFormat
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class ReusableMethodsManage extends BaseClass {
	
	@Keyword
	public void verifyBillingDate() throws IOException, InterruptedException {
				Calendar cal = Calendar.getInstance();
				DateFormat dateFormat = new SimpleDateFormat("dd");
				Date date = new Date();
				String Month = new SimpleDateFormat("MMM").format(cal.getTime());
				String Curdate = dateFormat.format(date);
				int Year = Calendar.getInstance().get(Calendar.YEAR);
				CommonMethod.ArcSpecifictoggle("Manage");
				CommonMethod.scrolldowntoElement( "Billing");
				CommonMethod.testlog( "Pass", "Clicking on Billing");
				CommonMethod.click("Billing");
				System.out.println(Month + " " + Curdate + ", " + Year);
				CommonMethod.assertEqualsmessage( "BillingDate", Month + " " + Curdate + ", " + Year,
						"Billing Date is not correct in Billing page");
				CommonMethod.testlog( "Pass", "Verifying Billing date is correct");
			}
	
	
}
