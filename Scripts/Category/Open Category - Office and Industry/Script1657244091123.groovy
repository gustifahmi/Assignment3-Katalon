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

Mobile.startApplication('C:\\Users\\095059\\Documents\\BTDP-Katalon\\Assignment3\\apk\\ECommerce -SAMPLE-Android.apk', true)

Mobile.waitForElementPresent(findTestObject('Recent/Button - Category'), 0)

Mobile.tap(findTestObject('Recent/Button - Category'), 0)

Mobile.waitForElementPresent(findTestObject('Category/Category - Office and Industry'), 0)

Mobile.tap(findTestObject('Category/Category - Office and Industry'), 0)

Mobile.waitForElementPresent(findTestObject('Category/Office and Industry/Image - Item 1'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Office and Industry/Image - Item 1'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Office and Industry/Image - Item 2'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Office and Industry/Image - Item 3'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Office and Industry/Image - Item 4'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Office and Industry/Image - Item 5'), 0)

Mobile.verifyElementText(findTestObject('Category/Office and Industry/Text - Item 1 Name'), 'Winsor & Newton Designers Gouache - Introductory Set')

Mobile.verifyElementText(findTestObject('Category/Office and Industry/Text - Item 1 Price'), '45 USD')

Mobile.verifyElementText(findTestObject('Category/Office and Industry/Text - Item 2 Name'), 'Money Counter Kozure MC-101')

Mobile.verifyElementText(findTestObject('Category/Office and Industry/Text - Item 2 Price'), '150 USD')

Mobile.verifyElementText(findTestObject('Category/Office and Industry/Text - Item 3 Name'), 'Scientific Calculator - Doraemon 350 MS')

Mobile.verifyElementText(findTestObject('Category/Office and Industry/Text - Item 3 Price'), '12 USD')

Mobile.verifyElementText(findTestObject('Category/Office and Industry/Text - Item 4 Name'), 'ID Card holder / Name Tag Holder / Tempat ID Card - UHOO 6616')

Mobile.verifyElementText(findTestObject('Category/Office and Industry/Text - Item 4 Price'), '5 USD')

Mobile.scrollToText('Pena Pilot Frixion Cliker 0.5mm - Blue', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Category/Office and Industry/Text - Item 5 Name'), 'Pena Pilot Frixion Cliker 0.5mm - Blue')

Mobile.verifyElementText(findTestObject('Category/Office and Industry/Text - Item 5 Price'), '20 USD')

Mobile.closeApplication()

