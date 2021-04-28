package com.pages.Guidewire;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Utils.Selenium.SeleniumWebDriver_Commands;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class GW_TabNavigation_CM_PC_BC_CC extends SeleniumWebDriver_Commands
		implements GW_TabNavigation_CM_PC_BC_CC_PO {

	public GW_TabNavigation_CM_PC_BC_CC(WebDriver driver, ExtentTest oExtentTest) {
		super(driver, oExtentTest);
	}

	public void navigate_ClaimTab() throws Throwable {

	}
	/*
	 * -------------------------------------------------------------- menuNavigation
	 * --------------------------------------------------------------
	 */

	@Override
	public void gwContactManagement_TabNavigation(String Tab, String Value) throws Throwable {
		switch (Tab) {

		case "x":
			break;

		case "y":
			break;

		case "z":
			break;

		default:
			oExtentTest.addScreenCaptureFromPath(
					SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
			oExtentTest.log(Status.INFO, "Navigation to " + Tab + " is succesful");
			break;
		}
	}

	@Override
	public void gwContactManagement_MenuNavigation(String Menu) throws Throwable {
		switch (Menu) {

		case "x":
			break;

		case "y":
			break;

		case "z":
			break;

		default:
			oExtentTest.addScreenCaptureFromPath(
					SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
			oExtentTest.log(Status.INFO, "Navigation to " + Menu + " is succesful");
			break;
		}
	}

	@Override
	public void gwPolicyCenter_TabNavigation(String Tab, String Value) throws Throwable {
		switch (Tab) {
		case "New Account":
			GuidewireAutomate("Account", Tab_Account_dd, "click", "Null");
			GuidewireAutomate("NewAccount", AccountTab_NewAccount, "click", "Null");
			GuidewireAutomate_waitForElement(EnterAccountInformation, "visibilityOf", "true");
			Assert.assertEquals(getText_Element(EnterAccountInformation), "Enter Account Information");
			break;
		case "Acct Search":
			GuidewireAutomate("Account", Tab_Account_dd, "click", "Null");
			GuidewireAutomate("Account Number", AccountTab_AccountNumber, "sendkeys", Value);
			GuidewireAutomate("Account Search", AccountTab_AccountNumberSearch, "click", "Null");
			break;
		case "New Submission":
			GuidewireAutomate("PolicyTab", Tab_Policy_dd, "click", "Null");
			GuidewireAutomate("PolicyTab_NewSubmission", PolicyTab_NewSubmission, "click", "Null");
			GuidewireAutomate_waitForElement(Screen_Header, "visibilityOf", "true");
			Assert.assertEquals(getText_Element(Screen_Header), "New Submissions");
			break;
		case "Sub Search":
			GuidewireAutomate("Policy", Tab_Policy_dd, "click", "Null");
			GuidewireAutomate("Sub Number", PolicyTab_SubNumber, "sendkeys", Value);
			GuidewireAutomate("Sub Search", PolicyTab_SubSearch, "click", "Null");
			break;
		case "Policy Search":
			GuidewireAutomate("Policy", Tab_Policy_dd, "click", "Null");
			GuidewireAutomate("Sub Number", PolicyTab_PolicyNumber, "sendkeys", Value);
			GuidewireAutomate("Sub Search", PolicyTab_PolicyNumberSearch, "click", "Null");
			break;
		case "New Contact":
			GuidewireAutomate("ContactsTab", Tab_Search_dd, "click", "Null");
			GuidewireAutomate("ContactsTab_NewContacts", ContactsTab_NewContacts, "moveToElement", "Null");
			GuidewireAutomate("ContactsTab NewContacts Company", ContactsTab_NewContacts_Company, "click", "Null");
			break;

		case "Contact Search":
			GuidewireAutomate("ContactsTab_Search", ContactsTab_Search, "click", "Null");

			break;

		case "Policies":
			GuidewireAutomate("SearchTab", Tab_Search_dd, "click", "Null");
			GuidewireAutomate("SearchTab_Policies", SearchTab_Policies, "click", "Null");
			break;

		case "Accounts":
			GuidewireAutomate("SearchTab", Tab_Search_dd, "click", "Null");
			GuidewireAutomate("SearchTab_Accounts", SearchTab_Accounts, "click", "Null");
			break;

		case "Producer Codes":
			GuidewireAutomate("SearchTab", Tab_Search_dd, "click", "Null");
			GuidewireAutomate("SearchTab_ProducerCodes", SearchTab_ProducerCodes, "click", "Null");
			break;

		case "Activities":
			GuidewireAutomate("SearchTab", Tab_Search_dd, "click", "Null");
			GuidewireAutomate("SearchTab_Activities", SearchTab_Activities, "click", "Null");
			break;

		case "Contacts":
			GuidewireAutomate("SearchTab", Tab_Search_dd, "click", "Null");
			GuidewireAutomate("SearchTab_Contacts", SearchTab_Contacts, "click", "Null");
			break;
		case "Team":
			GuidewireAutomate("AdministrationTab", Tab_Administration_dd, "click", "Null");
			break;
		case "Users_and_Security":
			GuidewireAutomate("AdministrationTab", Tab_Administration_dd, "click", "Null");
			GuidewireAutomate("Users_and_Security", AdministrationTab_Users_and_Security, "click", "Null");
			break;

		case "Business Settings":
			GuidewireAutomate("AdministrationTab", Tab_Administration_dd, "click", "Null");
			GuidewireAutomate("Business_Settings", AdministrationTab_Business_Settings, "click", "Null");
			break;
		case "Monitoring":
			GuidewireAutomate("AdministrationTab", Tab_Administration_dd, "click", "Null");
			GuidewireAutomate("Monitoring", AdministrationTab_Monitoring, "click", "Null");
			break;
		case "Utilities":
			GuidewireAutomate("AdministrationTab", Tab_Administration_dd, "click", "Null");
			GuidewireAutomate("Utilities", AdministrationTab_Utilities, "click", "Null");
			break;

		default:
			oExtentTest.addScreenCaptureFromPath(
					SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
			oExtentTest.log(Status.INFO, "Navigation to " + Tab + " is succesful");
			break;
		}
	}

	@Override
	public void gwPolicyCenter_MenuNavigation(String Menu) throws Throwable {
		switch (Menu) {
		case "New Account":
			GuidewireAutomate("Actions", Menu_Actions, "click", "");
			GuidewireAutomate("NewAccount", Actions_NewAccount, "click", "Null");
			GuidewireAutomate_waitForElement(EnterAccountInformation, "visibilityOf", "true");
			Assert.assertEquals(getText_Element(EnterAccountInformation), "Enter Account Information");
			break;
		case "New Policy":
			GuidewireAutomate("Actions", Menu_Actions, "click", "");
			GuidewireAutomate("NewPolicy", Actions_NewPolicy, "click", "");
			break;
		case "New Submission":
			GuidewireAutomate_Validation("Account Summary", AccountSummary_Name, "contains", "Account Summary");
			GuidewireAutomate("Actions", Menu_Actions, "click", "");
			GuidewireAutomate("NewSubmission", Actions_NewSubmission, "click", "");
			GuidewireAutomate_waitForElement(NewSubmission_Header, "visibilityOf", "true");
			Assert.assertEquals(getText_Element(NewSubmission_Header), "New Submissions");

			break;
		case "Summary":
			GuidewireAutomate("My_Summary", My_Summary, "click", "");
			break;
		case "My Activities":
			GuidewireAutomate("My_Activities", My_Activities, "click", "");
			break;
		case "My Accounts":
			GuidewireAutomate("My_Accounts", My_Accounts, "click", "");
			break;
		case "My Submissions":
			GuidewireAutomate("My_Submissions", My_Submissions, "click", "");
			break;
		case "My Renewals":
			GuidewireAutomate("My_Renewals", My_Renewals, "click", "");
			break;
		case "Other Policy Transactions":
			GuidewireAutomate("Other_Policy_Transactions", Other_Policy_Transactions, "click", "");
			break;
		case "My Queues":
			GuidewireAutomate("My_Queues", My_Queues, "click", "");
			break;
		case "New Note":
			GuidewireAutomate("New_Note", New_Note, "click", "");
			break;

		case "New Document":
			GuidewireAutomate("New_Document", New_Document, "click", "");
			break;

		case "New Email":
			GuidewireAutomate("New_Email", New_Email, "click", "");
			break;
		case "New Activity":
			GuidewireAutomate("New_Activity", New_Activity, "click", "");
			break;
		case "Copy Submission":

			break;
		case "Move Policies to this Account":
			GuidewireAutomate("Move_Policies_to_this_Account", Move_Policies_to_this_Account, "click", "");

		case "Rewrite Policires to this Account":
			GuidewireAutomate("Rewrite_Policires_to_this_Account", Rewrite_Policires_to_this_Account, "click", "");
			break;
		case "Merge Account into this Account":
			GuidewireAutomate("Merge_Account_into_this_Account", Merge_Account_into_this_Account, "click", "");
			break;
		case "Account File":
			break;
		case "Policy File":
			break;
		case "Pre Renewal Direction":
			break;
		case "Spin-off Policy from this One":
			break;
		case "Split Policy into Two":
			break;
		case "Issue Policy":
			break;
		case "Cancel Policy":
			break;
		case "Change Policy":
			break;
		case "Renew Policy":
			break;
		case "Reinstate Policy":
			break;
		case "Rewrite Remainder of Term":
			break;
		case "Rewrite New Term":
			break;
		case "Rescind Cancellation":
			break;
		case "EnableorDisable":
			break;
		default:
			oExtentTest.addScreenCaptureFromPath(
					SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
			oExtentTest.log(Status.INFO, "Navigation to " + Menu + " is succesful");
			break;
		}
	}

	@Override
	public void gwBillingCenter_TabNavigation(String Tab, String Value) throws Throwable {

		switch (Tab) {

		case "Account":
			GuidewireAutomate("Account", Tab_Account, "click", "Null");
			GuidewireAutomate("NewAccount", AccountTab_NewAccount, "click", "Null");
			break;

		default:
			oExtentTest.addScreenCaptureFromPath(
					SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
			oExtentTest.log(Status.INFO, "Navigation to " + Tab + " is succesful");
			break;
		}

	}

	public void gwBillingCenter_MenuNavigation(String Menu) throws Throwable {
		switch (Menu) {
		case "NewAccount":
			// ------> Verifying the page -
			Assert.assertEquals(getText_Element(AccountSummary), "Accounts");
			GuidewireAutomate("Actions", Menu_Actions, "click", "");
			GuidewireAutomate("NewAccount", Actions_NewAccount, "click", "");
			break;
		case "NewPolicy":
			// Navigation to NewPolicy
			GuidewireAutomate("Actions", Menu_Actions, "click", "");
			GuidewireAutomate("NewPolicy", Actions_NewPolicy, "click", "");
			break;
		case "History":
			GuidewireAutomate("History", AS_HistoryLink, "click", "Null");
			break;
		case "Invoice":
			GuidewireAutomate("Invoices", AS_InvoicesLink, "click", "Null");
			Assert.assertEquals(getText_Element(InvoiceHeader), "Invoices");

			break;
		case "x":
		case "y":
		case "z":

		default:
			oExtentTest.addScreenCaptureFromPath(
					SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
			oExtentTest.log(Status.INFO, "Navigation to " + Menu + " is succesful");
			break;
		}

	}

	@Override
	public void gwClaimsCenter_MenuNavigation(String Menu) throws Throwable {
		switch (Menu) {

		case "x":
			break;

		case "y":
			break;

		case "z":
			break;

		default:
			oExtentTest.addScreenCaptureFromPath(
					SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
			oExtentTest.log(Status.INFO, "Navigation to " + Menu + " is succesful");
			break;
		}
	}

	@Override
	public void gwClaimsCenter_TabNavigation(String Tab, String Value) throws Throwable {
		switch (Tab) {
		case "NewClaim":
			GuidewireAutomate("ClaimTab", ClaimTab, "click", "Null");
			GuidewireAutomate("ClaimTab_NewClaim", ClaimTab_NewClaim, "click", "Null");
			break;
		default:
			oExtentTest.addScreenCaptureFromPath(
					SeleniumWebDriver_Commands.getScreenShot_addScreenCaptureFromPath(driver));
			oExtentTest.log(Status.INFO, "Navigation to " + Tab + " is succesful");
			break;
		}
	}

}
