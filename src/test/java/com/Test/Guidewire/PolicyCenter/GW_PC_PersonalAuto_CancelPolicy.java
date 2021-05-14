package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.GW_CM_PC_BC_CC_TabNavigation;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_SubmissionBound;

public class GW_PC_PersonalAuto_CancelPolicy extends GW_GetDriver {

	@Test

	public void AUT_PA_PC_CancelPolicy_01() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Policy_Search();
		// PolicyCenter_PolicySummary.detail_Verify();
		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("Cancel Policy");
		PolicyCenter_Resuables.startCancellationForPolicy();
		PolicyCenter_Resuables.Confirmation();
		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Cancel Now");
		PolicyCenter_SubmissionBound.Cancellation_ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strJob = PolicyCenter_Resuables.infoBar("Status");
		

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
	
	public void AUT_PA_PC_CancelPolicy_03() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Policy_Search();
		// PolicyCenter_PolicySummary.detail_Verify();
		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("Cancel Policy");
		PolicyCenter_Resuables.startCancellationForPolicy();
		//PolicyCenter_Resuables.VerifyCancellationerros();
		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strJob = PolicyCenter_Resuables.infoBar("Status");
		

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

}
