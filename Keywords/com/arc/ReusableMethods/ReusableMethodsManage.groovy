package com.arc.ReusableMethods
import org.testng.Assert
import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class ReusableMethodsManage extends BaseClass {
	@Keyword
	public void verifyProjectDetailsCityCom(String sheetName, int rowNum) throws IOException, InterruptedException {
		String prjId     = data.getCellData(sheetName, "Project ID", rowNum)
		String ownOrg     = data.getCellData(sheetName, "OwnerOrganization", rowNum)
		String own_country    = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String own_email   = data.getCellData(sheetName, "OwnerEmail", rowNum)
		String prjAddress       = data.getCellData(sheetName, "Address", rowNum)
		String prjCity       = data.getCellData(sheetName, "City", rowNum)
		String prjState       = data.getCellData(sheetName, "State", rowNum)
		String prjCountry     = data.getCellData(sheetName, "Country", rowNum)
		String gross_area  = data.getCellData(sheetName, "Area", rowNum)
		String Population   = data.getCellData(sheetName, "Population", rowNum)
		
		WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		WebUI.delay(1)
		WebUI.click(findTestObject('Manage/Parking/Manage'))
		WebUI.delay(1)
		WebUI.click(findTestObject('Manage/Parking/ManageProject'))
		WebUI.delay(2)

		println "Verify if  registered project  project id , address , city  , country , owner details , data commissioned , project country & satate population & area fields displays the correct data."
		Assert.assertTrue(WebUI.getAttribute(findTestObject('Manage/CityCom/project_ID'),"value").contains(prjId),"Not Valid")
		Assert.assertTrue(WebUI.getAttribute(findTestObject('Object Repository/Manage/CityCom/owner_org'),"value").contains(ownOrg),"Not Valid")
		Assert.assertTrue(WebUI.getAttribute(findTestObject('Manage/CityCom/owner_country'),"value").contains(own_country),"Not Valid")
		Assert.assertTrue(WebUI.getAttribute(findTestObject('Object Repository/Manage/CityCom/owner_Email'),"value").contains(own_email),"Not Valid")
	
		Assert.assertTrue(WebUI.getAttribute(findTestObject('Object Repository/Manage/CityCom/project_Add'),"value").contains(prjAddress),"Not Valid")
		Assert.assertTrue(WebUI.getAttribute(findTestObject('Object Repository/Manage/CityCom/proj_city'),"value").contains(prjCity),"Not Valid")
		Assert.assertTrue(WebUI.getAttribute(findTestObject('Object Repository/Manage/CityCom/owner_country'),"value").contains(prjCountry),"Not Valid")
		Assert.assertTrue(WebUI.getAttribute(findTestObject('Object Repository/Manage/CityCom/proj_state'),"value").contains(prjState),"Not Valid")
		
		Assert.assertTrue(WebUI.getAttribute(findTestObject('Manage/CityCom/input_grossArea'),"value").contains(gross_area),"Not Valid")
		Assert.assertTrue(WebUI.getAttribute(findTestObject('Manage/CityCom/input_population'),"value").contains(Population),"Not Valid")
		
		println "Verified successfully  registered project project id , address , city  , country , owner details , project country & satate population & area fields"

			
	}

	@Keyword
	public void editProjectDetailsCityCom( String sheetName, int rowNum) throws IOException, InterruptedException {

		String editArea  = data.getCellData(sheetName, "editArea", rowNum);
		String editPopulation  = data.getCellData(sheetName, "editPopulation", rowNum);
		
		WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		WebUI.delay(1)
		WebUI.click(findTestObject('Manage/Parking/Manage'))
		WebUI.delay(1)
		WebUI.click(findTestObject('Manage/Parking/ManageProject'))
		WebUI.delay(2)	
		
		WebUI.clearText(findTestObject('Manage/CityCom/input_grossArea'))
		WebUI.sendKeys(findTestObject('Manage/CityCom/input_grossArea'),editArea )
		WebUI.click(findTestObject('Object Repository/Manage/CityCom/ClickSave'))
		WebUI.delay(2)
		
		WebUI.clearText(findTestObject('Manage/CityCom/input_population'))
		WebUI.sendKeys(findTestObject('Manage/CityCom/input_population'),editPopulation)
		WebUI.click(findTestObject('Object Repository/Manage/CityCom/ClickSave'))
		WebUI.delay(2)
		
		WebUI.refresh()
		WebUI.delay(2)
		Assert.assertTrue(WebUI.getAttribute(findTestObject('Manage/CityCom/input_grossArea'),"value").contains(editArea),"Not Valid")
		Assert.assertTrue(WebUI.getAttribute(findTestObject('Manage/CityCom/input_population'),"value").contains(editPopulation),"Not Valid")
		 
	}
}
