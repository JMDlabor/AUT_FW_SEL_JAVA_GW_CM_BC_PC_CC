package com.pages.Guidewire.PersonalAuto;

import org.openqa.selenium.By;

public interface PersonalAuto_NewSubmission_ReusablePO {

	final By Screen_Header = By.xpath("//div[contains(@class,'gw-isScreenTitle')]//div[@class='gw-TitleBar--title']");

	final By LOB_PersonalAuto = By.xpath(
			"//div[text()='Personal Auto']/ancestor::td[contains(@id,'Name_Cell')]/preceding-sibling::td//div[contains(@id,'ProductSelection') and text()='Select']");

	final By Qualification_Screen_Header = By.xpath("div[class='gw-TitleBar--title']");
	final By QU_IsApplicantCurrentlyInsured = By
			.xpath("//select[contains(@name,'QuestionSetLV-0-QuestionModalInput-ChoiceSelectInput_NoPost')]");
	final By QU_IsApplicantLicenseCurrently_suspended_canceled_Revoked = By
			.xpath("//input[contains(@id,'QuestionSetLV-1-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	final By QU_Has_the_applicants_license_ever_been_canceled_suspended_or_revoked = By
			.xpath("//input[contains(@id,'QuestionSetLV-2-QuestionModalInput-BooleanRadioInput_NoPost_1')]");
	final By QU_Anydriverswithconvictionsformovingtrafficviolationswithinthepast3years = By
			.xpath("//input[contains(@id,'QuestionSetLV-3-QuestionModalInput-BooleanRadioInput_1')]");
	final By QU_Hasanypolicyorcoveragebeendeclined_canceled_NonRenewedduringtheprior3years = By
			.xpath("//input[contains(@id,'QuestionSetLV-4-QuestionModalInput-BooleanRadioInput_NoPost_1')]");

	void newSubmission_SelectLOB_PersonalAuto() throws Throwable;

	void qualification() throws Throwable;

	String getRandomVIN(String vingenerator) throws Throwable;
}
