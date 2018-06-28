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
import com.kms.katalon.core.webui.keyword.builtin.WaitForElementNotClickableKeyword

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class ReusableMethodsBasescore  extends BaseClass{
	@Keyword
	public void basePointOptionA(String cdataInputSheet,int rowNum) throws IOException, InterruptedException{
		WebUI.delay(2)
		WebUI.waitForElementNotClickable(findTestObject('Object Repository/BasePoint/a_ Base Points'), 10)
		WebUI.doubleClick(findTestObject('Object Repository/BasePoint/a_ Base Points'))
		WebUI.delay(10)
		for(int count=1;count<=11;count++) {
			WebUI.click(findTestObject('Object Repository/BasePoint/Checkbox'+count))
		}
		//	CommonMethod.assertcontainsmessage("OptionA","10", "Not Valid");
		//	CommonMethod.testlog("Pass","Option A Base point score verified Successully");
	}
}
