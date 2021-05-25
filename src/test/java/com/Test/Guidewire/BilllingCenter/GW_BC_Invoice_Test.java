package com.Test.Guidewire.BilllingCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.GW_CM_PC_BC_CC_TabNavigation;
import com.pages.Guidewire.BillingCenter.BillingCenter_AccountDetails;
import com.pages.Guidewire.BillingCenter.BillingCenter_AccountDetails_PO;
import com.pages.Guidewire.BillingCenter.BillingCenter_AccountSummary;
import com.pages.Guidewire.BillingCenter.BillingCenter_AccountSummary_PO;
import com.pages.Guidewire.BillingCenter.BillingCenter_Contacts;
import com.pages.Guidewire.BillingCenter.BillingCenter_Invoices;
import com.pages.Guidewire.BillingCenter.BillingCenter_PolicyDetails;
import com.pages.Guidewire.BillingCenter.BillingCenter_PolicySummary;
import com.pages.Guidewire.BillingCenter.GW_BillingCenter_Resuables;

public class GW_BC_Invoice_Test extends GW_GetDriver {

	@Test
	public void GW_BC_Invoice() throws Throwable {

		try {

//			
//			GW_CM_PC_BC_CC_TabNavigation.bcMenuNavigation("New Account");
//			GW_BillingCenter_Resuables gr=new GW_BillingCenter_Resuables(driver,oExtentTest);
//			gr.bc_NewAccount();
//		  
//			GW_CM_PC_BC_CC_TabNavigation.bcMenuNavigation("Add Policy");
//		    gr.bc_NewPolicy();
			GW_CM_PC_BC_CC_Login.login_BillingCenter();
			GW_CM_PC_BC_CC_TabNavigation.bcTabNavigation("Account Search","NA");
			Thread.sleep(2000);
            GW_CM_PC_BC_CC_TabNavigation.bcMenuNavigation("New Direct Bill Payment");
            GW_BillingCenter_Resuables.DirectBillPayment();
            
			BillingCenter_AccountSummary.AccountSummary();
			GW_CM_PC_BC_CC_TabNavigation.bcMenuNavigation("Details");
			BillingCenter_AccountDetails.AD_AccountBasics_Verify();
			BillingCenter_AccountDetails.AD_ContactInfo_Verify();
			GW_CM_PC_BC_CC_TabNavigation.bcMenuNavigation("Contacts");
			BillingCenter_Contacts.C_ContactInfo_Verify();
			GW_CM_PC_BC_CC_TabNavigation.bcMenuNavigation("Funds Tracking");
			GW_BillingCenter_Resuables.FundsTracking();
			GW_CM_PC_BC_CC_TabNavigation.bcMenuNavigation("Payments");
			GW_BillingCenter_Resuables.Payments();
			GW_CM_PC_BC_CC_TabNavigation.bcMenuNavigation("Invoices");
			BillingCenter_Invoices.Invoices_InvoiceInformation_Edit();
			BillingCenter_Invoices.Invoices_InvoiceItems();
			BillingCenter_PolicySummary.PolicySummary_Overview();  

//  			GW_CM_PC_BC_CC_TabNavigation.bcMenuNavigation("Details");
//			BillingCenter_PolicyDetails.PD_PolicyBasics_Verify();
//			BillingCenter_PolicyDetails.PD_Charges_Verify();

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
			
  		     

			
			
			
			
//			gr.bc_AccountSummary_Invoices();
//			
			

			


			// ------> login_PolicyCenter
			/*
			 * lg.login_BillingCenter();
			 * 
			 * // ------> navigate to new account
			 * mn.gwBillingCenter_TabNavigation("Account","NA");
			 * 
		
			 * 
			 * // ------> New Policy gwPC.bc_NewPolicy_PolicyIssuanceWizard_Step1();
			 * 
			 * // ------> Verifying the page -
			 * gwPC.bc_NewPolicy_PolicyIssuanceWizard_Step2();
			 * 
			 * // ------> Verifying the bc_AccountSummary - gwPC.bc_AccountSummary();
			 * 
			 * // ------> bc_AccountSummary_Invoices gwPC.bc_AccountSummary_Invoices();
			 */

			// ------> logout_BillingCenter
			/*
			 * 
			 * 
			 * driver.quit();
			 */

	
	
	
}
