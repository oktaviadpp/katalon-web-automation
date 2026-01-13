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

WebUI.scrollToElement(findTestObject('Dynamic Controls/button_menu Dynamic Controls'), 2)

WebUI.click(findTestObject('Dynamic Controls/button_menu Dynamic Controls'))

WebUI.takeFullPageScreenshot()

TestObject checkbox = findTestObject('Dynamic Controls/input_Checkbox')

TestObject loading_indicator = findTestObject('Dynamic Controls/loading_indicator')

boolean isChecked = WebUI.verifyElementChecked(checkbox, 2, FailureHandling.OPTIONAL)

if (isChecked == false) {
    WebUI.click(checkbox)

    WebUI.verifyElementChecked(checkbox, 2)

    WebUI.takeScreenshot()
}

WebUI.click(findTestObject('Dynamic Controls/button_swap Checkbox'))

WebUI.waitForElementVisible(loading_indicator, 3)

WebUI.waitForElementPresent(findTestObject('Dynamic Controls/text_message information'), 3)

WebUI.verifyElementText(findTestObject('Dynamic Controls/text_message information'), 'It\'s gone!')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Dynamic Controls/button_swap Checkbox'))

WebUI.waitForElementVisible(loading_indicator, 3)

WebUI.waitForElementPresent(findTestObject('Dynamic Controls/text_message information'), 3)

WebUI.verifyElementText(findTestObject('Dynamic Controls/text_message information'), 'It\'s back!')

WebUI.takeScreenshot()

