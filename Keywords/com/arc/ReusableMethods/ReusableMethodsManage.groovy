package com.arc.ReusableMethods
import org.testng.Assert
import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword

public class ReusableMethodsManage extends BaseClass {
	@Keyword
	public void verifyProjectDetailsCityCom(String sheetName, int rowNum) throws IOException, InterruptedException {
		String ProjectName     = data.getCellData(sheetName, "Project ID", rowNum);
		String Address       = data.getCellData(sheetName, "Address", rowNum);
		String City       = data.getCellData(sheetName, "City", rowNum);
		String State       = data.getCellData(sheetName, "State", rowNum);
		String Country     = data.getCellData(sheetName, "Country", rowNum);
		String own_org     = data.getCellData(sheetName, "OwnerOrganization", rowNum);
		String own_email   = data.getCellData(sheetName, "OwnerEmail", rowNum);
		String own_country    = data.getCellData(sheetName, "OwnerCountry", rowNum);
		String gross_area  = data.getCellData(sheetName, "Area", rowNum);
		String Population   = data.getCellData(sheetName, "Population", rowNum);

		/*	CommonMethod.ArcSpecifictoggle( "Manage");
		 CommonMethod.click( "Project");
		 CommonMethod.testlog( "Pass", "Clicking on Project");
		 Assert.assertEquals(WebUIgetattributeValue(objectLocator), expected, message);
		 System.out.println(CommonMethod.getattributeValue( "M_ProjectID_value"));
		 CommonMethod.assertEqualsmessageAttributevalue( "M_ProjectName_value", ProjectName,
		 "Value is not correct");
		 CommonMethod.assertEqualsmessageAttributevalue( "M_Address_value", Address,
		 "Value is not correct");
		 CommonMethod.assertEqualsmessageAttributevalue( "M_City_value", City, "Value is not correct");
		 CommonMethod.assertEqualsmessageAttributevalue( "M_State_value", State, "Value is not correct");
		 CommonMethod.assertEqualsmessageAttributevalue( "M_Country_value", Country,	"Value is not correct");
		 CommonMethod.assertEqualsmessageAttributevalue("CM_OwnerOrg_value", own_org , "Value is not correct");
		 CommonMethod.assertEqualsmessageAttributevalue( "M_OwnerEmail_value", own_email,"Value is not correct");
		 CommonMethod.assertEqualsmessageAttributevalue( "M_OwnerCountry_value", own_country,
		 "Value is not correct");
		 CommonMethod.assertEqualsmessageAttributevalue( "M_GrossArea_value", gross_area, "Value is not correct");
		 CommonMethod.assertEqualsmessageAttributevalue( "M_Occupancy_value", Population, "Value is not correct");
		 CommonMethod.testlog( "Pass", "Verifying project details field present on Project details page");
		 */
	}

	@Keyword
	public void editProjectDetailsCityCom( String sheetName, int rowNum) throws IOException, InterruptedException {

		String editArea  = data.getCellData(sheetName, "editArea", rowNum);
		String editPopulation  = data.getCellData(sheetName, "editPopulation", rowNum);


		/*	CommonMethod.ArcSpecifictoggle( "Manage");
		 CommonMethod.click( "Project");
		 CommonMethod.testlog( "Pass", "Clicking on Project");
		 CommonMethod.clear( "M_GrossArea_value");
		 CommonMethod.clear( "M_Occupancy_value");
		 CommonMethod.sendKeys( "M_GrossArea_value", editArea);
		 Thread.sleep(1000);
		 CommonMethod.click( "M_GrossArea_value");
		 Thread.sleep(2000);
		 CommonMethod.sendKeys( "M_Occupancy_value", editPopulation);
		 CommonMethod.click( "M_Occupancy_value");
		 Thread.sleep(2000);
		 CommonMethod.testlog( "Pass", "Area and Population field edited");
		 Thread.sleep(1000);
		 CommonMethod.assertEqualsmessageAttributevalue( "M_GrossArea_value", editArea, "Value is not correct");
		 CommonMethod.assertEqualsmessageAttributevalue( "M_Occupancy_value", editPopulation, "Value is not correct");
		 CommonMethod.testlog( "Pass", "Verified Area and population is saving after editing");
		 */
	}

