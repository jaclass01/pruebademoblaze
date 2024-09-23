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
import com.github.javafaker.Faker

WebUI.callTestCase(findTestCase('addtocart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Cart'))

WebUI.navigateToUrl('https://demoblaze.com/cart.html')

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Place Order'))

Faker name = new Faker(); 

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Name_name'), name.name().firstName())

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Country_country'), name.country().name())

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_City_city'), name.country().capital())

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Credit card_card'), name.finance().creditCard())

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Month_month'), '03')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Year_year'), '2025')

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Purchase'))

WebUI.click(findTestObject('Object Repository/Page_STORE/button_OK'))

WebUI.closeBrowser()

