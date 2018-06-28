package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object StgUrl
     
    /**
     * <p></p>
     */
    public static Object StgUserName
     
    /**
     * <p></p>
     */
    public static Object StgPassword
     
    /**
     * <p></p>
     */
    public static Object DelayTime
     
    /**
     * <p>Profile default : Explicit Wait Timeout</p>
     */
    public static Object TimeOut
     
    /**
     * <p></p>
     */
    public static Object Env
     
    /**
     * <p></p>
     */
    public static Object QasUrl
     
    /**
     * <p></p>
     */
    public static Object QasUserName
     
    /**
     * <p></p>
     */
    public static Object QasPassword
     
    /**
     * <p></p>
     */
    public static Object DevUrl
     
    /**
     * <p></p>
     */
    public static Object DevUserName
     
    /**
     * <p></p>
     */
    public static Object DevPassword
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object userName
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p>Profile QAS-IND-MEM : Explicit Wait Timeout
Profile QAS-IND-NON-MEM  : Explicit Wait Timeout
Profile STG-CA : Explicit Wait Timeout
Profile STG-CN : Explicit Wait Timeout
Profile STG-IND  : Explicit Wait Timeout
Profile STG-US : Explicit Wait Timeout
Profile dev : Explicit Wait Timeout
Profile qas : Explicit Wait Timeout</p>
     */
    public static Object timeOut
     
    /**
     * <p></p>
     */
    public static Object env
     
    /**
     * <p>Profile QAS-IND-MEM : Adding India projects
Profile QAS-IND-NON-MEM  : Adding India projects
Profile STG-CA : Adding canada projects
Profile STG-CN : Adding china projects
Profile STG-IND  : Adding India projects
Profile STG-US : Adding US projects</p>
     */
    public static Object BuildingSheet
     
    /**
     * <p>Profile QAS-IND-MEM : Adding new team member 
Profile QAS-IND-NON-MEM  : Adding new team member 
Profile STG-CA : Adding new team member 
Profile STG-CN : Adding new team member 
Profile STG-IND  : Adding new team member 
Profile STG-US : Adding new team member </p>
     */
    public static Object BuildingTeam
     
    /**
     * <p>Profile QAS-IND-MEM : Adding Credit Card payment details 
Profile QAS-IND-NON-MEM  : Adding Credit Card payment details 
Profile STG-CA : Adding Credit Card payment details 
Profile STG-CN : Adding Credit Card payment details 
Profile STG-IND  : Adding Credit Card payment details 
Profile STG-US : Adding Credit Card payment details </p>
     */
    public static Object CCPayment
     
    /**
     * <p></p>
     */
    public static Object rowNumTwo
     
    /**
     * <p></p>
     */
    public static Object rowNumThree
     
    /**
     * <p></p>
     */
    public static Object rowNumFour
     
    /**
     * <p></p>
     */
    public static Object rowNumFive
     
    /**
     * <p></p>
     */
    public static Object rowNumSix
     
    /**
     * <p>Profile QAS-IND-MEM : Adding new  india city projects 
Profile QAS-IND-NON-MEM  : Adding new  india city projects 
Profile STG-IND  : Adding new  india city projects </p>
     */
    public static Object CitySheet
     
    /**
     * <p>Profile QAS-IND-MEM : Adding new Inida community projects 
Profile QAS-IND-NON-MEM  : Adding new Inida community projects 
Profile STG-CA : Adding new canada projects
Profile STG-CN : Adding new china projects
Profile STG-IND  : Adding new Inida community projects </p>
     */
    public static Object CommunitySheet
     
    /**
     * <p></p>
     */
    public static Object CDataInput
     
    /**
     * <p></p>
     */
    public static Object rowNum
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['StgUrl' : 'http://www.stg.arconline.io/', 'StgUserName' : 'Saurav@groupten.com', 'StgPassword' : 'LEEDg10', 'DelayTime' : 3, 'TimeOut' : 40, 'Env' : 'qas', 'QasUrl' : 'http://www.qas.arconline.io', 'QasUserName' : 'usgbcarc@gmail.com', 'QasPassword' : 'initpass', 'DevUrl' : 'http://www.dev.arconline.io', 'DevUserName' : 'rmishra@usgbc.org', 'DevPassword' : 'initpass'])
        allVariables.put('QAS-IND-MEM', allVariables['default'] + ['url' : 'http://www.qas.arconline.io/', 'userName' : 'testleed1@gmail.com', 'password' : 'initpass', 'timeOut' : 40, 'env' : 'stg', 'BuildingSheet' : 'BuildingIndiaProject', 'BuildingTeam' : 'BTeam', 'CCPayment' : 'Payment', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6, 'CitySheet' : 'CityIndiaProject', 'CommunitySheet' : 'CommunityIndiaProject', 'CDataInput' : 'CDataInput'])
        allVariables.put('QAS-IND-NON-MEM ', allVariables['default'] + ['url' : 'http://www.qas.arconline.io/', 'userName' : 'usgbcarc@gmail.com', 'password' : 'initpass', 'timeOut' : 40, 'env' : 'stg', 'BuildingSheet' : 'BuildingIndiaProject', 'BuildingTeam' : 'BTeam', 'CCPayment' : 'Payment', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6, 'CitySheet' : 'CityIndiaProject', 'CommunitySheet' : 'CommunityIndiaProject', 'CDataInput' : 'CDataInput'])
        allVariables.put('STG-CA', allVariables['default'] + ['url' : 'http://www.stg.arconline.io/', 'userName' : 'Saurav@groupten.com', 'password' : 'LEEDg10', 'timeOut' : 40, 'env' : 'stg', 'BuildingSheet' : 'CanadaBuildingProject', 'BuildingTeam' : 'BTeam', 'CCPayment' : 'Payment', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6, 'CitySheet' : 'CanadaCityProject', 'CommunitySheet' : 'CanadaCommunityProject', 'CDataInput' : 'CDataInput'])
        allVariables.put('STG-CN', allVariables['default'] + ['url' : 'http://www.stg.arconline.io/', 'userName' : 'Saurav@groupten.com', 'password' : 'LEEDg10', 'timeOut' : 40, 'env' : 'stg', 'BuildingSheet' : 'ChinaBuildingProejct', 'BuildingTeam' : 'BTeam', 'CCPayment' : 'Payment', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6, 'CitySheet' : 'ChinaCityProject', 'CommunitySheet' : 'ChinaCommunityProject', 'CDataInput' : 'CDataInput'])
        allVariables.put('STG-IND ', allVariables['default'] + ['url' : 'http://www.stg.arconline.io/', 'userName' : 'Saurav@groupten.com', 'password' : 'LEEDg10', 'timeOut' : 40, 'env' : 'stg', 'BuildingSheet' : 'BuildingIndiaProject', 'BuildingTeam' : 'BTeam', 'CCPayment' : 'Payment', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6, 'CitySheet' : 'CityIndiaProject', 'CommunitySheet' : 'CommunityIndiaProject', 'CDataInput' : 'CDataInput'])
        allVariables.put('STG-US', allVariables['default'] + ['url' : 'http://www.stg.arconline.io/', 'userName' : 'Saurav@groupten.com', 'password' : 'LEEDg10', 'timeOut' : 40, 'env' : 'stg', 'BuildingSheet' : 'USBuildingProject', 'BuildingTeam' : 'BTeam', 'CCPayment' : 'Payment', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6, 'CitySheet' : 'USCityProject', 'CommunitySheet' : 'USCommunityProject', 'CDataInput' : 'CDataInput'])
        allVariables.put('dev', allVariables['default'] + ['timeOut' : 40, 'env' : 'dev', 'url' : 'http://www.dev.arconline.io', 'userName' : 'rmishra@usgbc.org', 'password' : 'initpass', 'rowNum' : 5])
        allVariables.put('qas', allVariables['default'] + ['timeOut' : 40, 'env' : 'qas', 'url' : 'http://www.qas.arconline.io', 'userName' : 'usgbcarc@gmail.com', 'password' : 'initpass', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        StgUrl = selectedVariables['StgUrl']
        StgUserName = selectedVariables['StgUserName']
        StgPassword = selectedVariables['StgPassword']
        DelayTime = selectedVariables['DelayTime']
        TimeOut = selectedVariables['TimeOut']
        Env = selectedVariables['Env']
        QasUrl = selectedVariables['QasUrl']
        QasUserName = selectedVariables['QasUserName']
        QasPassword = selectedVariables['QasPassword']
        DevUrl = selectedVariables['DevUrl']
        DevUserName = selectedVariables['DevUserName']
        DevPassword = selectedVariables['DevPassword']
        url = selectedVariables['url']
        userName = selectedVariables['userName']
        password = selectedVariables['password']
        timeOut = selectedVariables['timeOut']
        env = selectedVariables['env']
        BuildingSheet = selectedVariables['BuildingSheet']
        BuildingTeam = selectedVariables['BuildingTeam']
        CCPayment = selectedVariables['CCPayment']
        rowNumTwo = selectedVariables['rowNumTwo']
        rowNumThree = selectedVariables['rowNumThree']
        rowNumFour = selectedVariables['rowNumFour']
        rowNumFive = selectedVariables['rowNumFive']
        rowNumSix = selectedVariables['rowNumSix']
        CitySheet = selectedVariables['CitySheet']
        CommunitySheet = selectedVariables['CommunitySheet']
        CDataInput = selectedVariables['CDataInput']
        rowNum = selectedVariables['rowNum']
        
    }
}
