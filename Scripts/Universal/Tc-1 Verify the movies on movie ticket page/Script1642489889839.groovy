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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
System.setProperty("webdriver.chrome.driver", "/home/knoldus/Desktop/chromedriver_linux64/chromedriver");
ChromeOptions options =new ChromeOptions()

options.addArguments("start_maximized")
options.addArguments("disable-infobars")
options.addArguments("disable-extensions")
options.addArguments("--headless")
options.addArguments("--window-size=1920,1080")
//options.addArguments("--window-size=1920,1080","--disable-gpu", "--disable-extensions", "--no-sandbox", "-incognito")
WebUI.callTestCase(findTestCase('Universal/Login/TC-1 Login with Moviestar'), [('Email') : 'testing12345@yopmail.com', ('Pswrd') : '3TL@testing'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Object Repository/Universal Staging/a_Validate Purchase'))

WebUI.click(findTestObject('Object Repository/Universal Staging/a_Movie Ticket'))

//WebUI.click(findTestObject('Object Repository/demo/Page_Universal All-Access Rewards  Get Rewa_700d57/a_Validate Purchase'))
//WebUI.scrollToElement(findTestObject('Object Repository/demo/Page_Universal All-Access Rewards  Get Rewa_700d57/img_Regal Movie Tickets Eligible for Points_debac9', 0, FailureHandling.CONTINUE_ON_FAILURE))
//WebUI.click(findTestObject('Object Repository/demo/Page_Universal All-Access Rewards  Get Rewa_700d57/img_Regal Movie Tickets Eligible for Points_debac9'))
WebUI.scrollToPosition(999, 999, FailureHandling.STOP_ON_FAILURE)


WebUI.delay(5)
//ist listofelements = WebUI.findWebElements(findTestObject('Object Repository/Universal Staging/Movies images'))
//for(int i=0;i<listofelements.size();i++)
WebUI.verifyElementPresent(findTestObject('Object Repository/Universal Staging/Movies images'), 0, FailureHandling.CONTINUE_ON_FAILURE)

//boolean flag= WebUI.verifyElementPresent(findTestObject('',20,FailureHandling.CONTINUE_ON_FAILURE))
	
	result=WebUI.getText(findTestObject('Object Repository/Universal Staging/Movies images'))
	for(int i=0; i<=result;i++)
		
	{
	System.out.println(i)
	}

//WebUI.verify(findTestObject('Object Repository/demo/Page_Universal All-Access Rewards  Get Rewa_700d57/img_Regal Movie Tickets Eligible for Points_debac9'), 0)
//WebUI.takeElementScreenshot(findTestObject('Object Repository/demo/Page_Universal All-Access Rewards  Get Rewa_700d57/img_Regal Movie Tickets Eligible for Points_debac9'), '/home/knoldus/Katalon Studio/h.png', FailureHandling.STOP_ON_FAILURE)
WebUI.takeScreenshot('/home/knoldus/Katalon Studio/hm.png')

