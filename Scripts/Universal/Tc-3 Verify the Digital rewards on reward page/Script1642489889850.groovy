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

WebUI.callTestCase(findTestCase('Universal/Login/TC-2 Login with Screenwriter'), [('Email') : 'ankit248@yopmail.com', ('Pswrd') : '3TL@testing'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/Reward page/Page_Universal All-Access Rewards  Get Rewa_700d57/a_Rewards'))

WebUI.scrollToElement(findTestObject('Object Repository/Reward page/Page_Universal All-Access Rewards  Get Rewa_700d57/div_Show All'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Reward page/Page_Universal All-Access Rewards  Get Rewa_700d57/div_Show All'))

WebUI.click(findTestObject('Object Repository/Reward page/Page_Universal All-Access Rewards  Get Rewa_700d57/span_Digital'))

WebUI.scrollToPosition(999, 999, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Reward page/Page_Universal All-Access Rewards  Get Rewa_700d57/div_1K PointsBeethovens Big BreakDigital Mo_cf5511'))

WebUI.takeScreenshot()

WebUI.delay(3)

if (WebUI.verifyTextPresent(Title, true, FailureHandling.CONTINUE_ON_FAILURE)) {
    if (WebUI.verifyTextPresent(Short_des, true, FailureHandling.CONTINUE_ON_FAILURE)) {
        
        WebUI.navigateToUrl('https://universal.3tlstaging.com/reward-preview/' + behavior_id)
		result = WebUI.getText(findTestObject('Object Repository/Universal Staging/Get movie name'))
		System.out.println("Movie Name is"  +result)
		WebUI.scrollToPosition(999, 999, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Universal Staging/Redeem Now button'))
		if (WebUI.verifyTextPresent(popup_message, false, FailureHandling.STOP_ON_FAILURE)) {
			System.out.println("Already reedemed")
			WebUI.takeFullPageScreenshot()
			WebUI.closeBrowser()
		}
		else {
			System.out.println("Successfully reedemed")
			WebUI.closeBrowser()
		}
       
		
    }
}

WebUI.closeBrowser()