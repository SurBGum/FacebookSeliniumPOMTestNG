package com.facebook_loginPageWithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageFactoryRegistrationpage {
	WebDriver driver;

		public PageFactoryRegistrationpage(WebDriver driver) {
			super();
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
	/**
	 * @param driver
	 */
	
	
		@FindBy( how= How.XPATH,using="(//a[@role='button'])[2]" )
		private WebElement createAccount;
		
		public WebElement createNewAccount() {
			createAccount.click();
			return createAccount ;
		
		}
			
       @FindBy(how= How.NAME, using="firstname")
		private WebElement FirstName;
       public WebElement getFirstName(String enterFirstName) {
    	   FirstName.sendKeys(enterFirstName);
    	   return FirstName;
       }
		
		@FindBy(how= How.NAME,using="lastname")
		private WebElement LName;
		public WebElement getLastName (String enterlastname) {
			LName.sendKeys(enterlastname);
			return LName;
		}
		
	@FindBy(how=How.NAME,using="reg_email__")
			private WebElement Emadress;	
	
	public WebElement getEmailAdress(String Emailadress) {
		Emadress.sendKeys(Emailadress);
				return Emadress;
		
	}
	
	@FindBy(how=How.NAME,using="reg_email_confirmation__")
	private WebElement Emadress1;	

public WebElement getEmailAdress1(String Emailadress) {
Emadress1.sendKeys(Emailadress);
		return Emadress1;

}
	@FindBy(how=How.NAME, using="reg_passwd__")
	      private WebElement Pword;
	
	public WebElement getPassword (String enterPassword) {
		Pword.sendKeys(enterPassword);
		return Pword;	
		
		}
	@FindBy (how=How.ID,using="day")
	private WebElement Birthday;
	 
	public WebElement getDay(){
		Birthday.click();
		return Birthday;
	}
	@FindBy(how = How.ID, using = "day")
    private WebElement days;
    public WebElement getBirthdayMonth(String entermonth) {
        //WebElement months=driver.findElement(By.xpath("//*[@id=\"month\"]"));
        Select select = new Select(days);
        select.selectByVisibleText(entermonth);
        return days;
    }

		
	@FindBy (how=How.ID,using="month")
	private WebElement BMonth;
	 
	public WebElement getMonth(){
		BMonth.click();
		return BMonth;
		
		
	
	}@FindBy (how=How.ID,using="year")
	private WebElement BYear;
	 
	public WebElement getYear(){
		BYear.click();
		return BYear;
		
	
	}
	}	
		

