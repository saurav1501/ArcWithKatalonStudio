import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\GROUP1~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Buildings\\MyPortfolios\\AnalyticsDiversionWasteDataTest\\20180713_145806\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Buildings/MyPortfolios/AnalyticsDiversionWasteDataTest', new TestCaseBinding('Test Cases/Buildings/MyPortfolios/AnalyticsDiversionWasteDataTest', [:]), FailureHandling.STOP_ON_FAILURE , false)
    
