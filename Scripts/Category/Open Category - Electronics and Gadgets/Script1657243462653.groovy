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

Mobile.waitForElementPresent(findTestObject('Category/Text - Category'), 0)

Mobile.tap(findTestObject('Category/Category - Electronics and Gadgets'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Electronics and Gadgets/Text - Electronics and Gadgets'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Electronics and Gadgets/Image - Item 1'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Electronics and Gadgets/Image - Item 2'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Electronics and Gadgets/Image - Item 3'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Electronics and Gadgets/Image - Item 4'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Electronics and Gadgets/Image - Item 5'), 0)

Mobile.verifyElementText(findTestObject('Category/Electronics and Gadgets/Text - Item 1 Name'), 'Samsung Galaxy S10 - Black')

Mobile.verifyElementText(findTestObject('Category/Electronics and Gadgets/Text - Item 1 Price'), '899 USD')

Mobile.verifyElementText(findTestObject('Category/Electronics and Gadgets/Text - Item 2 Name'), 'U17 USB Portable M3 HUmidifier Air Purifier LED Night Light 200ML')

Mobile.verifyElementText(findTestObject('Category/Electronics and Gadgets/Text - Item 2 Price'), '20 USD')

Mobile.verifyElementText(findTestObject('Category/Electronics and Gadgets/Text - Item 3 Name'), 'Apple watch series 3 GPS 42mm Black')

Mobile.verifyElementText(findTestObject('Category/Electronics and Gadgets/Text - Item 3 Price'), '400 USD')

Mobile.verifyElementText(findTestObject('Category/Electronics and Gadgets/Text - Item 4 Name'), 'Mini Digital Speaker TD-V26 USB FM Radio SD TF Card MP3 - Red')

Mobile.verifyElementText(findTestObject('Category/Electronics and Gadgets/Text - Item 4 Price'), '19 USD')

Mobile.scrollToText('LED TV 43 Inch Smart TV TCL 43E3 UHD 4K Dolby Sound', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Category/Electronics and Gadgets/Text - Item 5 Name'), 'LED TV 43 Inch Smart TV TCL 43E3 UHD 4K Dolby Sound')

Mobile.verifyElementText(findTestObject('Category/Electronics and Gadgets/Text - Item 5 Price'), '375 USD')

Mobile.closeApplication()

