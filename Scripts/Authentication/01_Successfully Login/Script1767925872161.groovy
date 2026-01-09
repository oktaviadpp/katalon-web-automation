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

WebUI.callTestCase(findTestCase('Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Authentication/button_Form Authentication'), 3)

WebUI.click(findTestObject('Authentication/button_Form Authentication'))

WebUI.waitForElementPresent(findTestObject('Authentication/button_login'), 3)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Authentication/input_username'), 'tomsmith')

WebUI.setEncryptedText(findTestObject('Authentication/input_password'), 'T6bVo8B8lVC7U1u1L64B7tu+ltX9y9HI')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Authentication/button_login'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Authentication/alert_messages'), 3)

WebUI.verifyTextPresent('logged into a secure area', true)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Authentication/button_Logout'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Authentication/button_login'), 3)

WebUI.takeScreenshot()

WebUI.refresh()

