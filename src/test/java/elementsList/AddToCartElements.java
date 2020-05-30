package elementsList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartElements {

	WebDriver driver;
	public AddToCartElements(WebDriver driver){
	this.driver=driver; 
	PageFactory.initElements(driver, this);}
	
           
			
			//email
			@FindBy(id = "email") 
		    private WebElement Email;
			
			public WebElement Email() {
		    	return Email;
		    }
			
			//password
			@FindBy(id = "passwd") 
		    private WebElement password;
			
			public WebElement password() {
		    	return password;
		    }
			
			 //Sign in
			@FindBy(xpath = "//a[@class='login']") 
		    private WebElement SignIn;
			//div[@id='nav-signin-tooltip']//a//span[contains(text(),'Sign in')]
			public WebElement SignIn() {
		    	return SignIn;
		    }
	
			//SearchBar
			@FindBy(id = "search_query_top") 
		    private WebElement SearchBar;
			
			public WebElement SearchBar() {
		    	return SearchBar;
		    }
			
			//SubmitButton
			@FindBy(xpath = "//button[@name='submit_search']") 
		    private WebElement SubmitButton;
			
			public WebElement SubmitButton() {
		    	return SubmitButton;
		    }
			
			//SubmitButton
			@FindBy(id = "SubmitLogin") 
		    private WebElement SubmitLogin;
			
			public WebElement SubmitLogin() {
		    	return SubmitLogin;
		    }
			
			//AddToCart
			@FindBy(id = "add_to_cart") 
		    private WebElement AddToCart;
			
			public WebElement AddToCart() {
		    	return AddToCart;
		    }
			 
			//Printed Chiffon Dress
			@FindBy(xpath = "//div[@class='right-block']//a[@class='product-name'][contains(text(),'Printed Chiffon Dress')]") 
		    private WebElement PrintedChiffonDress;
			
			public WebElement PrintedChiffonDress() {
		    	return PrintedChiffonDress;
		    }
}
