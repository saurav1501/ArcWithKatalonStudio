import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stg.app.arconline.io/login')

WebUI.setText(findTestObject('Portfolio/Common/input_form-control login_field'), 'saurav@groupten.com')

WebUI.setText(findTestObject('Portfolio/Common/input_form-control login_field_1'), 'LEEDg10')

WebUI.click(findTestObject('Portfolio/Common/input_accept_checkbox'))

WebUI.click(findTestObject('Portfolio/Common/button_LOG IN'))

WebUI.click(findTestObject('Portfolio/Common/a_ Buildings'))

WebUI.click(findTestObject('Portfolio/Common/a_ My Portfolios'))

WebUI.click(findTestObject('Portfolio/Common/span_My Portfolios'))

WebUI.click(findTestObject('Portfolio/Common/button_ Create a Portfolio'))

WebUI.setText(findTestObject('Portfolio/Common/input_name'), 'test')

WebUI.setText(findTestObject('Portfolio/Common/input_organization'), 'z Park')

WebUI.click(findTestObject('Portfolio/Common/span_Z Park'))

WebUI.selectOptionByValue(findTestObject('null'), 'IN', true)

WebUI.setText(findTestObject('Portfolio/Common/input_portfolio_organization_c'), '11111111111')

WebUI.setText(findTestObject('Portfolio/Common/input_location'), 'B')

WebUI.setText(findTestObject('Portfolio/Common/input_portfolio_email'), 'test@gmail.co')

WebUI.setText(findTestObject('Portfolio/Common/textarea_form-control ng-prist'), 't')

WebUI.setText(findTestObject('null'), 'tt')

WebUI.setText(findTestObject('Portfolio/Common/textarea_Description'), 'ttt')

WebUI.click(findTestObject('Portfolio/Common/button_Create'))

WebUI.click(findTestObject('Portfolio/Common/button_Done'))

WebUI.click(findTestObject('Portfolio/Common/p_Get Started'))

WebUI.click(findTestObject('Portfolio/Common/span_Add a Project'))

WebUI.setText(findTestObject('Portfolio/Common/input_searchBarPort'), '1000140374')

WebUI.click(findTestObject('Portfolio/Common/SelectProjectInPortfolio'))

WebUI.setText(findTestObject('Portfolio/Common/input_searchBarPortfolio'), '70001135')

WebUI.click(findTestObject('Portfolio/Common/SelectPortfolio'))

WebUI.click(findTestObject('Portfolio/Common/button_Add'))

WebUI.click(findTestObject('Portfolio/Common/p_Successfully added to'))

WebUI.click(findTestObject('Portfolio/Common/button_Done'))

WebUI.closeBrowser()

