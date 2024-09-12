package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Objects {
	
	WebDriver driver;
	String TypeOFPayment;
	    Objects(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	
	}

//Login Page
@FindBy (how = How.XPATH , using="//input[@placeholder='Enter your Company ID']")
WebElement Company;
@FindBy (how = How.XPATH , using="//input[@placeholder='Enter your username']")
WebElement UserName;
@FindBy (how = How.XPATH , using="//input[@placeholder='Enter your password']")
WebElement Password;
@FindBy (how = How.XPATH , using="//button[normalize-space()='Sign in']")
WebElement SignIn;

//Tresury Link
@FindBy (how = How.XPATH , using="//span[normalize-space()='Treasury Link']")
WebElement TreasuryLink;

//DashBordPage
@FindBy (how = How.XPATH , using="//h1[normalize-space()='Dashboard']")
WebElement Dashboard;

@FindBy (how = How.XPATH , using="//a[normalize-space()='Payments']")
WebElement Payments;

@FindBy (how = How.XPATH , using="//h2[normalize-space()='Create ACH Payments'][1]//ancestor::ol-container//span[normalize-space()='CCD']//parent::a")
WebElement CCD;

@FindBy (how = How.XPATH , using="//Label[normalize-space()='Company Entry Description']//ancestor::div[@class='form-group row']//input")
WebElement CompanyEntryDesc;

@FindBy (how = How.XPATH , using="//span[contains(text(),'Originating Account')]//ancestor::ol-dropdown")
WebElement OriginatingAccount;

@FindBy (how = How.XPATH , using="//span[contains(text(),'******3500 - USD')]")
WebElement OriginatingAccountSub;

@FindBy (how = How.XPATH , using="//label[contains(text(),'ACH Company ID')]//ancestor::ol-form-group//ol-dropdown")
WebElement OriginatingACHCompanyID;

@FindBy (how = How.XPATH , using="//span[contains(text(),'3STLCO3500 - STLsantanderCo3')]")
WebElement OriginatingACHCompanyIDSub;

@FindBy (how = How.ID , using="btnSelectRecipients")
WebElement SelectRecipientButton;

@FindBy (how = How.XPATH , using="(//div[@class='modal-content']//div[@class='checkinput-inner-container'])[2]")
WebElement SelectRecipient;

@FindBy (how = How.XPATH , using="//span[text()='Done']")
WebElement Done;

@FindBy (how = How.XPATH , using="//input[contains(@name,'recipientAmount')]")
WebElement RecipientAmount;

@FindBy (how = How.ID , using="btnContinue")
WebElement Continue;

@FindBy (how = How.ID , using="btnSubmit")
WebElement Submit;


}
