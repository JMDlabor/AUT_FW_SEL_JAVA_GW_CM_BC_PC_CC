package com.pages.Guidewire.BillingCenter;

import org.openqa.selenium.By;

public interface BillingCenter_AccountDetails_PO {
	final By AD_Header=By.xpath("//div[@id='AccountDetailSummary-AccountDetailSummaryScreen-ttlBar']//div[ @class='gw-TitleBar--title']");

	/*
	 * 	AD Account Basics
	 * 
	 */
	final By AD_AB_AccountNumber=By.xpath("//div[@id='AccountDetailSummary-AccountDetailSummaryScreen-AccountDetailDV-AccountNumber']//div[@class='gw-value-readonly-wrapper']");
	final By AD_AB_AccountName=By.xpath("//div[@id='AccountDetailSummary-AccountDetailSummaryScreen-AccountDetailDV-AccountName']//div[@class='gw-value-readonly-wrapper']");
	final By AD_AB_AccountType=By.xpath("//div[@id='AccountDetailSummary-AccountDetailSummaryScreen-AccountDetailDV-AccountType']//div[@class='gw-label']");
	final By AD_AB_Currency=By.xpath("//div[contains(@id,'AccountDetailDV-Currency')]//div[@class='gw-value']//div[@class='gw-label']");
	final By AD_AB_CreationDate=By.xpath("//div[@id='AccountDetailSummary-AccountDetailSummaryScreen-AccountDetailDV-CreationDate']//div[@class='gw-value-readonly-wrapper']");
	final By AD_AB_ServiceTier=By.xpath("//select[contains(@name,'NewAccountDV-CustomerServiceTier')]");
	final By AD_AB_SecurityZone=By.xpath("//select[contains(@name,'NewAccountDV-SecurityZone')]");

	/*
	 * AD Contact Info
	 * 
	 */
	final By AD_CI_PrimaryContact=By.xpath("//div[@id='AccountDetailSummary-AccountDetailSummaryScreen-AccountDetailDV-PrimaryContact']//div[@class='gw-value-readonly-wrapper']");
	final By AD_CI_Address=By.xpath("//div[contains(@id,'AccountDetailDV-Address')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	final By AD_CI_Phone=By.xpath("//div[contains(@id,'AccountDetailDV-Phone')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	final By AD_CI_Email=By.xpath("//div[@id='AccountDetailSummary-AccountDetailSummaryScreen-AccountDetailDV-Email']//div[@class='gw-value-readonly-wrapper']");

	/*
	 * AD Account Totals
	 * 
	 */
	final By AD_AT_TotalUnbilled=By.xpath("//div[@id='AccountDetailSummary-AccountDetailSummaryScreen-AccountDetailDV-AccountUnbilledAmount']//div[@class='gw-value-readonly-wrapper']");
	final By AD_AT_TotalCurrentlyBilled=By.xpath("//div[@id='AccountDetailSummary-AccountDetailSummaryScreen-AccountDetailDV-AccountCurrentAmountBilled_Input']//div[@class='gw-value-readonly-wrapper']");

	/*
	 * AD Policy Totals
	 * 
	 */ 
	final By AD_PT_TotalUnbilled=By.xpath("//div[contains(@id,'PoliciesUnbilledAmount')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	final By AD_PT_TotalValue=By.xpath("//div[contains(@id,'PoliciesTotalValue')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");

	/*
	 * AD Unapplied Funds
	 * 
	 */ 
	final By AD_UF_UnappliedAmount=By.xpath("//div[contains(@id,'AccountDetailDV-UnappliedAmount_Input')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	/*
	 *  AD Collateral
	 */
	final By AD_C_CollateralStatus=By.xpath("//div[contains(@id,'AccountDetailDV-CollateralStatus')]//div[@class='gw-value']//div[@class='gw-link gw-label']");
	/*
	 *  AD Payment Allocation
	 */
	final By AD_PA_PaymentAllocationPlan=By.xpath("//div[contains(@id,'AccountDetailDV-PaymentAllocationPlan')]//div[@class='gw-value']//div[@class='gw-ActionValueWidget']");
	/*
	 *  AD Billing Info
	 */
	final By AD_BI_BillingPlan=By.xpath("//div[contains(@id,'AccountDetailDV-BillingPlan')]//div[@class='gw-value']//div[@class='gw-ActionValueWidget']");
	final By AD_BI_FixBillDateDueDate=By.xpath("//div[contains(@id,'AccountDetailDV-dueDateBilling')]//div[@class='gw-value']//div[@class='gw-label']");
	final By AD_BI_SendInvoicesBy=By.xpath("//div[contains(@id,'SendInvoicesBy')]//div[@class='gw-value']//div[@class='gw-label']");
	final By AD_BI_PaymentInstrument=By.xpath("//div[contains(@id,'DefaultPaymentInstrument')]//div[@class='gw-value']//div[@class='gw-label']");


	/*
	 *  AD Invoicing Dates
	 */
	final By AD_ID_DayofMonth=By.xpath("//div[contains(@id,'InvoiceDayOfMonth_Input')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	final By AD_ID_DayofWeek=By.xpath("//div[contains(@id,'InvoiceDayOfWeek')]//div[@class='gw-value']//div[@class='gw-label']");
	final By AD_ID_AnchorDate=By.xpath("//div[contains(@id,'EveryOtherWeekInvoiceAnchorDate')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	final By AD_ID_FirstInvoiceDayofMonth=By.xpath("//div[contains(@id,'FirstTwicePerMonthInvoiceDayOfMonth')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");
	final By AD_ID_SecondInvoiceDayofMonth=By.xpath("//div[contains(@id,'SecondTwicePerMonthInvoiceDayOfMonth')]//div[@class='gw-value']//div[@class='gw-value-readonly-wrapper']");


	/*
	 *  AD Billing Level Settings
	 */
	final By AD_BLS_BillingLevel=By.xpath("//div[contains(@id,'BillingLevelInvoiceByAccount')]//div[@class='gw-value']//div[@class='gw-label']");
	final By AD_BLS_CashSeparation=By.xpath("//div[contains(@id,'BillingLevelSeparateIncomingFundsByAccount')]//div[@class='gw-value']//div[@class='gw-label']");

	/*
	 *  AD Open Policy Status
	 */
  final By AD_OPS_PolicyNumber=By.xpath("//div[contains(@id,'AccountPoliciesLV-0-PolicyNumber')]//div[@class='gw-ActionValueWidget']");
  final By AD_OPS_PaymentStatus=By.xpath("//div[contains(@id,'PolicyStatus')]//div[@class='gw-value-readonly-wrapper']");
  final By AD_OPS_EffectiveDate=By.xpath("//div[contains(@id,'PolicyPerEffDate')]//div[@class='gw-value-readonly-wrapper']");
  final By AD_OPS_ExpirationDate=By.xpath("//div[contains(@id,'PolicyPerExpirDate')]//div[@class='gw-value-readonly-wrapper']");

}
