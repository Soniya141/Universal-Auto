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

WebUI.callTestCase(findTestCase('Universal/Login/TC-1 Login with Moviestar'), [('Email') : 'testing12345@yopmail.com', ('Pswrd') : '3TL@testing'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Universal Staging/a_Rewards'))


WebUI.waitForPageLoad(2)


//WebElement.delay(5)//headless
WebUI.scrollToElement(findTestObject('Object Repository/Universal Staging/div_Show All'), 4)

WebUI.click(findTestObject('Object Repository/Universal Staging/div_Show All'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Universal Staging/span_Physical'))

WebUI.scrollToPosition(99999, 99999, FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyTextPresent(short_des, true, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.navigateToUrl((url + reward_cat) + behavior_id)

    WebUI.delay(5)
	
	
	result = WebUI.getText(findTestObject('Object Repository/Universal Staging/Get movie name'))
		System.out.println(result)
		WebUI.scrollToPosition(999, 999, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Universal Staging/Redeem Now button'))
		if (WebUI.verifyTextPresent(popup_message, false, FailureHandling.STOP_ON_FAILURE)) {
			System.out.println("Already reedemed")
		}
		else {
			System.out.println("Successfully reedemed")
			WebUI.takeFullPageScreenshot()
			WebUI.closeBrowser()
		}
} else {
    WebUI.closeBrowser()
	System.out.println("Your testcase has been failed")
}



WebUI.closeBrowser()

