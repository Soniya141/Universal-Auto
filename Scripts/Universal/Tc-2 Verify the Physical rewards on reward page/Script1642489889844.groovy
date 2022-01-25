import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Universal/Login/TC-3 Login with Director'), [('Email') : 'test3004@yopmail.com', ('Pswrd') : '3tl@testing'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Universal Staging/a_Rewards'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Universal Staging/a_Rewards'))



WebUI.waitForPageLoad(2)
if (WebUI.verifyElementPresent(findTestObject('Object Repository/demo/Page_Universal All-Access Rewards  Get Rewa_700d57/mat-icon_close'),
	0)) {

WebUI.click(findTestObject('Object Repository/demo/Page_Universal All-Access Rewards  Get Rewa_700d57/mat-icon_close'))
}




WebUI.scrollToElement(findTestObject('Object Repository/Universal Staging/div_Show All'), 4)

WebUI.click(findTestObject('Object Repository/Universal Staging/div_Show All'))

//WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Universal Staging/span_Physical'))

WebUI.scrollToPosition(9999, 9999, FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyTextPresent(short_des, true, FailureHandling.STOP_ON_FAILURE)) {
    WebUI.navigateToUrl((url + reward_cat) + behavior_id)

    //WebUI.waitForElementPresent(findTestObject('Object Repository/Universal Staging/Physical reward image'), 0)
    //WebUI.verifyImagePresent(findTestObject('Object Repository/Universal Staging/Reward next page image'), FailureHandling.STOP_ON_FAILURE) //WebUI.delay(5)
    //WebUI.click(findTestObject('Object Repository/Universal Staging/Redeem Now button click'), FailureHandling.STOP_ON_FAILURE)

    result = WebUI.getText(findTestObject('Object Repository/Universal Staging/Movie name display'))

    System.out.println(result)
	WebUI.click(findTestObject("Object Repository/Universal Staging/Redeem Now buttonn"), FailureHandling.STOP_ON_FAILURE)
}
else {
    WebUI.closeBrowser()
}


WebUI.takeScreenshot('/home/knoldus/Katalon Studio/Physical reward.png')

WebUI.closeBrowser()

