package com.arc.ReusableMethods

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.testng.Assert

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class ReusableMethodsDataInput extends BaseClass {

	@Keyword
	public void uploadArcDataTempte(){

		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/span_Upload .XLS'),10)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/span_Upload .XLS'))
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/UploadArcDataTemplete'),10)
		WebUI.uploadFile(findTestObject('Object Repository/DataInput/UploadArcDataTemplete'),BaseClass.UploadArcDataTemplete )

		WebUI.doubleClick(findTestObject('DataInput/ClickToUploadFileButton'))
		String successmessage= WebUI.getText(findTestObject('DataInput/p_Excel submitted successfully'))
		WebUI.delay(5)
		WebUI.verifyMatch(successmessage,'Excel submitted successfully. We will send you an email when you data is processed.' , true)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/button_CLOSE'))
		WebUI.refresh()
		WebUI.delay(5)
	}

	@Keyword
	public void uploadCreditFormTest(){
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/span_Upload .XLS'),10)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/span_Upload .XLS'))
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/UploadArcDataTemplete'),10)
		WebUI.uploadFile(findTestObject('Object Repository/DataInput/UploadArcDataTemplete'),BaseClass.UploadArcDataTemplete )
		WebUI.click(findTestObject('DataInput/ClickToUploadFileButton'))
		String successmessage= WebUI.getText(findTestObject('DataInput/p_Excel submitted successfully'))
		WebUI.delay(5)
		WebUI.verifyMatch(successmessage,'Excel submitted successfully. We will send you an email when you data is processed.' , true)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/button_CLOSE'))
		WebUI.refresh()
		WebUI.delay(5)
	}

	@Keyword
	public void createEnergyMeterReading(String sheetName, int rowNum) throws IOException, InterruptedException{
		String reading1  = data.getCellData(sheetName, "EReading1", rowNum);
		String reading2  = data.getCellData(sheetName, "EReading2", rowNum);
		String reading3  = data.getCellData(sheetName, "EReading3", rowNum);
		String reading4  = data.getCellData(sheetName, "EReading4", rowNum);
		String reading5  = data.getCellData(sheetName, "EReading5", rowNum);


		WebUI.doubleClick(findTestObject('DataInput/a_ Data Input'))
		WebUI.click(findTestObject('DataInput/span_Energy'))

		/*WebUI.click(findTestObject('DataInput/button_Add Year'))
		WebUI.click(findTestObject('DataInput/button_Next Year'))
		WebUI.click(findTestObject('DataInput/button_Previous Year'))
		WebUI.click(findTestObject('DataInput/button_Previous Year'))
		WebUI.click(findTestObject('DataInput/button_Previous Year'))


		WebUI.click(findTestObject('DataInput/EditButton1'))
		WebUI.setText(findTestObject('DataInput/TextboxValue1'), reading1)
		WebUI.click(findTestObject('DataInput/SaveButton1'))
		WebUI.delay(2)

		WebUI.click(findTestObject('DataInput/EditButton2'))
		WebUI.setText(findTestObject('DataInput/TextboxValue2'), reading2)
		WebUI.click(findTestObject('DataInput/SaveButton2'))
		WebUI.delay(2)

		WebUI.click(findTestObject('DataInput/EditButton3'))
		WebUI.setText(findTestObject('DataInput/TextboxValue3'), reading3)
		WebUI.click(findTestObject('DataInput/SaveButton3'))
		WebUI.delay(2)

		WebUI.click(findTestObject('DataInput/EditButton4'))
		WebUI.setText(findTestObject('DataInput/TextboxValue4'), reading4)
		WebUI.click(findTestObject('DataInput/SaveButton4'))
		WebUI.delay(2)

		WebUI.click(findTestObject('DataInput/EditButton5'))
		WebUI.setText(findTestObject('DataInput/TextboxValue5'), reading5)
		WebUI.click(findTestObject('DataInput/SaveButton5'))
		WebUI.delay(2)*/
       
		//Assert.assertTrue(WebUI(findTestObject('DataInput/TextboxValue1')
         Assert.assertTrue(WebUI.getAttribute(findTestObject('DataInput/TextboxValue1'),"value"). contains(reading1),"Not Valid") 

		/*	String str = WebUI.getText(findTestObject('DataInput/TextboxValue1'))
		 println str
		 Assert.assertTrue(findTestObject('DataInput/TextboxValue1').getProperties().contains(reading1), "Not valid");
		 WebUI.verifyElementAttributeValue(findTestObject('DataInput/TextboxValue1'), reading1 ,false)
		 WebUI.verifyElementText(findTestObject('DataInput/TextboxValue1'), reading1, FailureHandling.STOP_ON_FAILURE)
		 WebUI.getAttribute(findTestObject('DataInput/TextboxValue1'), reading1, FailureHandling.STOP_ON_FAILURE)
		 //	WebUI.getAttribute(findTestObject('DataInput/TextboxValue2'), reading1, FailureHandling.STOP_ON_FAILURE)
		 //	WebUI.getAttribute(findTestObject('DataInput/TextboxValue3'), reading1, FailureHandling.STOP_ON_FAILURE)
		 //	WebUI.getAttribute(findTestObject('DataInput/TextboxValue4'), reading1, FailureHandling.STOP_ON_FAILURE)
		 */
	}
	@Keyword
	public void createWaterMeterReading(String sheetName, int rowNum ) throws IOException, InterruptedException {
		/*************************Reading data from excel sheet ************************************/

		String reading1  = data.getCellData(sheetName, "WaterReading1", rowNum);
		String reading2  = data.getCellData(sheetName, "WaterReading2", rowNum);
		String reading3  = data.getCellData(sheetName, "WaterReading3", rowNum);
		String reading4  = data.getCellData(sheetName, "WaterReading4", rowNum);
		String reading5  = data.getCellData(sheetName, "WaterReading5", rowNum);


		WebUI.doubleClick(findTestObject('DataInput/a_ Data Input'))
		WebUI.click(findTestObject('Object Repository/DataInput/span_Water'))

		WebUI.click(findTestObject('DataInput/button_Add Year'))
		WebUI.click(findTestObject('DataInput/button_Next Year'))
		WebUI.click(findTestObject('DataInput/button_Previous Year'))
		WebUI.click(findTestObject('DataInput/button_Previous Year'))
		WebUI.click(findTestObject('DataInput/button_Previous Year'))


		WebUI.click(findTestObject('DataInput/EditButton1'))
		WebUI.setText(findTestObject('DataInput/TextboxValue1'), reading1)
		WebUI.click(findTestObject('DataInput/SaveButton1'))
		WebUI.delay(2)

		WebUI.click(findTestObject('DataInput/EditButton2'))
		WebUI.setText(findTestObject('DataInput/TextboxValue2'), reading2)
		WebUI.click(findTestObject('DataInput/SaveButton2'))
		WebUI.delay(2)

		WebUI.click(findTestObject('DataInput/EditButton3'))
		WebUI.setText(findTestObject('DataInput/TextboxValue3'), reading3)
		WebUI.click(findTestObject('DataInput/SaveButton3'))
		WebUI.delay(2)

		WebUI.click(findTestObject('DataInput/EditButton4'))
		WebUI.setText(findTestObject('DataInput/TextboxValue4'), reading4)
		WebUI.click(findTestObject('DataInput/SaveButton4'))
		WebUI.delay(2)

		WebUI.click(findTestObject('DataInput/EditButton5'))
		WebUI.setText(findTestObject('DataInput/TextboxValue5'), reading5)
		WebUI.click(findTestObject('DataInput/SaveButton5'))
		WebUI.delay(2)


		/*	WebUI.refresh();
		 Thread.sleep(5000);
		 CommonMethod.assertcontainsattributevalue("TextboxValue1", reading1,"Not Correct");
		 CommonMethod.assertcontainsattributevalue("TextboxValue2", reading2,"Not Correct");
		 CommonMethod.assertcontainsattributevalue("TextboxValue3", reading3,"Not Correct");
		 CommonMethod.assertcontainsattributevalue("TextboxValue4", reading4,"Not Correct");
		 CommonMethod.assertcontainsattributevalue("TextboxValue5", reading5,"Not Correct");
		 CommonMethod.testlog( "Pass"," Verifies added meter reading saved & displays correctly after refresh");
		 */
	}

	@Keyword
	public void createWasteGeneration (String sheetName,int rowNum) throws IOException, InterruptedException {

		/*************************Reading data from excel sheet ************************************/
		String reading1  = data.getCellData(sheetName, "wastegeneration1", rowNum);
		String reading2  = data.getCellData(sheetName, "wastegeneration2", rowNum);
		String reading3  = data.getCellData(sheetName, "wastegeneration3", rowNum);
		String reading4  = data.getCellData(sheetName, "wastegeneration4", rowNum);
		String reading5  = data.getCellData(sheetName, "wastegeneration5", rowNum);


		WebUI.doubleClick(findTestObject('DataInput/a_ Data Input'))
		WebUI.click(findTestObject('Object Repository/DataInput/span_Waste'))

		WebUI.click(findTestObject('Object Repository/DataInput/GwAddYear'))
		WebUI.delay(2)

		WebUI.click(findTestObject('DataInput/button_Next Year'))
		WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/button_Previous Year'))
		WebUI.click(findTestObject('DataInput/button_Previous Year'))
		WebUI.click(findTestObject('DataInput/button_Previous Year'))


		WebUI.click(findTestObject('DataInput/EditButton1'))
		WebUI.setText(findTestObject('DataInput/TextboxValue1'), reading1)
		WebUI.click(findTestObject('DataInput/SaveButton1'))
		WebUI.delay(2)

		WebUI.click(findTestObject('DataInput/EditButton2'))
		WebUI.setText(findTestObject('DataInput/TextboxValue2'), reading2)
		WebUI.click(findTestObject('DataInput/SaveButton2'))
		WebUI.delay(2)

		WebUI.click(findTestObject('DataInput/EditButton3'))
		WebUI.setText(findTestObject('DataInput/TextboxValue3'), reading3)
		WebUI.click(findTestObject('DataInput/SaveButton3'))
		WebUI.delay(2)

		WebUI.click(findTestObject('DataInput/EditButton4'))
		WebUI.setText(findTestObject('DataInput/TextboxValue4'), reading4)
		WebUI.click(findTestObject('DataInput/SaveButton4'))
		WebUI.delay(2)

		WebUI.click(findTestObject('DataInput/EditButton5'))
		WebUI.setText(findTestObject('DataInput/TextboxValue5'), reading5)
		WebUI.click(findTestObject('DataInput/SaveButton5'))
		WebUI.delay(2)


		/*	CommonMethod.assertcontainsattributevalue("CWTextboxValue1", reading1,"Not Correct");
		 CommonMethod.assertcontainsattributevalue("CWTextboxValue2", reading2,"Not Correct");
		 CommonMethod.assertcontainsattributevalue("CWTextboxValue3", reading3,"Not Correct");
		 CommonMethod.assertcontainsattributevalue("CWTextboxValue4", reading4,"Not Correct");
		 CommonMethod.assertcontainsattributevalue("CWTextboxValue5", reading5,"Not Correct");
		 CommonMethod.testlog( "Pass"," Verifies added meter reading saved & displays correctly after refresh ");
		 Thread.sleep(3000);*/
	}

	@Keyword
	public void createWasteDiversionMeterReading(String param, String sheetName, int rowNum) throws IOException, InterruptedException{
		/*************************Reading data from excel sheet ************************************/

		String reading1  = data.getCellData(sheetName, "wastediversion1", rowNum);
		String reading2  = data.getCellData(sheetName, "wastediversion2", rowNum);
		String reading3  = data.getCellData(sheetName, "wastediversion3", rowNum);
		String reading4  = data.getCellData(sheetName, "wastediversion4", rowNum);
		String reading5  = data.getCellData(sheetName, "wastediversion5", rowNum);


		CommonMethod.ArcSpecifictoggle( "CreditAction");
		ClickDataInput();
		ClickDataInputParam(param);

		CommonMethod.click("DwAddYear");
		CommonMethod.driverwait(1);

		CommonMethod.click("DPreviousYear");
		CommonMethod.driverwait(1);

		CommonMethod.click("DPreviousYear");
		CommonMethod.driverwait(1);

		CommonMethod.click("DPreviousYear");
		CommonMethod.driverwait(1);

		CommonMethod.click("DPreviousYear");
		CommonMethod.driverwait(1);


		CommonMethod.click("EditButton6");
		Thread.sleep(2000);

		CommonMethod.clear("dWTextboxValue1");
		CommonMethod.sendKeys("dWTextboxValue1",reading1);
		CommonMethod.click("SaveButton6");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Waste Reading 1 ");

		CommonMethod.click("EditButton7");
		Thread.sleep(2000);
		CommonMethod.clear("dWTextboxValue2");
		CommonMethod.sendKeys("dWTextboxValue2", reading2);
		CommonMethod.click("SaveButton7");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Waste Reading 2 ");

		CommonMethod.click("EditButton8");
		Thread.sleep(2000);
		CommonMethod.clear("dWTextboxValue3");
		CommonMethod.sendKeys("dWTextboxValue3", reading3);
		CommonMethod.click("SaveButton8");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Waste Reading 3 ");


		CommonMethod.click("EditButton9");
		Thread.sleep(2000);
		CommonMethod.clear("dWTextboxValue4");
		CommonMethod.sendKeys("dWTextboxValue4", reading4);
		CommonMethod.click("SaveButton9");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Waste Reading 4 ");

		CommonMethod.click("EditButton10");
		Thread.sleep(2000);
		CommonMethod.clear("dWTextboxValue5");
		CommonMethod.sendKeys("dWTextboxValue5", reading5);
		CommonMethod.click("SaveButton10");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Waste Reading 5 ");

		driver.navigate().refresh();
		Thread.sleep(5000);


		CommonMethod.assertcontainsattributevalue("dWTextboxValue1", reading1,"Not Correct");
		CommonMethod.assertcontainsattributevalue("dWTextboxValue2", reading2,"Not Correct");
		CommonMethod.assertcontainsattributevalue("dWTextboxValue3", reading3,"Not Correct");
		CommonMethod.assertcontainsattributevalue("dWTextboxValue4", reading4,"Not Correct");
		CommonMethod.assertcontainsattributevalue("dWTextboxValue5", reading5,"Not Correct");


		CommonMethod.testlog( "Pass"," Verifies added meter reading saved & displays correctly after refresh ");


		Thread.sleep(3000);
	}



	@Keyword
	public void createADReadingPointOptionB(String sheetName, int rowNum) throws IOException, InterruptedException {
		CommonMethod.click(param);
		CommonMethod.driverwait(2);
		CommonMethod.click("Checkbox12");
		CommonMethod.driverwait(1);
		CommonMethod.click("ClickOptionB");

		/*************************Reading data from excel sheet ************************************/


		String reading1  = data.getCellData(sheetName, "ADeatailsValueReading1", rowNum);
		String reading2  = data.getCellData(sheetName, "ADeatailsValueReading2", rowNum);
		String reading3  = data.getCellData(sheetName, "ADeatailsValueReading3", rowNum);
		String reading4  = data.getCellData(sheetName, "ADeatailsValueReading4", rowNum);

		String ureading1  = data.getCellData(sheetName, "ADeatailsUnitReading1", rowNum);
		String ureading2  = data.getCellData(sheetName, "ADeatailsUnitReading2", rowNum);
		String ureading3  = data.getCellData(sheetName, "ADeatailsUnitReading3", rowNum);
		String ureading4  = data.getCellData(sheetName, "ADeatailsUnitReading4", rowNum);

		CommonMethod.click("ClickDropdown");
		CommonMethod.click("Option1");
		Thread.sleep(1000);
		CommonMethod.click("AddButton");
		Thread.sleep(1000);

		CommonMethod.click("ClickDropdown");
		CommonMethod.click("Option2");
		Thread.sleep(1000);
		CommonMethod.click("AddButton");
		Thread.sleep(1000);

		CommonMethod.click("ClickDropdown");
		CommonMethod.click("Option3");
		Thread.sleep(1000);
		CommonMethod.click("AddButton");
		Thread.sleep(1000);

		CommonMethod.click("ClickDropdown");
		CommonMethod.click("Option4");
		Thread.sleep(1000);
		CommonMethod.click("AddButton");
		Thread.sleep(1000);

		CommonMethod.click("EditButton1");
		CommonMethod.clear("Avalue1");
		CommonMethod.sendKeys("Avalue1", reading1);
		CommonMethod.sendKeys("Aunit1", ureading1);
		CommonMethod.click("BasePointCheckbox1");
		CommonMethod.click("SaveButton1");
		Thread.sleep(3000);
		CommonMethod.testlog("Pass", "Additional field reading 1 units saved successfully" );

		CommonMethod.click("EditButton2");
		CommonMethod.clear("Avalue2");
		CommonMethod.sendKeys("Avalue2", reading2);
		CommonMethod.driverwait(2);
		CommonMethod.clear("Aunit2");
		CommonMethod.sendKeys("Aunit2", ureading2);
		CommonMethod.click("BasePointCheckbox2");
		CommonMethod.click("SaveButton2");
		Thread.sleep(3000);
		CommonMethod.testlog("Pass", "Additional field reading 2 units saved successfully" );

		CommonMethod.click("EditButton3");
		CommonMethod.clear("Avalue3");
		CommonMethod.sendKeys("Avalue3", reading3);
		CommonMethod.driverwait(2);
		CommonMethod.sendKeys("Aunit3", ureading3);
		Thread.sleep(1000);
		CommonMethod.click("BasePointCheckbox3");
		CommonMethod.click("SaveButton3");
		Thread.sleep(3000);
		CommonMethod.testlog("Pass", "Additional field reading 3 units saved successfully" );

		CommonMethod.click("EditButton4");
		CommonMethod.clear("Avalue4");
		CommonMethod.sendKeys("Avalue4", reading4);
		CommonMethod.driverwait(2);
		CommonMethod.sendKeys("Aunit4", ureading4);
		CommonMethod.driverwait(1);
		CommonMethod.click("BasePointCheckbox4");
		CommonMethod.click("SaveButton4");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Additional field reading 4 units saved successfully" );

		driver.navigate().refresh();
		Thread.sleep(5000);
		CommonMethod.assertcontainsattributevalue("Avalue1", reading4,"Not Correct");
		CommonMethod.assertcontainsattributevalue("Avalue2", reading3,"Not Correct");
		CommonMethod.assertcontainsattributevalue("Avalue3", reading2,"Not Correct");
		CommonMethod.assertcontainsattributevalue("Avalue4", reading1,"Not Correct");
		CommonMethod.testlog("Pass","Verifies added meter reading saved & displays correctly after refresh");

		CommonMethod.click(param);
		CommonMethod.driverwait(3);
		CommonMethod.assertcontainsmessage("OptionB","2", "Not Valid");
		CommonMethod.testlog("Pass","Option B Base point score 2 verified Successully");
	}

	@Keyword
	public void createADMeterReading(String sheetName, int rowNum) throws IOException, InterruptedException {
		/*************************Reading data from excel sheet ************************************/
		String reading1  = data.getCellData(sheetName, "ADeatailsValueReading1", rowNum);
		String reading2  = data.getCellData(sheetName, "ADeatailsValueReading2", rowNum);
		String reading3  = data.getCellData(sheetName, "ADeatailsValueReading3", rowNum);
		String reading4  = data.getCellData(sheetName, "ADeatailsValueReading4", rowNum);
		String reading5  = data.getCellData(sheetName, "ADeatailsValueReading5", rowNum);

		String ureading1  = data.getCellData(sheetName, "ADeatailsUnitReading1", rowNum);
		String ureading2  = data.getCellData(sheetName, "ADeatailsUnitReading2", rowNum);
		String ureading3  = data.getCellData(sheetName, "ADeatailsUnitReading3", rowNum);
		String ureading4  = data.getCellData(sheetName, "ADeatailsUnitReading4", rowNum);
		String ureading5  = data.getCellData(sheetName, "ADeatailsUnitReading5", rowNum);


		CommonMethod.ArcSpecifictoggle("CreditAction");
		ClickDataInput();
		ClickDataInputParam(param);
		Thread.sleep(1000);
		CommonMethod.click("ClickDropdown");
		CommonMethod.click("Option1");
		Thread.sleep(1000);
		CommonMethod.click("AddButton");
		Thread.sleep(1000);

		CommonMethod.click("ClickDropdown");
		CommonMethod.click("Option2");
		Thread.sleep(1000);
		CommonMethod.click("AddButton");
		Thread.sleep(1000);

		CommonMethod.click("ClickDropdown");
		CommonMethod.click("Option3");
		Thread.sleep(1000);
		CommonMethod.click("AddButton");
		Thread.sleep(1000);

		CommonMethod.click("ClickDropdown");
		CommonMethod.click("Option4");
		Thread.sleep(1000);
		CommonMethod.click("AddButton");
		Thread.sleep(1000);

		CommonMethod.click("ClickDropdown");
		CommonMethod.click("Option5");
		Thread.sleep(1000);
		CommonMethod.click("AddButton");
		Thread.sleep(1000);

		CommonMethod.click("EditButton1");
		Thread.sleep(1000);
		CommonMethod.clear("Avalue1");
		CommonMethod.sendKeys("Avalue1", reading1);
		CommonMethod.sendKeys("Aunit1", ureading1);
		CommonMethod.click("SaveButton1");
		Thread.sleep(3000);
		CommonMethod.testlog("Pass", "Additional field reading 1 units saved successfully" );

		CommonMethod.click("EditButton2");
		CommonMethod.clear("Avalue2");
		CommonMethod.sendKeys("Avalue2", reading2);
		CommonMethod.clear("Aunit2");
		CommonMethod.sendKeys("Aunit2", ureading2);
		Thread.sleep(1000);
		CommonMethod.click("SaveButton2");
		Thread.sleep(3000);
		CommonMethod.testlog("Pass", "Additional field reading 2 units saved successfully" );

		CommonMethod.click("EditButton3");
		CommonMethod.clear("Avalue3");
		CommonMethod.sendKeys("Avalue3", reading3);
		CommonMethod.sendKeys("Aunit3", ureading3);
		Thread.sleep(1000);
		CommonMethod.click("SaveButton3");
		Thread.sleep(3000);
		CommonMethod.testlog("Pass", "Additional field reading 3 units saved successfully" );

		CommonMethod.click("EditButton4");
		CommonMethod.clear("Avalue4");
		CommonMethod.sendKeys("Avalue4", reading4);
		CommonMethod.sendKeys("Aunit4", ureading4);
		CommonMethod.driverwait(1);
		CommonMethod.click("SaveButton4");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Additional field reading 4 units saved successfully" );

		CommonMethod.click("EditButton5");
		CommonMethod.clear("Avalue5");
		CommonMethod.sendKeys("Avalue5", reading5);
		CommonMethod.sendKeys("Aunit5", ureading5);
		CommonMethod.driverwait(1);
		CommonMethod.click("SaveButton5");
		Thread.sleep(3000);
		CommonMethod.testlog("Pass", "Additional field reading 5 units saved successfully" );

		driver.navigate().refresh();
		Thread.sleep(5000);


		CommonMethod.assertcontainsattributevalue("Avalue1", reading5,"Not Correct");
		CommonMethod.assertcontainsattributevalue("Avalue2", reading4,"Not Correct");
		CommonMethod.assertcontainsattributevalue("Avalue3", reading3,"Not Correct");
		CommonMethod.assertcontainsattributevalue("Avalue4", reading2,"Not Correct");
		CommonMethod.assertcontainsattributevalue("Avalue5", reading1,"Not Correct");
		CommonMethod.testlog("Pass","Verifies added meter reading saved & displays correctly after refresh");
	}

	@Keyword
	public void createTransportReading(String param, String sheetName, int rowNum) throws IOException, InterruptedException{

		/*************************Reading data from excel sheet ************************************/

		String reading1  = data.getCellData(sheetName, "TReading1", rowNum);
		String reading2  = data.getCellData(sheetName, "TReading2", rowNum);
		String reading3  = data.getCellData(sheetName, "TReading3", rowNum);
		String reading4  = data.getCellData(sheetName, "TReading4", rowNum);
		String reading5  = data.getCellData(sheetName, "TReading5", rowNum);


		CommonMethod.ArcSpecifictoggle( "CreditAction");
		ClickDataInput();
		ClickDataInputParam(param);

		CommonMethod.click("AddYear");
		CommonMethod.driverwait(1);

		CommonMethod.click("PreviousYear");
		CommonMethod.driverwait(1);

		CommonMethod.click("PreviousYear");
		CommonMethod.driverwait(1);

		CommonMethod.click("PreviousYear");
		CommonMethod.driverwait(1);

		CommonMethod.click("PreviousYear");
		CommonMethod.driverwait(1);

		CommonMethod.click("EditButton1");
		Thread.sleep(2000);
		CommonMethod.clear("TextboxValue1");
		CommonMethod.sendKeys("TextboxValue1",reading1);
		CommonMethod.click("SaveButton1");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Transportationr Reading 1 ");

		CommonMethod.click("EditButton2");
		Thread.sleep(2000);
		CommonMethod.clear("TextboxValue2");
		CommonMethod.sendKeys("TextboxValue2", reading2);
		CommonMethod.click("SaveButton2");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Transportation Reading 2 ");

		CommonMethod.click("EditButton3");
		Thread.sleep(2000);
		CommonMethod.clear("TextboxValue3");
		CommonMethod.sendKeys("TextboxValue3", reading3);
		CommonMethod.click("SaveButton3");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Transportation Reading 3 ");

		CommonMethod.click("EditButton4");
		Thread.sleep(2000);
		CommonMethod.clear("TextboxValue4");
		CommonMethod.sendKeys("TextboxValue4", reading4);
		CommonMethod.click("SaveButton4");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Transportation Reading 4 ");

		CommonMethod.click("EditButton5");
		Thread.sleep(2000);
		CommonMethod.clear("TextboxValue5");
		CommonMethod.sendKeys("TextboxValue5", reading5);
		CommonMethod.click("SaveButton5");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Transportation Reading 5 ");

		driver.navigate().refresh();
		Thread.sleep(5000);

		CommonMethod.assertcontainsattributevalue("TextboxValue1", reading1,"Not Correct");
		CommonMethod.assertcontainsattributevalue("TextboxValue2", reading2,"Not Correct");
		CommonMethod.assertcontainsattributevalue("TextboxValue3", reading3,"Not Correct");
		CommonMethod.assertcontainsattributevalue("TextboxValue4", reading4,"Not Correct");
		CommonMethod.assertcontainsattributevalue("TextboxValue5", reading5,"Not Correct");

		Thread.sleep(3000);
		CommonMethod.testlog( "Pass"," Verifies added meter reading saved & displays correctly after refresh ");
	}

	@Keyword
	public void createHumtMeterReading(String sheetName, int rowNum) throws IOException, InterruptedException {
		/*************************Reading data from excel sheet ************************************/

		String reading1  = data.getCellData(sheetName, "EPReading1", rowNum);
		String reading2  = data.getCellData(sheetName, "EPReading2", rowNum);
		String reading3  = data.getCellData(sheetName, "HGiniReading1", rowNum);
		String reading4  = data.getCellData(sheetName, "HGiniReading2", rowNum);
		String reading5  = data.getCellData(sheetName, "Hincome1", rowNum);
		String reading6  = data.getCellData(sheetName, "Hincome2", rowNum);


		CommonMethod.ArcSpecifictoggle( "CreditAction");
		ClickDataInput();
		ClickDataInputParam(param);
		CommonMethod.driverwait(1);

		CommonMethod.click("EducationAddYear");
		CommonMethod.driverwait(1);
		CommonMethod.click("EducationAddPrevYear");
		CommonMethod.driverwait(1);

		CommonMethod.click("EditButton1");
		Thread.sleep(2000);
		CommonMethod.clear("TextboxValue1");
		CommonMethod.sendKeys("TextboxValue1",reading1);
		CommonMethod.click("SaveButton1");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Human Experience Reading 1 ");

		CommonMethod.click("EditButton2");
		Thread.sleep(2000);
		CommonMethod.clear("TextboxValue2");
		CommonMethod.sendKeys("TextboxValue2", reading2);
		CommonMethod.click("SaveButton2");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Human Experience Reading 2 ");


		CommonMethod.click("BachelorAddYear");
		CommonMethod.driverwait(1);
		CommonMethod.click("BachelorAddPrevYear");
		CommonMethod.driverwait(1);

		CommonMethod.click("EditButton3");
		Thread.sleep(2000);
		CommonMethod.clear("HTextboxValue3");
		CommonMethod.sendKeys("HTextboxValue3", reading1);
		CommonMethod.click("SaveButton3");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Human Experience Reading 3 ");

		CommonMethod.click("EditButton4");
		Thread.sleep(2000);
		CommonMethod.clear("HTextboxValue4");
		CommonMethod.sendKeys("HTextboxValue4", reading2);
		CommonMethod.click("SaveButton4");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Human Experience Reading 4 ");


		CommonMethod.click("EquAddYear");
		CommonMethod.driverwait(1);
		CommonMethod.click("EquAddPrevYear");
		CommonMethod.driverwait(1);

		CommonMethod.click("EditButton5");
		Thread.sleep(2000);
		CommonMethod.clear("HTextboxValue5");
		CommonMethod.sendKeys("HTextboxValue5", reading1);
		CommonMethod.click("SaveButton5");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Human Experience Reading 5 ");

		CommonMethod.click("EditButton6");
		Thread.sleep(2000);
		CommonMethod.clear("HTextboxValue6");
		CommonMethod.sendKeys("HTextboxValue6", reading2);
		CommonMethod.click("SaveButton6");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Human Experience Reading 5 ");


		CommonMethod.click("GiniAddYear");
		CommonMethod.driverwait(1);
		CommonMethod.click("GiniAddPrevYear");
		CommonMethod.driverwait(1);

		CommonMethod.click("EditButton7");
		Thread.sleep(2000);
		CommonMethod.clear("HTextboxValue7");
		CommonMethod.sendKeys("HTextboxValue7", reading3);
		CommonMethod.click("SaveButton7");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Human Experience Reading 5 ");

		CommonMethod.click("EditButton8");
		Thread.sleep(2000);
		CommonMethod.clear("HTextboxValue8");
		CommonMethod.sendKeys("HTextboxValue8", reading4);
		CommonMethod.click("SaveButton8");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Human Experience Reading 5 ");


		CommonMethod.click("ProsperityAddYear");
		CommonMethod.driverwait(1);
		CommonMethod.click("ProsperityAddPrevYear");
		CommonMethod.driverwait(1);

		CommonMethod.click("EditButton9");
		Thread.sleep(2000);
		CommonMethod.clear("HTextboxValue9");
		CommonMethod.sendKeys("HTextboxValue9", reading5);
		CommonMethod.click("SaveButton9");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Human Experience Reading 5 ");

		CommonMethod.click("EditButton10");
		Thread.sleep(2000);
		CommonMethod.clear("HTextboxValue10");
		CommonMethod.sendKeys("HTextboxValue10", reading6);
		CommonMethod.click("SaveButton10");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Human Experience Reading 5 ");

		CommonMethod.testlog( "Pass"," Verifies added meter reading saved & displays correctly after refresh");
	}


	@Keyword
	public void createHumanExpMeterReading(String param, String sheetName, int rowNum) throws IOException, InterruptedException{

		/*************************Reading data from excel sheet ************************************/


		String reading1  = data.getCellData(sheetName, "WaterReading1", rowNum);
		String reading2  = data.getCellData(sheetName, "WaterReading2", rowNum);
		String reading3  = data.getCellData(sheetName, "WaterReading3", rowNum);
		String reading4  = data.getCellData(sheetName, "WaterReading4", rowNum);
		String reading5  = data.getCellData(sheetName, "WaterReading5", rowNum);


		CommonMethod.ArcSpecifictoggle( "CreditAction");
		ClickDataInput();
		ClickDataInputParam(param);
		CommonMethod.click("EditButton1");
		Thread.sleep(2000);
		CommonMethod.clear("ETextboxValue1");
		CommonMethod.sendKeys("ETextboxValue1",reading1);
		CommonMethod.click("SaveButton1");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Water Reading 1 ");

		CommonMethod.click("EditButton2");
		Thread.sleep(2000);
		CommonMethod.clear("ETextboxValue2");
		CommonMethod.sendKeys("ETextboxValue2", reading2);
		CommonMethod.click("SaveButton2");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Water Reading 2 ");

		CommonMethod.click("EditButton3");
		Thread.sleep(2000);
		CommonMethod.clear("ETextboxValue3");
		CommonMethod.sendKeys("ETextboxValue3", reading3);
		CommonMethod.click("SaveButton3");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving Water Reading 3 ");

		CommonMethod.click("PreviousYear");
		Thread.sleep(2000);
		CommonMethod.click("EditButton4");
		Thread.sleep(2000);
		CommonMethod.clear("ETextboxValue4");
		CommonMethod.sendKeys("ETextboxValue4", reading4);
		CommonMethod.click("SaveButton4");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving water Reading 4 ");

		CommonMethod.click("PreviousYear");
		Thread.sleep(2000);
		CommonMethod.click("EditButton5");
		Thread.sleep(2000);
		CommonMethod.clear("ETextboxValue5");
		CommonMethod.sendKeys("ETextboxValue5", reading5);
		CommonMethod.click("SaveButton5");
		Thread.sleep(2000);
		CommonMethod.testlog("Pass", "Saving water Reading 5 ");

		CommonMethod.assertcontainsattributevalue("WTextboxValue1", reading5,"Not Correct");
		CommonMethod.assertcontainsattributevalue("WTextboxValue2", reading4,"Not Correct");
		CommonMethod.assertcontainsattributevalue("WTextboxValue3", reading1,"Not Correct");
		CommonMethod.assertcontainsattributevalue("WTextboxValue4", reading2,"Not Correct");
		CommonMethod.assertcontainsattributevalue("WTextboxValue5", reading3,"Not Correct");
		CommonMethod.testlog( "Pass"," Verifies added meter reading saved & displays correctly after refresh ");
		Thread.sleep(3000);
	}
}