package com.cucumber.practice.model;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage<V> {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[contains(@class,'search-global-typeahead__input')]")
	WebElement searchPlaceHolder;
	
	@FindBy(xpath="//li-icon[@class='artdeco-button__icon' and @type='caret-filled-down-icon']")
	List<WebElement> experienceLevel;
	
	@FindBy(xpath="//input[@id='experience-4' and @type='checkbox' and @class='search-s-facet-value__input']//following::label")
	List<WebElement> checkBoxExperienceLevel;
	
	@FindBy(xpath="//button[contains(@class,'facet-collection-list__apply-button ml2 artdeco-button')]")
	List<WebElement> applyButton;
	
	@FindBy(xpath="//span[@class='artdeco-button__text']//descendant::span")
	WebElement clearValue;
	
	@FindBy(xpath="//span[text()='Full-time']")
	WebElement jobTypeFullCheckBox;
	
	@FindBy(xpath="//span[text()='All filters']")
	WebElement allFilters;
	
	@FindBy(xpath="//div[@id='nav-settings__dropdown']")
	WebElement profileDropDown;
	
	@FindBy(xpath="//a[text()='Sign out']")
	WebElement signOutButton;
	
	@FindBy(xpath="//div[@class='search-global-typeahead__controls']//button")
	WebElement searchIcon;
	
	@FindBy(xpath="//span[text()='Apply']//parent::button[contains(@class,'search-advanced-facets__button--apply ml4 mr2 artdeco-button artdeco-button--3 artdeco-button--primary ember-view')]")
	WebElement appl;
	
	public SearchPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void waitForPageToLoad(){
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
	public void enterSearchBoxTextAndClick() throws InterruptedException{
		waitForPageToLoad();
		searchPlaceHolder.click();
		searchPlaceHolder.sendKeys("sales in Jobs");
		searchIcon.click();
	}
	
	public void clickExperienceLevelAndSelectMidSeniorLevel() throws InterruptedException {
		experienceLevel.get(3).click();
		checkBoxExperienceLevel.get(0).click();
	}
	
	public void clickApplyButton() {
		applyButton.get(3).click();
	}
	
	public void clickApplyButton1() {
		appl.click();
	}
	
	public void clickProfileButtonToSignOut() throws InterruptedException{
		profileDropDown.click();
		signOutButton.click();
	}
	
	public void clickOnAllFiltersToSelectFullTimeOption() throws InterruptedException{
		allFilters.click();
		jobTypeFullCheckBox.click();
	}
	
	public String getFiltersAppliedCount(){
		return clearValue.getText();
	}
}
