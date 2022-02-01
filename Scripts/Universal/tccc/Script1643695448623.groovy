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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://universal.3tlstaging.com/home')

WebUI.click(findTestObject('Object Repository/tccc/Page_Universal All-Access Rewards  Get Rewa_700d57/a_Register  Login'))

WebUI.setText(findTestObject('Object Repository/tccc/Page_Universal All-Access Rewards  Get Rewa_700d57/input_USERNAME OR EMAIL_mat-input-0'), 
    'soniatest@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/tccc/Page_Universal All-Access Rewards  Get Rewa_700d57/input_PASSWORD_mat-input-1'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/tccc/Page_Universal All-Access Rewards  Get Rewa_700d57/button_Login'))

WebUI.click(findTestObject('Object Repository/tccc/Page_Universal All-Access Rewards  Get Rewa_700d57/a_Rewards'))

WebUI.verifyElementPresent(findTestObject('Object Repository/tccc/Page_Universal All-Access Rewards  Get Rewa_700d57/div_Check out Kicking and ScreamingDont mis_832242'), 
    0)

if(WebUI.verifyElementPresent(findTestObject('Object Repository/tccc/Page_Universal All-Access Rewards  Get Rewa_700d57/mat-dialog-container_close Check out Kickin_e994b6'), 
    0))

WebUI.verifyElementText(findTestObject('Object Repository/tccc/Page_Universal All-Access Rewards  Get Rewa_700d57/mat-icon_close'), 
    'close')

