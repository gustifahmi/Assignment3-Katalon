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

Mobile.waitForElementPresent(findTestObject('Recent/Button - Profile'), 0)

Mobile.tap(findTestObject('Recent/Button - Profile'), 0)

Mobile.waitForElementPresent(findTestObject('Profile/Button - Edit Button'), 0)

Mobile.tap(findTestObject('Profile/Button - Edit Button'), 0)

Mobile.waitForElementPresent(findTestObject('Edit Profile/Text - Profile'), 0)

Mobile.tap(findTestObject('Edit Profile/Field - Name'), 0)

Mobile.setText(findTestObject('Edit Profile/Input Name/Input - Name'), name, 0)

Mobile.tap(findTestObject('Edit Profile/Input Name/Button - OK'), 0)

Mobile.verifyElementNotVisible(findTestObject('Edit Profile/Alert - Invalid Name Input'), 3)

Mobile.tap(findTestObject('Edit Profile/Field - Email'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Edit Profile/Input Email/Input - Email'), email, 0)

Mobile.tap(findTestObject('Edit Profile/Input Email/Button - OK'), 0)

Mobile.verifyElementNotVisible(findTestObject('Edit Profile/Alert - Invalid Email Input'), 3)

Mobile.tap(findTestObject('Edit Profile/Field - Phone Number'), 0)

Mobile.setText(findTestObject('Edit Profile/Input Phone Number/Input - Phone number'), phone_number, 0)

Mobile.tap(findTestObject('Edit Profile/Input Phone Number/Button - OK'), 0)

Mobile.verifyElementNotVisible(findTestObject('Edit Profile/Alert - Invalid Phone Input'), 3)

Mobile.tap(findTestObject('Edit Profile/Field - Address'), 0)

Mobile.setText(findTestObject('Edit Profile/Input Address/Input - Address'), address, 0)

Mobile.tap(findTestObject('Edit Profile/Input Address/Button - OK'), 0)

Mobile.verifyElementNotVisible(findTestObject('Edit Profile/Alert - Invalid Address Input'), 3)

Mobile.tap(findTestObject('Edit Profile/Button - Back'), 0)

Mobile.waitForElementPresent(findTestObject('Profile/Text - Name'), 0)

Mobile.verifyElementText(findTestObject('Profile/Text - Name'), name)

Mobile.verifyElementText(findTestObject('Profile/Text - Email'), email)

Mobile.verifyElementText(findTestObject('Profile/Text - Phone Number'), phone_number)

Mobile.verifyElementText(findTestObject('Profile/Text - Address'), address)

Mobile.closeApplication()

