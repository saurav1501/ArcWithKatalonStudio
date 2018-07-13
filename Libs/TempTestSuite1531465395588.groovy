import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Building Suites/Portfolios TestSuite')

suiteProperties.put('name', 'Portfolios TestSuite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Group 10\\git\\KatalonStudio\\ArcWithKatalonStudio\\Reports\\Building Suites\\Portfolios TestSuite\\20180713_123315\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Building Suites/Portfolios TestSuite', suiteProperties, [new TestCaseBinding('Test Cases/Buildings/MyPortfolios/LoginWithPortfolioTest', 'Test Cases/Buildings/MyPortfolios/LoginWithPortfolioTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/CreateNewPortfolioTest', 'Test Cases/Buildings/MyPortfolios/CreateNewPortfolioTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/SearchProgramPortfolioTest', 'Test Cases/Buildings/MyPortfolios/SearchProgramPortfolioTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/AddProjectInsidePortfolioTest', 'Test Cases/Buildings/MyPortfolios/AddProjectInsidePortfolioTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/ProjectDetailVerificationTest', 'Test Cases/Buildings/MyPortfolios/ProjectDetailVerificationTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/AnalyticsWaterScoreTest', 'Test Cases/Buildings/MyPortfolios/AnalyticsWaterScoreTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/PTScoreOtherDetailsTest', 'Test Cases/Buildings/MyPortfolios/PTScoreOtherDetailsTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/AnalyticsEnergyScoreTest', 'Test Cases/Buildings/MyPortfolios/AnalyticsEnergyScoreTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/AnalyticsWasteScoreTest', 'Test Cases/Buildings/MyPortfolios/AnalyticsWasteScoreTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/AnalyticsCarbonTopScoreTest', 'Test Cases/Buildings/MyPortfolios/AnalyticsCarbonTopScoreTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/AnalyticsTotalScoreTest', 'Test Cases/Buildings/MyPortfolios/AnalyticsTotalScoreTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/EnergyGoalTest', 'Test Cases/Buildings/MyPortfolios/EnergyGoalTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/GoalCarbonTest', 'Test Cases/Buildings/MyPortfolios/GoalCarbonTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/GoalWasteDivertionTest', 'Test Cases/Buildings/MyPortfolios/GoalWasteDivertionTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/GoalWasteGenerationTest', 'Test Cases/Buildings/MyPortfolios/GoalWasteGenerationTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/GoalWaterTest', 'Test Cases/Buildings/MyPortfolios/GoalWaterTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/AddTeamMemberTest', 'Test Cases/Buildings/MyPortfolios/AddTeamMemberTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/AnalyticsCarbonDataTest', 'Test Cases/Buildings/MyPortfolios/AnalyticsCarbonDataTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/AnalyticsDiversionWasteDataTest', 'Test Cases/Buildings/MyPortfolios/AnalyticsDiversionWasteDataTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/AnalyticsEnergyDataTest', 'Test Cases/Buildings/MyPortfolios/AnalyticsEnergyDataTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/AnalyticsGenerationWasteDataTest', 'Test Cases/Buildings/MyPortfolios/AnalyticsGenerationWasteDataTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/AnalyticsHumanExperienceScoreTest', 'Test Cases/Buildings/MyPortfolios/AnalyticsHumanExperienceScoreTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/AnalyticsHumExpDataTest', 'Test Cases/Buildings/MyPortfolios/AnalyticsHumExpDataTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/AnalyticsTransportationScoreTest', 'Test Cases/Buildings/MyPortfolios/AnalyticsTransportationScoreTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/AnalyticsTransportDataTest', 'Test Cases/Buildings/MyPortfolios/AnalyticsTransportDataTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/AnalyticsWaterDataTest', 'Test Cases/Buildings/MyPortfolios/AnalyticsWaterDataTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/GoalCertificationTest', 'Test Cases/Buildings/MyPortfolios/GoalCertificationTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/GoalHumanExperienceTest', 'Test Cases/Buildings/MyPortfolios/GoalHumanExperienceTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/GoalTransportationTest', 'Test Cases/Buildings/MyPortfolios/GoalTransportationTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/EditTeamMemberRoleTest', 'Test Cases/Buildings/MyPortfolios/EditTeamMemberRoleTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/EditPortfolioDetailTest', 'Test Cases/Buildings/MyPortfolios/EditPortfolioDetailTest',  null), new TestCaseBinding('Test Cases/Buildings/MyPortfolios/LogoutToArcTest', 'Test Cases/Buildings/MyPortfolios/LogoutToArcTest',  null)])
