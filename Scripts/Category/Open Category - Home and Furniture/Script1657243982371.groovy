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

Mobile.waitForElementPresent(findTestObject('Category/Category - Home and Furniture'), 0)

Mobile.tap(findTestObject('Category/Category - Home and Furniture'), 0)

Mobile.waitForElementPresent(findTestObject('Category/Home and Furniture/Image - Item 1'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Home and Furniture/Image - Item 1'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Home and Furniture/Image - Item 2'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Home and Furniture/Image - Item 3'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Home and Furniture/Image - Item 4'), 0)

Mobile.verifyElementVisible(findTestObject('Category/Home and Furniture/Image - Item 5'), 0)

Mobile.verifyElementText(findTestObject('Category/Home and Furniture/Text - Item 1 Name'), 'Bathroom Toilet Wall Shelves A289')

Mobile.verifyElementText(findTestObject('Category/Home and Furniture/Text - Item 1 Price'), '8 USD')

Mobile.verifyElementText(findTestObject('Category/Home and Furniture/Text - Item 2 Name'), 'Copper Light 3 Battery Warm White - Fairy Light Battery ')

Mobile.verifyElementText(findTestObject('Category/Home and Furniture/Text - Item 2 Price'), '9 USD')

Mobile.verifyElementText(findTestObject('Category/Home and Furniture/Text - Item 3 Name'), 'Bed Mosquito Net KL200 | 200 x 200 cm')

Mobile.verifyElementText(findTestObject('Category/Home and Furniture/Text - Item 3 Price'), '19 USD')

Mobile.verifyElementText(findTestObject('Category/Home and Furniture/Text - Item 4 Name'), 'Robot Vacuum Cleaner Wellcomm Home 2.0')

Mobile.verifyElementText(findTestObject('Category/Home and Furniture/Text - Item 4 Price'), '250 USD')

Mobile.scrollToText('Multifunction Stand Hanger', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Category/Home and Furniture/Text - Item 5 Name'), 'Multifunction Stand Hanger')

Mobile.verifyElementText(findTestObject('Category/Home and Furniture/Text - Item 5 Price'), '12 USD')

Mobile.closeApplication()

