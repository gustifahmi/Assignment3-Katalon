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

Mobile.waitForElementPresent(findTestObject('Recent/Item 1 (Smartphone) Image'), 0)

Mobile.tap(findTestObject('Recent/Item 1 (Smartphone) Image'), 0)

Mobile.waitForElementPresent(findTestObject('Item/Button - Add To Cart'), 0)

Mobile.tap(findTestObject('Item/Button - Add To Cart'), 0)

Mobile.waitForElementPresent(findTestObject('Item/Number of Order/Input - Number Of Order'), 0)

Mobile.setText(findTestObject('Item/Number of Order/Input - Number Of Order'), '12', 0)

Mobile.tap(findTestObject('Item/Number of Order/Button - Add'), 0)

Mobile.tap(findTestObject('Item/Button - Cart'), 0)

Mobile.verifyElementNotExist(findTestObject('Cart/With Item/Text - Item 1 Name'), 5)

Mobile.closeApplication()

