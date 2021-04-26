package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_Coverages_PO {

	final By PA_Coverages_Screen_titlebar = By.xpath("//div[contains(@id,'PersonalAutoScreen-ttlBar')]//div[1]//div");

	final By NewSubmisison_Screen_PALOB_Button = By.xpath("//div[contains(@id,'-8-addSubmission')]");

	// --->PA_Coverages_CheckBox tabs
	final By PA_Coverages_Tab = By.xpath("//div[contains(@id,'PersonalAutoScreen-CoveragesTab')]");
	final By PA_Coverages_AdditionalCoveragesTab = By
			.xpath("//div[contains(@id,'PersonalAutoScreen-AdditionalCoveragesTab')]");
	final By PA_Coverages_ExclusionsAndConditionsCardTab = By
			.xpath("//div[contains(@id,'PersonalAutoScreen-exclusionsAndConditionsCardTab')]");

	// --->PA_Coverages_CheckBox xpath
	final By PA_Coverages_Liability_Bodily_Injury_and_Property_Damage_CheckBox = By
			.xpath("//div[contains(@id,'0-CoverageInputSet-CovPatternInputGroup-_checkbox')]//input");
	final By PA_Coverages_Medical_Payments_CheckBox = By
			.xpath("//div[contains(@id,'1-CoverageInputSet-CovPatternInputGroup-_checkbox')]//input");
	final By PA_Coverages_Uninsured_Motorist_Bodily_Injury_CheckBox = By
			.xpath("//div[contains(@id,'2-CoverageInputSet-CovPatternInputGroup-_checkbox')]//input");
	final By PA_Coverages_Uninsured_Motorist_Property_Damage_CheckBox = By
			.xpath("//div[contains(@id,'3-CoverageInputSet-CovPatternInputGroup-_checkbox')]//input");
	final By PA_Coverages_Underinsured_Motorist_Property_Damage_CheckBox = By
			.xpath("//div[contains(@id,'4-CoverageInputSet-CovPatternInputGroup-_checkbox')]//input");
	final By PA_Coverages_Mexico_Coverage_Limited_CheckBox = By
			.xpath("//div[contains(@id,'5-CoverageInputSet-CovPatternInputGroup-_checkbox')]//input");
	final By PA_Coverages_Rental_Car_Loss_of_Use_CheckBox = By.xpath(
			"//div[contains(@id,'PALineAdditionalCoveragesDV-0-0-CoverageInputSet-CovPatternInputGroup-_checkbox')]//input");
	final By PA_Coverages_Coverage_CheckBox = By
			.xpath("//div[contains(@id,'CoveragePatternSearchResultsLV-_Checkbox')]//input");

	final By PA_Coverages_Auto_Liability_Package = By
			.xpath("//select[contains(@name,'CovPatternInputGroup-LiabilityTermInput')]");
	final By PA_Coverages_Medical_Limit = By.xpath("//select[contains(@name,'CovTermInputSet-OptionTermInput')]");
	final By PA_Coverages_Underinsured_Motorist_Property_Damage_Limit = By.xpath(
			"//select[contains(@name,'4-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput')]");
	final By PA_Coverages_Mexico_Coverage_Limited = By
			.xpath("//div[contains(@id,'5-CoverageInputSet-CovPatternInputGroup-_checkbox')]//input");
	final By PA_Coverages_Add_Exclusion_or_Condition = By.xpath("//div[text()='Add Exclusion or Condition']");
	final By PA_Coverages_Search_Exclusions_And_Conditions_for_Personal_Auto_Line_titlebar = By
			.xpath("//div[@id='CoveragePatternSearchPopup-CoveragePatternSearchScreen-ttlBar']//div[1]//div");
	final By PA_Coverages_Category = By.xpath("//select[contains(@name,'CoveragePatternSearchDV-CoverageCategory')]");
	final By PA_Coverages_Keyword = By.xpath("//div[contains(@id,'CoveragePatternSearchDV-Keyword')]//input");
	final By PA_Coverages_Condition_RadioButton = By
			.xpath("//input[contains(@id,'CoveragePatternSearchDV-SearchType_0')]");
	final By PA_Coverages_Exclusion_RadioButton = By
			.xpath("//input[contains(@id,'CoveragePatternSearchDV-SearchType_1')]");
	final By PA_Coverages_ExclusionandCondition = By
			.xpath("//input[contains(@id,'CoveragePatternSearchDV-SearchType_2')]");
	final By PA_Coverages_Coverages_applied_per_vehicle_in_alaska_titlevalidation = By
			.xpath("//div[text()='Coverages applied to all vehicles in Alaska']");
	final By PA_Coverages_Rental_Car_Loss_of_Use_Limit = By
			.xpath("//select[contains(@name,'CovTermInputSet-OptionTermInput')]");

	final By PA_Coverages_SearchButton = By.xpath("//div[contains(@id,'SearchLinksInputSet-Search')]");
	final By PA_Coverages_Add_Selected_Exclusions_And_Conditions_button = By
			.xpath("//div[contains(@id,'AddCoverageButton')]");

	void pa_Coverages() throws Throwable;

	void CoveragesAppliedtoallvehicles(String testingType) throws Throwable;

	void AdditionalCoverages(String testingType) throws Throwable;

	void ExclusionsAndConditions(String testingType) throws Throwable;

	void SearchAddExclusionorCondition(String testingType) throws Throwable;

}
