package com.Test.Guidewire.PolicyCenter;

import org.testng.annotations.Test;

import com.Utils.Selenium.GW_GetDriver;
import com.pages.Guidewire.GW_CM_PC_BC_CC_Login;
import com.pages.Guidewire.GW_CM_PC_BC_CC_TabNavigation;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Coverages;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Drivers;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Forms;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Payments;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyInfo;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_PolicyReview;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Qualification;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Quote;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Reusable;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_RiskAnalysis;
import com.pages.Guidewire.PersonalAuto.PersonalAuto_Vehicles;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_AccountSummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_PolicySummary;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_Resuables;
import com.pages.Guidewire.PolicyCenter.PolicyCenter_SubmissionBound;

public class GW_PC_PersonalAuto_Submission extends GW_GetDriver {

	@Test(enabled = false)
	public void AUT_PA_PC_Newsubmission_1_BasicProgram() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");
		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_Newsubmission_2_StandardProgram() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		// strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_Newsubmission_3_PremiumProgram() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test
	public void AUT_PA_PC_NewSubmission_13_AddressAdd() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("ADD");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_14_AddressMod() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("EDIT");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_22_VehicleInfoMod() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_23_CoveragesAdd() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_26_Priorpoliciesentry() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_27_PriorpoliciesMod() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_29_Priorlossesentry() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_30_PriorlossesMod() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_32_UWIssuesapproval() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_33_PolicyDetailsReview() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_35_Billingtype() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_36_Schedule() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_37_Premium() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_38_Accoun_NewSubmission() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_43_NewSubmissionscreen_Single_FullApplication() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_44_NewSubmissionscreen_Single_FA_DefaultbaseState() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_45_NewSubmissionscreen_Single_FA_Defaulteffectivedate() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_46_NewSubmissionscreen_Single_QuickQuote() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_47_NewSubmissionscreen_Single_QQ_DefaultbaseState() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_48_NewSubmissionscreen_Single_QQ_Defaulteffectivedate() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_49_NewSubmissionscreen_Single_QQ_DriverInfoAdd() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_50_NewSubmissionscreen_Single_QQ_DriverInfoRemove() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_65_DriverInfoAdd_ExistingDriver() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_71_VehicleInfoAdd_AdditionalInterest_Othercontacts() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_72_AdditionalCoverages_Add() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_75_ExclusionandCondition_Add() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_77_AddUWIssue() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_78_AddContingency() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_80_MVRReportDetails() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_81_RequestApproval() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_82_LockforReview() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_85_ReleaseLock() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_87_Quote_Closeoptions() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_88_Bindoption_Bindonly() throws Throwable {

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}

	@Test(enabled = false)
	public void AUT_PA_PC_NewSubmission_89_SubmissionBound_PolicynumberValidation() throws Throwable

