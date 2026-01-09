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

WebUI.callTestCase(findTestCase('Open Browser'), [:], FailureHandling.STOP_ON_FAILURE) // Final verification

WebUI.click(findTestObject('Checkboxes/button_Menu Checkboxes'))

TestObject checkbox_1 = findTestObject('Checkboxes/checkbox_1')
TestObject checkbox_2 = findTestObject('Checkboxes/checkbox_2')
boolean isChecked_1 = WebUI.verifyElementChecked(checkbox_1, 2, FailureHandling.OPTIONAL)
boolean isChecked_2 = WebUI.verifyElementChecked(checkbox_2, 2, FailureHandling.OPTIONAL)

if (isChecked_1 == false) {
    WebUI.click(checkbox_1)
	WebUI.verifyElementChecked(checkbox_1, 2)
}

if (isChecked_2 == true) {
	WebUI.click(checkbox_2)	
	WebUI.verifyElementNotChecked(checkbox_2, 2)
}