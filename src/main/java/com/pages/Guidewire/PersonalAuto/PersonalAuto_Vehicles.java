package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.Utils.Selenium.Selenium_Utils_DataBase;
import com.aventstack.extentreports.ExtentTest;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables_PO;

public class PersonalAuto_Vehicles extends SeleniumWebDriver_Commands implements PersonalAuto_Vehicles_PO {
	Selenium_Utils_DataBase oDB = new Selenium_Utils_DataBase();

	public PersonalAuto_Vehicles(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public static void createVehicles() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("vehicles", strTestCaseName);
		PersonalAuto_Reusable nsr = new PersonalAuto_Reusable(driver, oExtentTest);

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Vehicles");

		GuidewireAutomate("Create Vehicle", CreateVehicle_Button, "click", "NA");

		GuidewireAutomate("VehicleDetails Tab", VE_Tab_VehicleDetails, "click", "NA");

		GuidewireAutomate_Validation("Basic Vehicle Information", VE_VD_BasicVehicleInformation, "equals",
				"Basic Vehicle Information");

		GuidewireAutomate("Vehicle Type", VE_VD_BVI_VehicleType, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("VE_VD_BVI_VehicleType"));

		String StrVIN = lhm_TestCase_Table_Data.get("VE_VD_BVI_VIN");

		if (StrVIN.equalsIgnoreCase("Random")) {
			StrVIN = "2B4FK45J3KR" + getRandomNumeric(6);
			// StrVIN = "3VW1K7AJ9CM349218";
			// StrVIN = 1+"GC"+"HC231"+"81F"+getRandomNumeric
		} else if (StrVIN.equalsIgnoreCase("vingenerator")) {
			StrVIN = nsr.getRandomVIN("vingenerator");
		} else if (StrVIN.equalsIgnoreCase("randomvin")) {
			StrVIN = nsr.getRandomVIN("randomvin");
		}

		GuidewireAutomate("Vin", VE_VD_BVI_VIN, "sendKeys", StrVIN);
		GuidewireAutomate("Body Type", VE_VD_BVI_BodyType, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("VE_VD_BVI_BodyType"));
		GuidewireAutomate("License_State", VE_VD_BVI_LicenseState, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("VE_VD_BVI_LicenseState"));

		GuidewireAutomate("Cost New", VE_VD_BVI_CostNew, "sendKeys", lhm_TestCase_Table_Data.get("VE_VD_BVI_CostNew"));
		GuidewireAutomate("Stated Value", VE_VD_BVI_StatedValue, "sendKeys",
				lhm_TestCase_Table_Data.get("VE_VD_BVI_StatedValue"));

		GuidewireAutomate("Annual Mileage", VE_VD_BVI_AnnualMileage, "sendKeys",
				lhm_TestCase_Table_Data.get("VE_VD_BVI_AnnualMileage"));

		GuidewireAutomate("Primary Use", VE_VD_BVI_PrimaryUse, "sendKeys",
				lhm_TestCase_Table_Data.get("VE_VD_BVI_PrimaryUse"));

		GuidewireAutomate_Validation("Vehicle Rate Modifiers", VE_VD_BVI_VehicleRateModifiers, "equals",
				"Vehicle Rate Modifiers");
		GuidewireAutomate("Anti-Lock Brakes Discount", VE_VD_BVI_VRM_AntiLockBrakesDiscount_No, "click",
				lhm_TestCase_Table_Data.get("VE_VD_BVI_VRM_AntiLockBrakesDiscount"));
		GuidewireAutomate("Passive Restraint System", VE_VD_BVI_VRM_PassiveRestraintSystem, "sendKeys",
				lhm_TestCase_Table_Data.get("VE_VD_BVI_VRM_PassiveRestraintSystem"));
		GuidewireAutomate("Anti Theft Discount", VE_VD_BVI_VRM_AntiTheftDiscount, "sendKeys",
				lhm_TestCase_Table_Data.get("VE_VD_BVI_VRM_AntiTheftDiscount"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void Vehicles_Edit() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("vehicles", strTestCaseName);
		PersonalAuto_Reusable nsr = new PersonalAuto_Reusable(driver, oExtentTest);

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Vehicles");

		GuidewireAutomate("Select", VehicleDetails_Select, "click", "NA");

		GuidewireAutomate("VehicleDetails Tab", VE_Tab_VehicleDetails, "click", "NA");

		GuidewireAutomate("Body Type", VE_VD_BVI_BodyType, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("VE_VD_BVI_BodyType"));

		String strVE_VD_BVI_CostNew = lhm_TestCase_Table_Data.get("VE_VD_BVI_CostNew");
		if (strVE_VD_BVI_CostNew.equalsIgnoreCase("Random")) {
			strVE_VD_BVI_CostNew = getRandomNumeric(5);
		}

		GuidewireAutomate("Cost New", VE_VD_BVI_CostNew, "clearANDsendKeys", strVE_VD_BVI_CostNew);

		String strVE_VD_BVI_AnnualMileage = lhm_TestCase_Table_Data.get("VE_VD_BVI_AnnualMileage");
		if (strVE_VD_BVI_AnnualMileage.equalsIgnoreCase("Random")) {
			strVE_VD_BVI_AnnualMileage = getRandomNumeric(5);
		}
		GuidewireAutomate("Annual Mileage", VE_VD_BVI_AnnualMileage, "clearANDsendKeys", strVE_VD_BVI_AnnualMileage);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void Vehicles_Verify() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("vehicles", strTestCaseName);
		PersonalAuto_Reusable nsr = new PersonalAuto_Reusable(driver, oExtentTest);

		GuidewireAutomate_Validation("Screen Header", PolicyCenter_Resuables_PO.Screen_Header, "equals", "Vehicles");

		GuidewireAutomate("VehicleDetails Tab", VE_Tab_VehicleDetails, "click", "NA");

		GuidewireAutomate_Validation("Vehicle Type", VE_VD_BVI_VehicleType, "FirstSelectedOptionEquals",
				lhm_TestCase_Table_Data.get("VE_VD_BVI_VehicleType"));
		GuidewireAutomate_Validation("Body Type", VE_VD_BVI_BodyType, "FirstSelectedOptionEquals",
				lhm_TestCase_Table_Data.get("VE_VD_BVI_BodyType"));
		GuidewireAutomate_Validation("Passive Restraint System", VE_VD_BVI_VRM_PassiveRestraintSystem,
				"FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("VE_VD_BVI_VRM_PassiveRestraintSystem"));
		GuidewireAutomate_Validation("Anti Theft Discount", VE_VD_BVI_VRM_AntiTheftDiscount,
				"FirstSelectedOptionEquals", lhm_TestCase_Table_Data.get("VE_VD_BVI_VRM_AntiTheftDiscount"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void assignDriver() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("vehicles", strTestCaseName);

		GuidewireAutomate_Validation("Assign Drivers to Vehicles", VE_AssignDriverstoVehicles, "equals",
				"Assign Drivers to Vehicles");
		GuidewireAutomate_Validation("What percentage does each driver use this vehicle?",
				VE_ADV_Percentageeachdriverusethisvehicle, "equals",
				"What percentage does each driver use this vehicle?");

		GuidewireAutomate("Add", VE_ADV_Add_Button, "click", "");

		By VE_ADV_Driver = By.xpath(
				"//div[@class='gw-subMenu gw-open']//div[contains(@id,'DriverPctLV_tb-AddDriver') and contains(@class,'gw-AddMenuItemWidget')]//div[@class='gw-label' and text()='"
						+ strAccountName + "']");
		GuidewireAutomate("Driver " + strAccountName, VE_ADV_Driver, "click",
				lhm_TestCase_Table_Data.get("VE_ADV_Driver"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();

	}

	public static void additionalInterest_Add_NewCompany() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("vehicles", strTestCaseName);

		GuidewireAutomate("Additional Interest", VE_Tab_AdditionalInterest, "click", "NA");
		GuidewireAutomate_Validation("Personal Vehicle Additional Interests", VE_AI_PersonalVehicleAdditionalInterests,
				"equals", "Personal Vehicle Additional Interests");
		GuidewireAutomate("Add", VE_AI_PVAI_Add_Button, "click", "NA");
		GuidewireAutomate("NewCompany", VE_AI_PVAI_Add_NewCompany, "click", "NA");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void additionalInterest_Add_NewPerson() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("vehicles", strTestCaseName);

		GuidewireAutomate("Additional Interest", VE_Tab_AdditionalInterest, "click", "NA");
		GuidewireAutomate_Validation("Personal Vehicle Additional Interests", VE_AI_PersonalVehicleAdditionalInterests,
				"equals", "Personal Vehicle Additional Interests");
		GuidewireAutomate("Add", VE_AI_PVAI_Add_Button, "click", "NA");
		GuidewireAutomate("NewPerson", VE_AI_PVAI_Add_NewPerson, "click", "NA");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void additionalInterest_Add_FromAddressBook() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("vehicles", strTestCaseName);

		GuidewireAutomate("Additional Interest", VE_Tab_AdditionalInterest, "click", "NA");
		GuidewireAutomate_Validation("Personal Vehicle Additional Interests", VE_AI_PersonalVehicleAdditionalInterests,
				"equals", "Personal Vehicle Additional Interests");
		GuidewireAutomate("Add", VE_AI_PVAI_Add_Button, "click", "NA");
		GuidewireAutomate("FromAddressBook", VE_AI_PVAI_Add_FromAddressBook, "click", "NA");

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void additionalInterest_Add_ExistingAdditionalInterest() throws Throwable {
		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("vehicles", strTestCaseName);

		GuidewireAutomate("Additional Interest", VE_Tab_AdditionalInterest, "click", "NA");
		GuidewireAutomate_Validation("Personal Vehicle Additional Interests", VE_AI_PersonalVehicleAdditionalInterests,
				"equals", "Personal Vehicle Additional Interests");

		GuidewireAutomate("Add", VE_AI_PVAI_Add_Button, "click", "NA");
		GuidewireAutomate("ExistingAdditionalInteres", VE_AI_PVAI_Add_ExistingAdditionalInterest, "moveToElement",
				"NA");

		// Hande Dynamic Element - Click Existing
		if (lhm_TestCase_Table_Data.get("VE_AI_PVAI_Name").contains("refer")) {
			strAccountName = lhm_TestCase_Data.get("PrimaryNI_Name");
		} else {
			strAccountName = lhm_TestCase_Table_Data.get("VE_AI_PVAI_Name");
		}

		By DR_DriversDetails_Add_ExistingAdditionalInterest_Name = By.xpath(
				"//div[@class='gw-subMenu gw-open']//div[contains(@id,'ExistingAdditionalInterest-AddDriver') and contains(@class,'gw-AddMenuItemWidget')]//div[@class='gw-label' and text()='"
						+ strAccountName + "']");
		GuidewireAutomate("ExistingAdditionalInterest_Name" + strAccountName,
				DR_DriversDetails_Add_ExistingAdditionalInterest_Name, "click", strAccountName);
		// Hande Dynamic Element - Click Existing - Completed

		GuidewireAutomate("Additional Interest Select", VE_AI_PVAI_Select, "click", "NA");
		GuidewireAutomate_Validation("Additional Interest Name", VE_AI_PVAI_Name, "equals", "NA");
		GuidewireAutomate("Additional Interest IntrestType", VE_AI_PVAI_IntrestType, "selectByVisibleText",
				lhm_TestCase_Table_Data.get("VE_AI_PVAI_IntrestType"));
		GuidewireAutomate("Additional Interest Certificate Required", VE_AI_PVAI_CertificateReq, "click",
				lhm_TestCase_Table_Data.get("CertificateReq"));
		GuidewireAutomate("Additional Interest ContractNo", VE_AI_PVAI_ContractNo, "sendKeys",
				lhm_TestCase_Table_Data.get("VE_AI_PVAI_ContractNo"));

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void vehicle_Remove() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("vehicles", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void garage_NewLocation() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("vehicles", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void garage_EditLocation() throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("vehicles", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

	public static void searchtable(By Locator, String CellValue) throws Throwable {

		lhm_TestCase_Table_Data = Selenium_Utils_DataBase.getData_MSExcel_WorkSheet_Fillo("vehicles", strTestCaseName);

		lhm_TestCase_Data.putAll(lhm_TestCase_Table_Data);
		lhm_TestCase_Table_Data.clear();
	}

}
