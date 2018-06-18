
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject

import java.sql.Connection


def static "com.arc.ReusableMethods.ReusableMethodsPayment.paymentByCC"(
    	String sheetName	
     , 	int rowNum	) {
    (new com.arc.ReusableMethods.ReusableMethodsPayment()).paymentByCC(
        	sheetName
         , 	rowNum)
}

def static "com.arc.ReusableMethods.ReusableMethodsLogin.LoginToArcWithRemoteDBMySQL"() {
    (new com.arc.ReusableMethods.ReusableMethodsLogin()).LoginToArcWithRemoteDBMySQL()
}

def static "com.arc.ReusableMethods.ReusableMethodsLogin.loginIntoArcApplication"(
    	String applicationUrl	
     , 	String Username	
     , 	String Password	) {
    (new com.arc.ReusableMethods.ReusableMethodsLogin()).loginIntoArcApplication(
        	applicationUrl
         , 	Username
         , 	Password)
}

def static "com.arc.ReusableMethods.ReusableMethodsLogin.loginIntoArcWithGlobalVariable"() {
    (new com.arc.ReusableMethods.ReusableMethodsLogin()).loginIntoArcWithGlobalVariable()
}

def static "com.arc.ReusableMethods.ReusableMethodsLogin.loginIntoArcWithExcelData"() {
    (new com.arc.ReusableMethods.ReusableMethodsLogin()).loginIntoArcWithExcelData()
}

def static "com.arc.ReusableMethods.ReusableMethodsLogin.logoutFromArcApplication"() {
    (new com.arc.ReusableMethods.ReusableMethodsLogin()).logoutFromArcApplication()
}

def static "com.arc.ReusableMethods.ReusableMethodsDataInput.uploadArcDataTempte"() {
    (new com.arc.ReusableMethods.ReusableMethodsDataInput()).uploadArcDataTempte()
}

def static "com.arc.ReusableMethods.ReusableMethodsDataInput.uploadCreditFormTest"() {
    (new com.arc.ReusableMethods.ReusableMethodsDataInput()).uploadCreditFormTest()
}

def static "com.helper.javascript.JavaScriptHelper.executeScript"(
    	String script	) {
    (new com.helper.javascript.JavaScriptHelper()).executeScript(
        	script)
}

def static "com.helper.javascript.JavaScriptHelper.executeScriptOnTestObject"(
    	String string	
     , 	TestObject testObject	) {
    (new com.helper.javascript.JavaScriptHelper()).executeScriptOnTestObject(
        	string
         , 	testObject)
}

def static "com.helper.javascript.JavaScriptHelper.executeAndReturnValue"(
    	String script	
     , 	TestObject testObject	) {
    (new com.helper.javascript.JavaScriptHelper()).executeAndReturnValue(
        	script
         , 	testObject)
}

def static "com.arc.ReusableMethods.ReusableMethodsSearch.searchProgram"(
    	String sheetName	
     , 	int rowNum	) {
    (new com.arc.ReusableMethods.ReusableMethodsSearch()).searchProgram(
        	sheetName
         , 	rowNum)
}

def static "com.arc.ReusableMethods.ReusableMethodsAddNewProject.USBuildingAddNewProject"(
    	String sheetName	
     , 	int rowNum	) {
    (new com.arc.ReusableMethods.ReusableMethodsAddNewProject()).USBuildingAddNewProject(
        	sheetName
         , 	rowNum)
}

def static "com.helper.mysql.ConnectMySqlRemoteDB.executeQuery"(
    	String queryString	) {
    (new com.helper.mysql.ConnectMySqlRemoteDB()).executeQuery(
        	queryString)
}

def static "com.helper.mysql.ConnectMySqlRemoteDB.closeDatabaseConnection"() {
    (new com.helper.mysql.ConnectMySqlRemoteDB()).closeDatabaseConnection()
}

def static "com.helper.mysql.ConnectMySqlRemoteDB.execute"(
    	String queryString	
     , 	Connection conn	) {
    (new com.helper.mysql.ConnectMySqlRemoteDB()).execute(
        	queryString
         , 	conn)
}

def static "com.helper.grid.GridHelper.GetValueFromGrid"(
    	TestObject baseTestObject	
     , 	int rowIndex	
     , 	int colIndex	) {
    (new com.helper.grid.GridHelper()).GetValueFromGrid(
        	baseTestObject
         , 	rowIndex
         , 	colIndex)
}

def static "com.helper.grid.GridHelper.getValueOrClickOnColumn"(
    	TestObject baseTestObject	
     , 	int rowIndex	
     , 	int colIndex	
     , 	String type	) {
    (new com.helper.grid.GridHelper()).getValueOrClickOnColumn(
        	baseTestObject
         , 	rowIndex
         , 	colIndex
         , 	type)
}

def static "com.arc.ReusableMethods.ReusableMethodsNavigation.navigateToMenuItem"(
    	String menuName	) {
    (new com.arc.ReusableMethods.ReusableMethodsNavigation()).navigateToMenuItem(
        	menuName)
}

def static "com.arc.ReusableMethods.ReusableMethodsNavigation.navigateToBuilding"() {
    (new com.arc.ReusableMethods.ReusableMethodsNavigation()).navigateToBuilding()
}

def static "com.arc.ReusableMethods.ReusableMethodsNavigation.clickAddProject"() {
    (new com.arc.ReusableMethods.ReusableMethodsNavigation()).clickAddProject()
}

def static "com.arc.ReusableMethods.ReusableMethodsNavigation.navigateToCities"() {
    (new com.arc.ReusableMethods.ReusableMethodsNavigation()).navigateToCities()
}

def static "com.arc.BaseClass.XlsWriteToNewFileNewFile.writeTOExcelFile"(
    	String excelPath	
     , 	String sheetName	
     , 	String value	
     , 	int rowNo	
     , 	int colNo	) {
    (new com.arc.BaseClass.XlsWriteToNewFileNewFile()).writeTOExcelFile(
        	excelPath
         , 	sheetName
         , 	value
         , 	rowNo
         , 	colNo)
}

def static "com.arc.ReusableMethods.ReusableMethodsManage.verifyBillingDate"() {
    (new com.arc.ReusableMethods.ReusableMethodsManage()).verifyBillingDate()
}