	{

		GW_CM_PC_BC_CC_Login.login_PolicyCenter();
		PolicyCenter_Resuables.pcTabNavigation_Acct_Search();
		PolicyCenter_AccountSummary.detail_Verify();

		GW_CM_PC_BC_CC_TabNavigation.pcMenuNavigation("New Submission");
		PolicyCenter_Resuables.newSubmissions_Verify();
		PersonalAuto_Reusable.newSubmission_SelectLOB_PersonalAuto(); // select LOB

		strAccountName = PolicyCenter_Resuables.infoBar("AccountName");
		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strSubmissionNumber = PolicyCenter_Resuables.infoBar("SubmissionNumber");

		PolicyCenter_Resuables.offering();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Qualification.qualification();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyInfo.primaryNamedInsured();
		PersonalAuto_PolicyInfo.pi_OfficialID();
		PersonalAuto_PolicyInfo.policyDetails();
		PersonalAuto_PolicyInfo.affinityGroup();
		PersonalAuto_PolicyInfo.producerOfRecord();
		PersonalAuto_PolicyInfo.underWritingCompany();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Drivers.driver_Add_ExistingDriver();
		PersonalAuto_Drivers.driver_ContatDetails("VERIFY");
		PersonalAuto_Drivers.driver_Roles("EDIT"); //
		PersonalAuto_Drivers.driver_RetrieveMVR();
		PersonalAuto_Drivers.driver_Addresses("VERIFY");
		PersonalAuto_Drivers.driver_MotorVehicleRecord("VERIFY");

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Vehicles.createVehicles();
		PersonalAuto_Vehicles.assignDriver();
		// PersonalAuto_Vehicles.additionalInterest_Add_ExistingAdditionalInterest();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Coverages.coveragesAppliedtoallVehiclesIn("VERIFY");
		PersonalAuto_Coverages.coveragesAppliedperVehiclesIn("VERIFY");
		PersonalAuto_Coverages.additionalcoveragesAppliedtoallVehiclesIn("EDIT");
		PersonalAuto_Coverages.additionalcoveragesAppliedperVehiclesIn("EDIT");
		PersonalAuto_Coverages.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_RiskAnalysis.addUWIssue();
		PersonalAuto_RiskAnalysis.approveUWIssues();
		PersonalAuto_RiskAnalysis.riskApprovalDetails(); //
		PersonalAuto_RiskAnalysis.addUWContingency(); //
		PersonalAuto_RiskAnalysis.priorPolicies_Add(); //
		// PersonalAuto_RiskAnalysis.priorLosses_Add();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_PolicyReview.policyDetails();
		PersonalAuto_PolicyReview.policyLevelCoverages();
		PersonalAuto_PolicyReview.vehicleLevelCoverages(); //
		PersonalAuto_PolicyReview.vehicleLevelCoverages_VehicleCoverages(); //
		PersonalAuto_PolicyReview.exclusionsAndConditions();

		PolicyCenter_Resuables.clickButton("Save Draft");
		PolicyCenter_Resuables.clickButton("Quote");
		PersonalAuto_Quote.quoteDetails();
		PersonalAuto_Quote.policyPremium_Garage1();
		PersonalAuto_Quote.policyPremium_Vehicle1();
		PersonalAuto_Quote.policyPremium_PremiumSubtotalandTaxes();
		strJob = PolicyCenter_Resuables.infoBar("Job");
		strLOB = PolicyCenter_Resuables.infoBar("LOB");
		strEffectiveDate = PolicyCenter_Resuables.infoBar("EffectiveDate");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");
		String strEditLock = PolicyCenter_Resuables.infoBar("EditLock");

		PolicyCenter_Resuables.clickButton("Release Lock");
		PersonalAuto_RiskAnalysis.releaseLock();

		PersonalAuto_Quote.quoteDetails();
		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Forms.pa_forms();

		PolicyCenter_Resuables.clickButton("Next");
		PersonalAuto_Payments.premiumSummary();
		PersonalAuto_Payments.payments();
		PersonalAuto_Payments.invoicing();
		PersonalAuto_Payments.billing();
		PersonalAuto_Payments.paymentSchedule();
		PersonalAuto_Payments.invoicingOverrides();
		PersonalAuto_Payments.payUsing();
		PersonalAuto_Payments.upFrontPayment();

		PolicyCenter_Resuables.clickButton("Bind Options");
		PolicyCenter_Resuables.clickButton("Bind Only");

		strAccountNumber = PolicyCenter_Resuables.infoBar("AccountNumber");
		strPolicyNumber = PolicyCenter_Resuables.infoBar("PolicyNumber");
		strUnderwriter = PolicyCenter_Resuables.infoBar("Underwriter");

		PolicyCenter_SubmissionBound.ViewYourPolicy();
		PolicyCenter_PolicySummary.detail_Verify();
		PolicyCenter_PolicySummary.account_Verify();

		// Logout PC
		GW_CM_PC_BC_CC_Login.logout_PolicyCenter();
	}
}
