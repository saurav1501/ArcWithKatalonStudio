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
     * <p>Profile dev : Explicit Wait Timeout
Profile qas : Explicit Wait Timeout
Profile stg : Explicit Wait Timeout</p>
     */
    public static Object timeOut
     
    /**
     * <p></p>
     */
    public static Object env
     
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
     * <p></p>
     */
    public static Object rowNum
     
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
     * <p>Profile stg : Adding US projects</p>
     */
    public static Object BuildingSheet
     
    /**
     * <p>Profile stg : Adding new team member </p>
     */
    public static Object BuildingTeam
     
    /**
     * <p>Profile stg : Adding Credit Card payment details </p>
     */
    public static Object CCPayment
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['StgUrl' : 'http://www.stg.arconline.io/', 'StgUserName' : 'Saurav@groupten.com', 'StgPassword' : 'LEEDg10', 'DelayTime' : 3, 'TimeOut' : 40, 'Env' : 'qas', 'QasUrl' : 'http://www.qas.arconline.io', 'QasUserName' : 'usgbcarc@gmail.com', 'QasPassword' : 'initpass', 'DevUrl' : 'http://www.dev.arconline.io', 'DevUserName' : 'rmishra@usgbc.org', 'DevPassword' : 'initpass'])
        allVariables.put('dev', allVariables['default'] + ['timeOut' : 40, 'env' : 'dev', 'url' : 'http://www.dev.arconline.io', 'userName' : 'rmishra@usgbc.org', 'password' : 'initpass', 'rowNum' : 5])
        allVariables.put('qas', allVariables['default'] + ['timeOut' : 40, 'env' : 'qas', 'url' : 'http://www.qas.arconline.io', 'userName' : 'usgbcarc@gmail.com', 'password' : 'initpass', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6])
        allVariables.put('stg', allVariables['default'] + ['url' : 'http://www.stg.arconline.io/', 'userName' : 'Saurav@groupten.com', 'password' : 'LEEDg10', 'timeOut' : 40, 'env' : 'stg', 'BuildingSheet' : 'NewBuildingProject', 'BuildingTeam' : 'BTeam', 'CCPayment' : 'Payment', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6])
        
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
        timeOut = selectedVariables['timeOut']
        env = selectedVariables['env']
        url = selectedVariables['url']
        userName = selectedVariables['userName']
        password = selectedVariables['password']
        rowNum = selectedVariables['rowNum']
        rowNumTwo = selectedVariables['rowNumTwo']
        rowNumThree = selectedVariables['rowNumThree']
        rowNumFour = selectedVariables['rowNumFour']
        rowNumFive = selectedVariables['rowNumFive']
        rowNumSix = selectedVariables['rowNumSix']
        BuildingSheet = selectedVariables['BuildingSheet']
        BuildingTeam = selectedVariables['BuildingTeam']
        CCPayment = selectedVariables['CCPayment']
        
    }
}
