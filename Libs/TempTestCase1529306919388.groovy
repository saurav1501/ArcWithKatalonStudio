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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Group10\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Buildings\\MyBuildings\\BuildingNone\\UploadArcDataTemplate\\20180618_125839\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Buildings/MyBuildings/BuildingNone/UploadArcDataTemplate', new TestCaseBinding('Test Cases/Buildings/MyBuildings/BuildingNone/UploadArcDataTemplate', [:]), FailureHandling.STOP_ON_FAILURE , false)
    
