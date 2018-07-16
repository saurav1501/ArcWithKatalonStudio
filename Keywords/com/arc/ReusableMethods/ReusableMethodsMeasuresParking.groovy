package com.arc.ReusableMethods

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class ReusableMethodsMeasuresParking extends BaseClass {
	@Keyword
	public void measureMangementPoint()throws IOException, InterruptedException {
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/a_ Management'))
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/span_A1 - Parking Pricing'))
		WebUI.waitForPageLoad(10)
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/sideBar'))
		WebUI.delay(2)
		for (int i = 0; i <= 15; i++) {
			WebUI.click(findTestObject('BasePoint/CityCom/Checkbox1'))
			WebUI.delay(2)
			if(i==0) {
				println "Measure A1 - Parking Pricing total point Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure A1 - Parking Pricing total points Verified Successully"
			}

			if(i==1) {
				println "Measure A2 - Shared Parking total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox6'))
				WebUI.delay(4)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure A2 - Shared Parking total points Verified Successully"
			}

			if(i==2) {
				println "Measure A3 - Transportation Management total points Test Started"
				WebUI.delay(4)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure A3 - Transportation Management total points Verified Successully"
			}

			if(i==3) {
				println "Measure A4 - Recycling Program total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox6'))
				WebUI.delay(5)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure A4 - Recycling Program total points Verified Successully"
			}

			if(i==4) {
				println "Measure A5 - Sustainable Purchasing Program total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "2 of 2 Points Pursued", true)
				println "Measure A5 - Sustainable Purchasing Program total points Verified Successully"
			}

			if(i==5) {
				println  "Measure A6 - Proactive Operational Maintenance total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure A6 - Proactive Operational Maintenance total points Verified Successully"
			}


			if(i==6) {
				println "Measure A7 - Cleaning Procedures - Occupied Spaces total points Test"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "2 of 2 Points Pursued", true)
				println "Measure A7 - Cleaning Procedures - Occupied Spaces total points Verified Successully"
			}

			if(i==7) {
				println "Measure A8 - Cleaning Procedures - Parking Decks total points Verified Successully"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox5'))
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox9'))
				WebUI.delay(4)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println  "Measure A8 - Cleaning Procedures - Parking Decks total points Verified Successully"
			}

			if(i==8) {
				println "Measure A9 - Building Systems Commissioning total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox5'))
				WebUI.delay(4)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "8 of 8 Points Pursued", true)
				println "Measure A9 - Building Systems Commissioning total points Verified Successully"
			}
			if(i==9) {
				println  "Measure A10 - Construction Waste Management total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println  "Measure A10 - Construction Waste Management total points Verified Successully"
			}
			if(i==10) {
				println "Measure A11 - Regional Materials for New Construction, Rehabilitation, or Retrofit total points Test Started"
				WebUI.delay(3)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure A11 - Regional Materials for New Construction, Rehabilitation, or Retrofit total points Verified Successully"
			}

			if(i==11) {
				println "Measure A12 - Regional Labor for New Construction, Rehabilitation, or Retrofit total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox3'))
				WebUI.delay(3)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure A12 - Regional Labor for New Construction, Rehabilitation, or Retrofit total points Verified Successully"
			}
			if(i==12) {
				println  "Measure A13 - Reused, Repurposed or Recycled Materials total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println  "Measure A13 - Reused, Repurposed or Recycled Materials total points Verified Successully"
			}
			if(i==13) {
				println  "Measure A14 - Third Party Sustainability Certification total points Test started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "12 of 12 Points Pursued", true)
				println "Measure  A14 - Third Party Sustainability Certification total points Verified Successully"
			}
			if(i==14) {
				println "Measure A15 - Credentialed Management total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure A15 - Credentialed Management total points Verified Successully"
			}
			if(i==15) {
				println "Measure A16 - Life-cycle Assessment total points Test started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "8 of 8 Points Pursued", true)
				println "Measure A16 - Life-cycle Assessment total points Verified Successully"
			}
			WebUI.click(findTestObject('Page_Arc dashboard/button_Next'))
			WebUI.delay(3)
		}
		WebUI.click(findTestObject('Page_Arc dashboard/sideBar'))
		WebUI.click(findTestObject('Page_Arc dashboard/a_ Measures'))
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/a_ Management'))
		WebUI.delay(2)
	}

	@Keyword
	public void measureProgramsPoint()throws IOException, InterruptedException {
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/a_ Programs'))
		WebUI.delay(2)
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/span_B1 - Placemaking'))
		WebUI.waitForPageLoad(10)
		WebUI.click(findTestObject('Page_Arc dashboard/sideBar'))
		WebUI.delay(2)

		for (int i = 0; i <= 12; i++) {
			WebUI.click(findTestObject('BasePoint/CityCom/Checkbox1'))
			WebUI.delay(2)

			if(i==0) {
				println "Measure B1 - Placemaking total point Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox2'))
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox3'))
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox4'))
				WebUI.delay(3)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				//Reported Issue Here
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure B1 - Placemaking total point Test Started total points Verified Successully"
			}
			if(i==1) {
				println "Measure B2 - Access to Mass Transit total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure B2 - Access to Mass Transit total points Verified Successully"
			}
			if(i==2) {
				println "Measure B3 - Wayfinding Systems - External total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox4'))
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox6'))
				WebUI.delay(5)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure B3 - Wayfinding Systems - External total points Verified Successully"
			}
			if(i==3) {
				println "Measure B4 - Wayfinding Systems - Internal total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure B4 - Wayfinding Systems - Internal total points Verified Successully"
			}
			if(i==4) {
				println "Measure B5 - Traffic Flow Plan total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure B5 - Traffic Flow Plan total points Verified Successully"
			}
			if(i==5) {
				println "Measure B6 - Carshare Program total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox6'))
				WebUI.delay(3)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure B6 - Carshare Program total points Verified Successully"
			}
			if(i==6) {
				println "Measure B7 - Rideshare Program total points Test"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox7'))
				WebUI.delay(3)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure B7 - Rideshare Program total points Verified Successully"
			}
			if(i==7) {
				println "Measure B8 - Low-emitting and Fuel-efficient Vehicle Program total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox6'))
				WebUI.delay(4)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure B8 - Low-emitting and Fuel-efficient Vehicle Program total points Verified Successully"
			}

			if(i==8) {
				println "Measure B9 - Alternative Fuel Vehicles total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox5'))
				WebUI.delay(4)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure B9 - Alternative Fuel Vehicles total points Verified Successully"
			}
			if(i==9) {

				println "Measure B10 - Alternative Fuel Fleet Vehicles total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure B10 - Alternative Fuel Fleet Vehicles total points Verified Successully"
			}
			if(i==10) {

				println "Measure B11 - Bicycle Parking total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox6'))
				WebUI.delay(4)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure B11 - Bicycle Parking points Verified Successully"
			}
			if(i==11) {
				println "Measure B12 - Bicycle Sharing/Rental total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure B12 - Bicycle Sharing/Rental total points Verified Successully"
			}
			if(i==12) {
				println "Measure B13 - Marketing/Educational Program total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure B13 - Marketing/Educational Program total points Verified Successully"
			}

			WebUI.click(findTestObject('Page_Arc dashboard/button_Next'))
			WebUI.delay(3)
		}
		WebUI.click(findTestObject('Page_Arc dashboard/sideBar'))
		WebUI.click(findTestObject('Page_Arc dashboard/a_ Measures'))
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/a_ Programs'))
		WebUI.delay(2)
	}
	@Keyword
	public void measureTechnologyDesignPoint()throws IOException, InterruptedException {
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/a_ Technology  Structure Desig'))
		WebUI.delay(2)
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/span_C1 - Idle Reduction Payme'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Page_Arc dashboard/sideBar'))
		for (int i = 0; i <= 17; i++) {
			WebUI.click(findTestObject('BasePoint/CityCom/Checkbox1'))
			WebUI.delay(3)
			if(i==0) {
				println  "Measure C1 - Idle Reduction Payment Systems total point Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println  "Measure C1 - Idle Reduction Payment Systems total points Verified Successully"
			}

			if(i==1) {
				println  "Measure C2 - Fire Suppression Systems total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "2 of 2 Points Pursued", true)
				println  "Measure C2 - Fire Suppression Systems total points Verified Successully"
			}
			if(i==2) {
				WebUI.println "Measure C3 - No/Low-VOC Coatings, Paints and Sealants total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox2'))
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox3'))
				WebUI.delay(3)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "2 of 2 Points Pursued", true)
				WebUI.println "Measure C3 - No/Low-VOC Coatings, Paints and Sealants total points Verified Successully"
			}

			if(i==3) {
				WebUI.println  "Measure C4 - Tire Inflation Stations total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "2 of 2 Points Pursued", true)
				println "Measure C4 - Tire Inflation Stations total points Verified Successully"
			}

			if(i==4) {
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox5'))
				WebUI.delay(3)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				println "Measure C5 - Electric Vehicle (EV) Charging Stations total points Test Started"
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure C5 - Electric Vehicle (EV) Charging Stations total points Verified Successully"
			}

			if(i==5) {
				println "Measure C6 - HVAC Systems - Occupied Spaces total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox5'))
				WebUI.delay(2)
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox8'))
				WebUI.delay(3)
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox13 '))
				WebUI.delay(5)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure C6 - HVAC Systems - Occupied Spaces total points Verified Successully"
			}
			if(i==6) {
				println "Measure C7 - Ventilation Systems - Parking Decks total points Test"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox4'))
				WebUI.delay(3)
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox7'))
				WebUI.delay(2)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure C7 - Ventilation Systems - Parking Decks total points Verified Successully"
			}

			if(i==7) {
				println "Measure C8 - Lighting Controls total points Verified Successully"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox5'))
				WebUI.delay(3)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "8 of 8 Points Pursued", true)
				println  "Measure C8 - Lighting Controls total points Verified Successully"
			}

			if(i==8) {
				println  "Measure C9 - Energy-efficient Lighting System total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox3'))
				WebUI.delay(3)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				//Reported issue
				WebUI.verifyMatch(totalPoint, "8 of 8 Points Pursued", true)
				println "Measure C9 - Energy-efficient Lighting System total points Verified Successully"


			}
			if(i==9) {
				println "Measure C10 - Stormwater Management total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox3'))
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox5'))
				WebUI.delay(3)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure C10 - Stormwater Management total points Verified Successully"
			}
			if(i==10) {
				println  "Measure C11 - Rainwater Harvesting total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure C11 - Rainwater Harvesting total points Verified Successully"
			}
			if(i==11) {
				println  "Measure C12 - Greywater Reuse total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "2 of 2 Points Pursued", true)
				println  "Measure C12 - Greywater Reuse total points Verified Successully"
			}
			if(i==12) {
				WebUI.delay(3)
				println "Measure C13 - Indoor Water-efficiency total points Test started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "2 of 2 Points Pursued", true)
				println "Measure C13 - Indoor Water-efficiency total points Verified Successully"
			}
			if(i==13) {
				WebUI.delay(3)
				println "Measure C14 - Water-efficient Landscaping total points Test started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "2 of 2 Points Pursued", true)
				println "Measure C14 - Water-efficient Landscaping total points Verified Successully"
			}
			if(i==14) {
				println "Measure C15 - Roofing Systems total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure C15 - Roofing Systems total points Verified Successully"
			}
			if(i==15) {
				println "Measure C16 - Renewable Energy Generation total points Test started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "12 of 12 Points Pursued", true)
				println "Measure C16 - Renewable Energy Generation total points Verified Successully"
			}

			if(i==16) {
				println "Measure C17 - Design for Durability total points Test started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure C17 - Design for Durability total points Verified Successully"
			}
			if(i==17) {
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox4'))
				WebUI.delay(2)
				println  "Measure C18 - Energy Resiliency - Storage total points Test started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				WebUI.println  "Measure C18 - Energy Resiliency - Storage total points Verified Successully"
			}
			WebUI.click(findTestObject('Page_Arc dashboard/button_Next'))
			WebUI.delay(3)
		}
		WebUI.click(findTestObject('Page_Arc dashboard/sideBar'))
		WebUI.click(findTestObject('Page_Arc dashboard/a_ Measures'))
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/a_ Technology  Structure Desig'))
		WebUI.println "Verified Total Points By Marking all credit for Management section successuflly"
		WebUI.delay(2)
	}

	@Keyword
	public void measureInnovationPointt()throws IOException, InterruptedException {
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/a_ Innovation'))
		WebUI.delay(2)
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/span_D1 - Innovative Approach'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Page_Arc dashboard/sideBar'))
		WebUI.click(findTestObject('BasePoint/CityCom/Checkbox1'))
		WebUI.delay(3)
		for (int i = 0; i < 1; i++) {
			if(i==0) {
				println "Measure D1 - Innovative Approach total point Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox2'))
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox3'))
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox4'))
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox5'))
				WebUI.delay(5)
				//Issue here
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure D1 - Innovative Approach points Verified Successully"

			}
			WebUI.click(findTestObject('Page_Arc dashboard/button_Next'))
			WebUI.delay(2)
		}
		WebUI.click(findTestObject('Page_Arc dashboard/sideBar'))
		WebUI.click(findTestObject('Page_Arc dashboard/a_ Measures'))
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/a_ Innovation'))
		WebUI.println "Verified Total Points By Marking all credit for Management section successuflly"
		WebUI.delay(2)
	}
	@Keyword
	public void uploadImageParking() throws IOException, InterruptedException {
       
		
        WebUI.sendKeys(findTestObject('Manage/Parking/ParkPdfUpload'), parkImageUpload)
		WebUI.delay(4)
		WebUI.waitForElementVisible('Manage/Parking/FileUploadVerifyImage',15)
		println "Parking image 1 file Uploaded successfully" 
		  
	/*	CommonMethod.testlog( "Pass", "Clicking on Project");
		CommonMethod.displayhiddenElement("ParkPdfUpload");
		CommonMethod.sendKeys("ParkPdfUpload", CommonMethod.parkImageUpload);
		CommonMethod.WaitUntilInVisibility("ImageLoader");
		Thread.sleep(5000);
		CommonMethod.testlog( "Pass","Parking image 2 file Uploaded successfully");*/

	}
}