	@Keyword
	public void editProjectDetailsParking(String sheetName, int rowNum) throws IOException, InterruptedException {

		/*	CommonMethod.ArcSpecifictoggle("Manage");
		 CommonMethod.click( "Project");
		 CommonMethod.testlog( "Pass", "Clicking on Project");
		 Thread.sleep(3000);
		 CommonMethod.clear("NoOfParkingSpace");
		 CommonMethod.sendKeys("NoOfParkingSpace","50");
		 CommonMethod.click("NoOfParkingLevel");
		 Thread.sleep(1000);
		 CommonMethod.clear("NoOfParkingLevel");
		 CommonMethod.sendKeys("NoOfParkingLevel","50");
		 CommonMethod.click("NoOfParkingSpace");
		 Thread.sleep(1000);
		 CommonMethod.clear("M_InputWebSite");
		 CommonMethod.sendKeys("M_InputWebSite","http://www.parking-net.com");
		 CommonMethod.click("M_Inputdetails");
		 Thread.sleep(1000);
		 CommonMethod.clear("M_Inputdetails");
		 CommonMethod.sendKeys("M_Inputdetails","When assigned parking is provided, designated accessible parking .");
		 CommonMethod.click("NoOfParkingLevel");
		 Thread.sleep(1000);
		 driver.navigate().refresh();
		 Thread.sleep(5000);
		 CommonMethod.testlog("Pass","Verifying edited functionlity for no of parking space , level , website , about parking fields after refresh");
		 CommonMethod.assertcontainsattributevalue("NoOfParkingSpace","50"," Not Correct");
		 //CommonMethod.assertcontainsattributevalue("NoOfParkingLevel","50"," Not Correct");
		 CommonMethod.assertcontainsattributevalue("M_InputWebSite","http://www.parking-net.com"," Not Correct");
		 CommonMethod.assertcontainsattributevalue("M_Inputdetails","When assigned parking is provided, designated accessible parking ."," Not Correct");
		 CommonMethod.testlog("Pass","Verifying edited functionlity for no of parking space , level , website , about parking fields after refresh");
		 */
	}
	@Keyword
	public void verifyProjectDetailsParking() throws IOException, InterruptedException {

		/*CommonMethod.ArcSpecifictoggle("Manage");
		 CommonMethod.driverwait(1);
		 CommonMethod.click( "Project");
		 CommonMethod.testlog( "Pass", "Clicking on Project");
		 CommonMethod.testlog("Pass","Verifying registered address , city ,country , owner details , data commissioned fields");
		 CommonMethod.assertEqualsmessageAttributevalue( "M_Address_value", "2101 L St NW #500",
		 "Value is not correct");
		 CommonMethod.assertEqualsmessageAttributevalue("M_City_value", "Washington", "Value is not correct");
		 //CommonMethod.assertEqualsmessageAttributevalue( "M_State_value", "Alabama", "Value is not correct");
		 CommonMethod.assertEqualsmessageAttributevalue( "M_Country_value", "United States",
		 "Value is not correct");
		 CommonMethod.assertEqualsmessageAttributevalue( "CM_OwnerOrg_value", "T C T Company Limited", "Value is not correct");
		 //CommonMethod.assertEqualsmessageAttributevalue( "M_OwnerEmail_value", "ssinha@usgbc.org","Value is not correct");
		 //CommonMethod.assertEqualsmessageAttributevalue( "CM_OwnerCountry_value", "United States","Value is not correct");
		 CommonMethod.assertEqualsmessageAttributevalue( "M_DataCommisioned_value", "2015-02-04", "Value is not correct");
		 CommonMethod.testlog("Pass","Verified entered address , city ,country , owner details , data commissioned successfully");*/
	}
}
